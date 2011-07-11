package consorzio.controller.UploadImmagineRicetta;

import org.slim3.controller.Controller;
import org.slim3.controller.Navigation;
import org.slim3.controller.upload.FileItem;

import com.google.appengine.api.datastore.Key;


import consorzio.model.Immagine;
import consorzio.service.UploadImmagineService;
import consorzio.service.UploadService;

public class UploadController extends Controller {
    private UploadImmagineService service = new UploadImmagineService();
    @Override
    public Navigation run() throws Exception {
        FileItem formFile = requestScope("formFile");
        service.upload(formFile,asKey("key"),asString("Descr"));
        return redirect(basePath);
        
    }
}
