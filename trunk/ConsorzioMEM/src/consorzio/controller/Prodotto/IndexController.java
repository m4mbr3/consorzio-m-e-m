package consorzio.controller.Prodotto;

import java.util.List;

import org.slim3.controller.Controller;
import org.slim3.controller.Navigation;

import consorzio.model.Prodotto;
import consorzio.service.ProdottoService;

public class IndexController extends Controller {
    
    private ProdottoService service = new ProdottoService();


    @Override
    public Navigation run() throws Exception {
      //  List<Prodotto> tweetList = service.getListaProdotti();
       // requestScope("tweetList", tweetList);
        
        //questo gay manda alla pagina WAR/Prodotto/Index
        return forward("index.jsp");
    }
}
