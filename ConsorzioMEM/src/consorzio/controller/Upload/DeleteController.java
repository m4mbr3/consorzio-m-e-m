package consorzio.controller.Upload;

import org.slim3.controller.Controller;
import org.slim3.controller.Navigation;

import consorzio.meta.ImmagineMeta;
import consorzio.model.Immagine;
import consorzio.service.UploadService;

import consorzio.service.UploadService;

public class DeleteController extends Controller {
    private UploadService service = new UploadService();
    private ImmagineMeta meta = ImmagineMeta.get();
    @Override
    public Navigation run() throws Exception {
        service.delete(asKey(meta.key));
        return redirect(basePath);
    }
}
