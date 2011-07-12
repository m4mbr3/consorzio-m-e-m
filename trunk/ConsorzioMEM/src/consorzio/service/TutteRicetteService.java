package consorzio.service;

import java.util.List;

import org.slim3.datastore.Datastore;

import consorzio.meta.ProdottoMeta;
import consorzio.meta.RicettaMeta;
import consorzio.model.Prodotto;
import consorzio.model.Ricetta;


public class TutteRicetteService {
 private RicettaMeta r = RicettaMeta.get();
    
    public List<Ricetta> getTutteRicette()
    {
        List<Ricetta> list = (List<Ricetta>) Datastore.query(r).sort(r.nome.asc).asList();
        return list;
    }
    
}
