package consorzio.client.service;

import java.util.List;

import com.google.appengine.api.images.Image;
import com.google.gwt.user.client.rpc.AsyncCallback;

import consorzio.shared.model.Prodotto;

public interface ProdottoServiceAsync {

    void Prodotto(String nome, String info, long prezzo, Image img, int qta,
            AsyncCallback<Void> callback);

    void getListProdotto(AsyncCallback<List<Prodotto>> callback);

}
