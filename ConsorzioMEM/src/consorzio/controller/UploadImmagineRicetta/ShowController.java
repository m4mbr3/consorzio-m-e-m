package consorzio.controller.UploadImmagineRicetta;

import org.slim3.controller.Controller;
import org.slim3.controller.Navigation;

import consorzio.meta.ImmagineMeta;
import consorzio.model.Immagine;
import consorzio.model.ImmagineRicette;
import consorzio.service.UploadImmagineService;
import consorzio.service.UploadService;

public class ShowController extends Controller {
    private UploadImmagineService service = new UploadImmagineService();
    private ImmagineMeta meta = ImmagineMeta.get();
    
    @Override
    public Navigation run() throws Exception {
        ImmagineRicette data = service.getData(asKey(meta.key), asLong(meta.version));
        byte[] bytes = service.getBytes(data);
        show(data.getNome(), bytes);
        return null;
    }
}
