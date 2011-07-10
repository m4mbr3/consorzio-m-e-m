package consorzio.service;


import java.util.List;

import org.slim3.datastore.Datastore;

import consorzio.meta.ProdottoMeta;
import consorzio.model.Prodotto;


public class StagioneService {
    private ProdottoMeta p = ProdottoMeta.get();
    
    public List<Prodotto> getProdottiXStagione(String Stagione)
    {
        List<Prodotto> list;
        if(Stagione.equals("Inverno"))
            list = (List<Prodotto>) Datastore.query(p).filter(p.Inverno.equal(true)).asList();
        else if(Stagione.equals("Estate"))
            list = (List<Prodotto>) Datastore.query(p).filter(p.Estate.equal(true)).asList();
        else if(Stagione.equals("Autunno"))
            list = (List<Prodotto>) Datastore.query(p).filter(p.Autunno.equal(true)).asList();
        else
            list = (List<Prodotto>) Datastore.query(p).filter(p.Primavera.equal(true)).asList();
        
        return list;
    }
}
