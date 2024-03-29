package consorzio.service;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.slim3.controller.upload.FileItem;
import org.slim3.datastore.Datastore;
import org.slim3.util.ByteUtil;

import com.google.appengine.api.datastore.Key;
import com.google.appengine.api.datastore.Transaction;

import consorzio.meta.ImmagineFragmentMeta;
import consorzio.meta.ImmagineMeta;
import consorzio.model.Immagine;
import consorzio.model.ImmagineFragment;




public class UploadService {
    
    private static final int FRAGMENT_SIZE = 900000;

    private ImmagineMeta d = ImmagineMeta.get();

    private ImmagineFragmentMeta f = ImmagineFragmentMeta.get();

    public List<Immagine> getDataList() {
       return Datastore.query(d).asList();
    }

    public Immagine upload(FileItem formFile, Key key_pro, String descr) {
        if (formFile == null) {
          return null;
        }
        List<Object> models = new ArrayList<Object>();
        Immagine data = new Immagine();
        models.add(data);
        data.setKey(Datastore.allocateId(d));
        data.setNome(formFile.getShortFileName());
        data.setLength(formFile.getData().length);
        data.setKey_Product(key_pro);
        data.setDescr(descr);
        byte[] bytes = formFile.getData();
        byte[][] bytesArray = ByteUtil.split(bytes, FRAGMENT_SIZE);
        Iterator<Key> keys =
            Datastore
                .allocateIds(data.getKey(), f, bytesArray.length)
                .iterator();
        for (int i = 0; i < bytesArray.length; i++) {
            byte[] fragmentData = bytesArray[i];
            ImmagineFragment fragment = new ImmagineFragment();
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

    public Immagine getData(Key key, Long version) {
        return Datastore.get(d, key, version);
    }

    public byte[] getBytes(Immagine uploadedData) {
        if (uploadedData == null) {
            throw new NullPointerException(
                "The uploadedData parameter must not be null.");
        }
        List<ImmagineFragment> fragmentList =
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
