package consorzio.controller.Stagioni;

import org.slim3.controller.Controller;
import org.slim3.controller.Navigation;

public class AutunnoController extends Controller {

    @Override
    public Navigation run() throws Exception {
        return forward("Autunno.jsp");
    }
}
