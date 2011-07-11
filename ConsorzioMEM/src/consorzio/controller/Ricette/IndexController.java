package consorzio.controller.Ricette;

import java.util.List;

import org.slim3.controller.Controller;
import org.slim3.controller.Navigation;
import org.slim3.datastore.Datastore;

import consorzio.meta.RicettaMeta;
import consorzio.model.Ricetta;

public class IndexController extends Controller {

    @Override
    public Navigation run() throws Exception {
        RicettaMeta ric = RicettaMeta.get();
        List<Ricetta> list = Datastore.query(ric).asList();
        requestScope("list",list);
        return forward("index.jsp");
    }
}
