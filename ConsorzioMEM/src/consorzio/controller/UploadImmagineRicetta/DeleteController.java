package consorzio.controller.UploadImmagineRicetta;

import org.slim3.controller.Controller;
import org.slim3.controller.Navigation;

import consorzio.meta.ImmagineMeta;
import consorzio.meta.ImmagineRicetteMeta;
import consorzio.model.Immagine;
import consorzio.service.UploadImmagineService;
import consorzio.service.UploadService;

import consorzio.service.UploadService;

public class DeleteController extends Controller {
    private UploadImmagineService service = new UploadImmagineService();
    private ImmagineRicetteMeta meta = ImmagineRicetteMeta.get();
    @Override
    public Navigation run() throws Exception {
        service.delete(asKey(meta.key));
        return redirect(basePath);
    }
}
