package consorzio.controller.Upload;

import org.slim3.controller.Controller;
import org.slim3.controller.Navigation;



import consorzio.meta.ImmagineMeta;
import consorzio.model.Immagine;
import consorzio.service.UploadService;

public class DownloadController extends Controller {
    private UploadService service = new UploadService();
    private ImmagineMeta meta = ImmagineMeta.get();
    @Override
    public Navigation run() throws Exception {
        Immagine data = service.getData(asKey(meta.key), asLong(meta.version));
        byte[] bytes = service.getBytes(data);
        download(data.getNome(),bytes);
        return null;
    }
}
