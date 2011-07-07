package consorzio.controller.TuttiProdotti;

import org.slim3.controller.Controller;
import org.slim3.controller.Navigation;

import consorzio.service.TuttiProdottiService;

public class IndexController extends Controller {
    
    @Override
    public Navigation run() throws Exception {
        
        requestScope("listTuttiProdotti", (new TuttiProdottiService()).getTuttiProdotti());
        return forward("index.jsp");
    }
}
