package consorzio.server.service;

import java.util.List;


import org.slim3.datastore.Datastore;

import com.google.appengine.api.images.Image;

import consorzio.client.service.ProdottoService;
import consorzio.server.meta.ProdottoMeta;
import consorzio.shared.model.Prodotto;


public class ProdottoServiceImpl implements ProdottoService {
    private ProdottoMeta p = new ProdottoMeta();

    public void Prodotto(String nome, String info, long prezzo,Image img, int qta) {
        Prodotto prod = new Prodotto();
        
        prod.setNome(nome);
        prod.setDescrizione(info);
        prod.setPrezzo(prezzo);

        prod.setQuantita(qta);
        
        Datastore.put(p);
    }
    
    public List<Prodotto> getListProd() {
        return Datastore.query(p).sort(p.dataCreato.desc).asList();
    }

    
    

    public List<consorzio.shared.model.Prodotto> getListProdotto() {
        // TODO Auto-generated method stub
        return null;
    }

}
