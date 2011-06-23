package consorzio.service;

import java.util.List;
import java.util.Map;

import org.slim3.datastore.Datastore;
import org.slim3.util.BeanUtil;

import consorzio.meta.ProdottoMeta;
import consorzio.model.Prodotto;

import com.google.appengine.api.datastore.Transaction;

public class ProdottoService {
    private ProdottoMeta p = new ProdottoMeta();

    public Prodotto tweet(Map<String, Object> input) {
        Prodotto prodotto = new Prodotto();
        BeanUtil.copy(input, prodotto);
        Transaction tx = Datastore.beginTransaction();
        Datastore.put(prodotto);
        tx.commit();
        return prodotto;
    }
    //per la lista dei prodotti prendendo dal datastore
    public List<Prodotto> getListaProdotti() {
        return Datastore.query(p).sort(p.Nome.asc).asList();
    }
    
}
   