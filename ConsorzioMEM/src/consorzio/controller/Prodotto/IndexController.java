package consorzio.controller.Prodotto;

import java.util.List;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.slim3.controller.Controller;
import org.slim3.controller.Navigation;
import org.slim3.util.RequestLocator;
import org.slim3.util.ResponseLocator;
import org.slim3.util.ServletContextLocator;

import com.google.appengine.api.datastore.Key;

import consorzio.model.Prodotto;
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
