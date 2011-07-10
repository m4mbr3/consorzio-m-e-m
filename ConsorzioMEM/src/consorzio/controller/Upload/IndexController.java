package consorzio.controller.Upload;

import org.slim3.controller.Controller;
import org.slim3.controller.Navigation;
import org.slim3.controller.upload.FileItem;

import consorzio.service.ProdottoService;
import consorzio.service.TuttiProdottiService;
import consorzio.service.UploadService;

public class IndexController extends Controller {
    private UploadService service = new UploadService();
    @Override
    public Navigation run() throws Exception {
        if(asKey("key")!=null)
        {
            ProdottoService p = new ProdottoService();
            requestScope("Prodotto", p.getProdotto(asKey("key")));
            return forward("image.jsp");
        }
        else
        {
            TuttiProdottiService p = new TuttiProdottiService();
            requestScope("listTuttiProdotti", p.getTuttiProdotti());
            return forward("index.jsp");
        }
    }
}
