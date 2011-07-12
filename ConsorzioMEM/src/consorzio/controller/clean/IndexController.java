package consorzio.controller.clean;

import java.util.List;

import org.slim3.controller.Controller;
import org.slim3.controller.Navigation;
import org.slim3.datastore.Datastore;

import consorzio.meta.ProdottoMeta;
import consorzio.meta.RicettaMeta;
import consorzio.model.Prodotto;
import consorzio.model.Ricetta;
import consorzio.service.ProdottoService;
import consorzio.service.RicettaService;
import consorzio.service.TutteRicetteService;

public class IndexController extends Controller {
    RicettaMeta s = RicettaMeta.get();
    ProdottoService q = new ProdottoService();
    @Override
    public Navigation run() throws Exception {
        if(asKey("key")!= null)
        {
            Ricetta p = Datastore.query(s).filter(s.key.equal(asKey("key"))).asSingle();
            Prodotto s = q.getProdotto(p.getKey_product());
            s.setKey_ricetta(null);
            Datastore.delete(p.getKey());
            Datastore.put(s);
          
            return forward("index.jsp");
            
        }
        else{
            TutteRicetteService s = new TutteRicetteService();
            requestScope("Elementi",s.getTutteRicette());
            return forward("index.jsp");
        }
    }
}
