package consorzio.controller.Prodotto;


import org.slim3.controller.Controller;
import org.slim3.controller.Navigation;


import consorzio.model.Prodotto;
import consorzio.service.ProdottoService;
import consorzio.service.RicettaService;


public class IndexController extends Controller {
    
    private ProdottoService service = new ProdottoService();
    private RicettaService sevi = new RicettaService();
    @Override
    public Navigation run() throws Exception {
 
        Prodotto p = service.getProdotto(asKey("key"));
       if(p.getKey_ricetta()!= null)
        if(sevi.getRicetta(p.getKey_ricetta())!= null)
            requestScope("Ricetta",sevi.getRicetta(p.getKey_ricetta()));
        requestScope("Prodotto", p);
        requestScope("NumeroImmagini",service.getNumeroImmagini(asKey("key")));
        requestScope("ListaImmagini",service.getListaImmagini(asKey("key")));
        return forward("index.jsp");
    }
}
