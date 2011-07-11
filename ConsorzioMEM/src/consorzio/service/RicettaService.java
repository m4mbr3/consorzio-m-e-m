package consorzio.service;

import java.util.List;

import org.slim3.datastore.Datastore;

import com.google.appengine.api.datastore.Key;

import consorzio.meta.ImmagineMeta;
import consorzio.meta.ImmagineRicetteMeta;
import consorzio.meta.ProdottoMeta;
import consorzio.meta.RicettaMeta;
import consorzio.model.Immagine;
import consorzio.model.ImmagineRicette;
import consorzio.model.Prodotto;
import consorzio.model.Ricetta;


public class RicettaService {
    private RicettaMeta p = RicettaMeta.get();
    private ImmagineRicetteMeta i = ImmagineRicetteMeta.get();
    public Ricetta getRicetta(Key key)
    {
        Ricetta ricetta = Datastore.query(p).filter(p.key.equal(key)).asSingle();
        return ricetta;
    }
    public int getNumeroImmagini(Key key)
    {
        List<ImmagineRicette> immagini = (List<ImmagineRicette>)Datastore.query(i).filter(i.key_Ricette.equal(key)).asList();
        return immagini.size();
    }
    public List<ImmagineRicette> getListaImmagini(Key key)
    {
        List<ImmagineRicette> immagini = (List<ImmagineRicette>)Datastore.query(i).filter(i.key_Ricette.equal(key)).asList();
        return immagini;
    }

}
