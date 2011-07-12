package consorzio.controller.Ricetta;

import org.slim3.controller.Controller;
import org.slim3.controller.Navigation;

import consorzio.model.Ricetta;
import consorzio.service.ProdottoService;
import consorzio.service.RicettaService;

public class IndexController extends Controller {

    private RicettaService service = new RicettaService();
    private ProdottoService serv = new ProdottoService();
    @Override
    public Navigation run() throws Exception {
        Ricetta r = service.getRicetta(asKey("key"));
       if(r.getKey_product()!= null) 
        if(serv.getProdotto(r.getKey_product())!= null)
            requestScope("Prodotto",serv.getProdotto(r.getKey_product()));
        
        requestScope("Ricetta", r);
        requestScope("NumeroImmagini",service.getNumeroImmagini(asKey("key")));
        requestScope("ListaImmagini",service.getListaImmagini(asKey("key")));
        return forward("index.jsp");
    }
}
