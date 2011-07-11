package consorzio.service;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.slim3.controller.upload.FileItem;
import org.slim3.datastore.Datastore;
import org.slim3.util.ByteUtil;

import com.google.appengine.api.datastore.Key;
import com.google.appengine.api.datastore.Transaction;


import consorzio.meta.ImmagineRicetteFragmentMeta;
import consorzio.meta.ImmagineRicetteMeta;
import consorzio.model.ImmagineRicette;
import consorzio.model.ImmagineRicetteFragment;


public class UploadImmagineService {
    private static final int FRAGMENT_SIZE = 900000;

    private ImmagineRicetteMeta d = ImmagineRicetteMeta.get();

    private ImmagineRicetteFragmentMeta f = ImmagineRicetteFragmentMeta.get();

    public List<ImmagineRicette> getDataList() {
       return Datastore.query(d).asList();
    }

    public ImmagineRicette upload(FileItem formFile, Key key_ric, String descr) {
        if (formFile == null) {
          return null;
        }
        List<Object> models = new ArrayList<Object>();
        ImmagineRicette data = new ImmagineRicette();
        models.add(data);
        data.setKey(Datastore.allocateId(d));
        data.setNome(formFile.getShortFileName());
        data.setLength(formFile.getData().length);
        data.setKey_Ricette(key_ric);
        data.setDescr(descr);
        byte[] bytes = formFile.getData();
        byte[][] bytesArray = ByteUtil.split(bytes, FRAGMENT_SIZE);
        Iterator<Key> keys =
            Datastore
                .allocateIds(data.getKey(), f, bytesArray.length)
                .iterator();
        for (int i = 0; i < bytesArray.length; i++) {
            byte[] fragmentData = bytesArray[i];
            ImmagineRicetteFragment fragment = new ImmagineRicetteFragment();
            models.add(fragment);
            fragment.setKey(keys.next());
            fragment.setBytes(fragmentData);
            fragment.setIndex(i);
            fragment.getUploadDataRef().setModel(data);
        }
        Transaction tx = Datastore.beginTransaction();
        for (Object model : models) {
            Datastore.put(tx, model);
        }
        tx.commit();
        return data;
    }

    public ImmagineRicette getData(Key key, Long version) {
        return Datastore.get(d, key, version);
    }

    public byte[] getBytes(ImmagineRicette uploadedData) {
        if (uploadedData == null) {
            throw new NullPointerException(
                "The uploadedData parameter must not be null.");
        }
        List<ImmagineRicetteFragment> fragmentList =
            uploadedData.getFragmentListRef().getModelList();
        byte[][] bytesArray = new byte[fragmentList.size()][0];
        for (int i = 0; i < fragmentList.size(); i++) {
            bytesArray[i] = fragmentList.get(i).getBytes();
        }
        return ByteUtil.join(bytesArray);
    }

    public void delete(Key key) {
        Transaction tx = Datastore.beginTransaction();
        List<Key> keys = new ArrayList<Key>();
        keys.add(key);
        keys.addAll(Datastore.query(f, key).asKeyList());
        Datastore.delete(tx, keys);
        tx.commit();
    }
}
