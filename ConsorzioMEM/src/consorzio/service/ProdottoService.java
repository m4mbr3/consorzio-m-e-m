package consorzio.service;

import java.util.List;
import java.util.Map;

import org.slim3.datastore.Datastore;
import org.slim3.util.BeanUtil;

import consorzio.meta.ImmagineMeta;
import consorzio.meta.ProdottoMeta;
import consorzio.model.Immagine;
import consorzio.model.Prodotto;

import com.google.appengine.api.datastore.Key;
import com.google.appengine.api.datastore.Transaction;

public class ProdottoService {
    private ProdottoMeta p = ProdottoMeta.get();
    private ImmagineMeta i = ImmagineMeta.get();
    private UploadService service = new UploadService();
    
    
    public Prodotto getProdotto(Key key)
    {
        Prodotto prodotto = Datastore.query(p).filter(p.key.equal(key)).asSingle();
        return prodotto;
    }
    public int getNumeroImmagini(Key key)
    {
        List<Immagine> immagini = (List<Immagine>)Datastore.query(i).filter(i.key_Product.equal(key)).asList();
        return immagini.size();
    }
    public List<Immagine> getListaImmagini(Key key)
    {
        List<Immagine> immagini = (List<Immagine>)Datastore.query(i).filter(i.key_Product.equal(key)).asList();
        return immagini;
    }
}
   