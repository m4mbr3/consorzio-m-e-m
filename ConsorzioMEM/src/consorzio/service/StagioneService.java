package consorzio.service;


import java.util.List;

import org.slim3.datastore.Datastore;

import consorzio.meta.ProdottoMeta;
import consorzio.model.Prodotto;


public class StagioneService {
    private ProdottoMeta p = ProdottoMeta.get();
    
    public List<Prodotto> getProdottiXStagione(String Stagione)
    {
        
        List<Prodotto> list = (List<Prodotto>) Datastore.query(p).filter(p.Stagione.equal(Stagione)).asList();
        return list;
    }
}
