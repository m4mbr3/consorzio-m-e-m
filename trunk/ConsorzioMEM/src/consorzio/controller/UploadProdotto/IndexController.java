package consorzio.controller.UploadProdotto;

import org.slim3.controller.Controller;
import org.slim3.controller.Navigation;
import org.slim3.datastore.Datastore;

import consorzio.model.Prodotto;

public class IndexController extends Controller {

    @Override
    public Navigation run() throws Exception {
        if(asString("Carica")!= null){
            if(asString("Carica").equals("Carica"))
            {
              Prodotto p = new Prodotto(); 
              if(asString("Nome")!=null)
                p.setNome(asString("Nome"));
              if(asString("Descr")!=null)
                p.setDescr(asString("Descr"));
              if(asString("Colt")!=null)
                  p.setColt(asString("Colt"));
              if(asString("Curio")!=null)
                  p.setCurio(asString("Curio"));
              if(asString("Categoria")!=null)
                  p.setCategoria(asString("Categoria"));
              
              if(asString("Descr_bre")!=null)
                  p.setDescr_breve(asString("Descr_bre"));
              
              if(asFloat("Prezzo")!=null)
                  p.setPrezzo(asFloat("Prezzo"));
              if(asString("Unit")!=null)
                  p.setUMisura(asString("Unit"));
              if(asString("Inverno") == null) p.setInverno(false);
              else if(asString("Inverno").equals("on"))
                  p.setInverno(true);
              else
                  p.setInverno(false);
              
              if(asString("Autunno") == null) p.setAutunno(false);
              else if(asString("Autunno").equals("on"))
                  p.setAutunno(true);
              else
                  p.setAutunno(false);
             
              if(asString("Estate") == null) p.setEstate(false);
              else if(asString("Estate").equals("on"))
                  p.setEstate(true);
              else
                  p.setEstate(false);
              if(asString("Primavera") == null) p.setPrimavera(false);
              else if(asString("Primavera").equals("on"))
                  p.setPrimavera(true);
              else
                  p.setPrimavera(false);
              
              Datastore.put(p);
            } 
        }
                
        return forward("index.jsp");
    }
}
