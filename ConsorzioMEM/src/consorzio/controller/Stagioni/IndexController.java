package consorzio.controller.Stagioni;



import java.util.List;

import org.slim3.controller.Controller;
import org.slim3.controller.Navigation;
import org.slim3.datastore.Datastore;



import consorzio.meta.ProdottoMeta;
import consorzio.model.Prodotto;

public class IndexController extends Controller {

    
    @Override
    public Navigation run() throws Exception {
       /* Prodotto pro = new Prodotto();
        pro.setStagione("Autunno");
        pro.setDescr("blablablablaprova");
        Datastore.put(pro);*/ 
        ProdottoMeta e = new ProdottoMeta().get();
        List<Prodotto> list = (List<Prodotto>) Datastore.query(e).filter(e.Stagione.equal("Autunno")).asList();
        requestScope("list", list);
        return forward("index.jsp");
    }
}
