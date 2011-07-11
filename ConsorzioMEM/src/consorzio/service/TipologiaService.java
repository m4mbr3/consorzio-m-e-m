package consorzio.service;

import java.util.List;

import org.slim3.datastore.Datastore;

import consorzio.meta.ProdottoMeta;
import consorzio.meta.RicettaMeta;
import consorzio.model.Prodotto;
import consorzio.model.Ricetta;


public class TipologiaService {
private RicettaMeta r = RicettaMeta.get();
    
    public List<Ricetta> getRicettaXTipo(String tipo)
    {
        List<Ricetta> list;
        if(tipo.equals("Primo"))
            list = (List<Ricetta>) Datastore.query(r).filter(r.categoria.equal("Primo")).asList();
        else if(tipo.equals("Secondo"))
            list = (List<Ricetta>) Datastore.query(r).filter(r.categoria.equal("Secondo")).asList();
        else if(tipo.equals("Antipasto"))
            list = (List<Ricetta>) Datastore.query(r).filter(r.categoria.equal("Antipasto")).asList();
        else if(tipo.equals("PiattoUnico"))
            list = (List<Ricetta>) Datastore.query(r).filter(r.categoria.equal("PiattoUnico")).asList();
        else
            list = (List<Ricetta>) Datastore.query(r).filter(r.categoria.equal("Salse")).asList();
        
        return list;
    }
}
