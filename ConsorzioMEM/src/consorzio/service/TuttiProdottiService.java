package consorzio.service;

import java.util.List;

import org.slim3.datastore.Datastore;

import consorzio.meta.ProdottoMeta;
import consorzio.model.Prodotto;


public class TuttiProdottiService {
    private ProdottoMeta p = ProdottoMeta.get();
    
    public List<Prodotto> getTuttiProdotti()
    {
        List<Prodotto> list = (List<Prodotto>) Datastore.query(p).sort(p.Nome.asc).asList();
        return list;
    }
    public List<Prodotto> getProdotti()
    {
        List<Prodotto> list = (List<Prodotto>) Datastore.query(p).sort(p.Nome.asc).filter(p.key_ricetta.equal(null)).asList();
        return list;
    }
}
