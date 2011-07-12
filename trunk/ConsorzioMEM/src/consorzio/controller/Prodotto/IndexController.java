package consorzio.controller.Prodotto;


import org.slim3.controller.Controller;
import org.slim3.controller.Navigation;


import consorzio.model.Prodotto;
import consorzio.service.ProdottoService;
import consorzio.service.RicettaService;


public class IndexController extends Controller {
    
    private ProdottoService service = new ProdottoService();
    private RicettaService sevi = new RicettaService();
    @Override
    public Navigation run() throws Exception {
 
        Prodotto p = service.getProdotto(asKey("key"));
       if(p.getKey_ricetta()!= null)
        if(sevi.getRicetta(p.getKey_ricetta())!= null)
            requestScope("Ricetta",sevi.getRicetta(p.getKey_ricetta()));
        if(p.getAutunno())
            requestScope("Autunno",new String("Autunno"));
        else
            requestScope("Autunno",null);

        if(p.getEstate())
            requestScope("Estate",new String("Estate"));
        else
            requestScope("Estate",null);
        
        if(p.getInverno())
            requestScope("Inverno",new String("Inverno"));
        else
            requestScope("Inverno",null);
        
        if(p.getPrimavera())
            requestScope("Primavera",new String("Primavera"));
        else
            requestScope("Primavera",null);
        
        requestScope("Prodotto", p);
        requestScope("NumeroImmagini",service.getNumeroImmagini(asKey("key")));
        requestScope("ListaImmagini",service.getListaImmagini(asKey("key")));
        return forward("index.jsp");
    }
}
