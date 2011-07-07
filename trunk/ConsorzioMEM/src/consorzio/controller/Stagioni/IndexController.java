package consorzio.controller.Stagioni;



import java.util.List;

import org.slim3.controller.Controller;
import org.slim3.controller.Navigation;
import org.slim3.datastore.Datastore;



import consorzio.meta.ProdottoMeta;
import consorzio.model.Prodotto;
import consorzio.service.StagioneService;

public class IndexController extends Controller {

    
    @Override
    public Navigation run() throws Exception {
       //Prodotto p = new Prodotto();
       // p.setDescr("asdakljhadfkjahsdfkjasd");
       // p.setNome("Ciao");
       // p.setStagione("Estate");
       // Datastore.put(p);
       // p.setStagione("Inverno");
       // Datastore.put(p);
       // p.setStagione("Primavera");
       // Datastore.put(p);*/
        requestScope("listAutunno", (new StagioneService()).getProdottiXStagione("Autunno"));
        requestScope("listEstate", (new StagioneService()).getProdottiXStagione("Estate"));
        requestScope("listInverno", (new StagioneService()).getProdottiXStagione("Inverno"));
        requestScope("listPrimavera", (new StagioneService()).getProdottiXStagione("Primavera"));
        return forward("index.jsp");
    }
}
