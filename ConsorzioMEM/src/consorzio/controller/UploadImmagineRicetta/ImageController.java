package consorzio.controller.UploadImmagineRicetta;

import javax.servlet.http.HttpServletResponse;

import org.slim3.controller.Controller;
import org.slim3.controller.Navigation;
import org.slim3.controller.upload.FileItem;
import org.slim3.util.ResponseLocator;

import consorzio.model.Immagine;
import consorzio.model.ImmagineRicette;
import consorzio.service.ProdottoService;
import consorzio.service.TuttiProdottiService;
import consorzio.service.UploadImmagineService;
import consorzio.service.UploadService;

public class ImageController extends Controller {
    private UploadImmagineService service = new UploadImmagineService();
    @Override
    public Navigation run() throws Exception {
        
            if(asKey("key")!=null)
            {
                    HttpServletResponse response = ResponseLocator.get();
                    byte[] bytes ;
                    ImmagineRicette data = service.getData(asKey("key"), asLong("v"));
                    bytes = service.getBytes(data);
                    response.getOutputStream().write(bytes);
                    return null;
            }
      return null;
    }
}
