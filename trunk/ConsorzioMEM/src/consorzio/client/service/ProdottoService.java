package consorzio.client.service;

import java.util.List;

import com.google.appengine.api.images.Image;
import com.google.gwt.user.client.rpc.RemoteService;
import com.google.gwt.user.client.rpc.RemoteServiceRelativePath;
import consorzio.shared.model.Prodotto;

@RemoteServiceRelativePath("service.s3gwt")
public interface ProdottoService extends RemoteService {
    void Prodotto(String nome, String info, long prezzo,Image img, int qta);
    List<Prodotto> getListProdotto();

}
