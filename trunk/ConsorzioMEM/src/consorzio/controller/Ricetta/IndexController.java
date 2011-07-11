package consorzio.controller.Ricetta;

import org.slim3.controller.Controller;
import org.slim3.controller.Navigation;

import consorzio.service.RicettaService;

public class IndexController extends Controller {

    private RicettaService service = new RicettaService();
    @Override
    public Navigation run() throws Exception {
        requestScope("Ricetta", service.getRicetta(asKey("key")));
        requestScope("NumeroImmagini",service.getNumeroImmagini(asKey("key")));
        requestScope("ListaImmagini",service.getListaImmagini(asKey("key")));
        return forward("index.jsp");
    }
}
