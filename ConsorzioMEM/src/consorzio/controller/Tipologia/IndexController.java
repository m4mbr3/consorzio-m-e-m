package consorzio.controller.Tipologia;

import org.slim3.controller.Controller;
import org.slim3.controller.Navigation;

import consorzio.service.TipologiaService;

public class IndexController extends Controller {

    @Override
    public Navigation run() throws Exception {
        requestScope("listPrimo", (new TipologiaService()).getRicettaXTipo("Primo"));
        requestScope("listSecondo", (new TipologiaService()).getRicettaXTipo("Secondo"));
        requestScope("listAntipasto", (new TipologiaService()).getRicettaXTipo("Antipasto"));
        requestScope("listSalse", (new TipologiaService()).getRicettaXTipo("Salse"));
        requestScope("listPiattoUnico", (new TipologiaService()).getRicettaXTipo("PiattoUnico"));
        return forward("index.jsp");
    }
}
