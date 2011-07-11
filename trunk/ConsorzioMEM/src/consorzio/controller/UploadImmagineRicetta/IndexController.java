package consorzio.controller.UploadImmagineRicetta;

import org.slim3.controller.Controller;
import org.slim3.controller.Navigation;
import org.slim3.controller.upload.FileItem;

import consorzio.service.ProdottoService;
import consorzio.service.RicettaService;
import consorzio.service.TutteRicetteService;
import consorzio.service.TuttiProdottiService;
import consorzio.service.UploadImmagineService;
import consorzio.service.UploadService;

public class IndexController extends Controller {
    private UploadImmagineService service = new UploadImmagineService();
    @Override
    public Navigation run() throws Exception {
        if(asKey("key")!=null)
        {
            RicettaService p = new RicettaService();
            requestScope("Ricetta", p.getRicetta(asKey("key")));
            return forward("image.jsp");
        }
        else
        {
            TutteRicetteService p = new TutteRicetteService();
            requestScope("listTutteRicette", p.getTutteRicette());
            return forward("index.jsp");
        }
    }
}
