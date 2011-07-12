package consorzio.controller.UploadRicetta;

import org.slim3.controller.Controller;
import org.slim3.controller.Navigation;
import org.slim3.datastore.Datastore;

import consorzio.meta.ProdottoMeta;
import consorzio.meta.RicettaMeta;
import consorzio.model.Prodotto;
import consorzio.model.Ricetta;
import consorzio.service.ProdottoService;
import consorzio.service.TuttiProdottiService;

public class IndexController extends Controller {

    @Override
    public Navigation run() throws Exception {
       
        if(asString("Carica")!= null)
        {
            if(asString("Carica").equals("Carica"))
            {
                Ricetta r = new Ricetta();
              if(asString("Nome")!=null)
                r.setNome(asString("Nome"));
              if(asString("Descr")!=null)
                r.setDescr(asString("Descr"));
              if(asString("ingredienti")!= null)
                  r.setIngredienti(asString("ingredienti"));
              if(asString("preparazione")!= null)
                  r.setPreparazione(asString("preparazione"));
              if(asString("consigli")!= null)
                  r.setConsigli(asString("consigli"));
              
              if(asString("Categoria")!=null)
                  r.setCategoria(asString("Categoria"));
              
              if(asString("key")!=null)
                  r.setKey_product(asKey("key"));
              
              if(asString("Ricetta")!= null)
                  r.setRicetta(asString("Ricetta"));
              
              if(asString("Diff")!=null)
                  r.setDiff(asString("Diff"));
              if(asInteger("min_cot")!= null)
                  r.setMin_cott(asInteger("min_cot"));
              if(asInteger("min_pre")!= null)
                  r.setMin_prep(asInteger("min_pre"));
              if(asInteger("x_num_persone")!=null)
                  r.setX_num_persone(asInteger("x_num_persone"));
              Datastore.put(r);
              RicettaMeta asd = RicettaMeta.get();
              ProdottoMeta p_meta = ProdottoMeta.get();
              Ricetta s = Datastore.query(asd).filter(asd.key_product.equal(r.getKey_product())).asSingle();
              Prodotto p = Datastore.query(p_meta).filter(p_meta.key.equal(r.getKey_product())).asSingle();
              p.setKey_ricetta(s.getKey());
              Datastore.put(p);
            } 
            return forward("index.jsp");
       } 
        else
        {
            TuttiProdottiService p = new TuttiProdottiService();
            requestScope("listProdotti",p.getProdotti());
        }
       return forward("index.jsp"); 
   }
}
