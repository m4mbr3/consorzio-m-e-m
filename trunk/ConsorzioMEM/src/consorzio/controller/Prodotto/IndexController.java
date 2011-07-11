package consorzio.controller.Prodotto;


import org.slim3.controller.Controller;
import org.slim3.controller.Navigation;


import consorzio.service.ProdottoService;


public class IndexController extends Controller {
    
    private ProdottoService service = new ProdottoService();
   
    @Override
    public Navigation run() throws Exception {
 
      
        requestScope("Prodotto", service.getProdotto(asKey("key")));
        System.out.println(service.getNumeroImmagini(asKey("key")));
        requestScope("NumeroImmagini",service.getNumeroImmagini(asKey("key")));
        requestScope("ListaImmagini",service.getListaImmagini(asKey("key")));
        return forward("index.jsp");
    }
}
