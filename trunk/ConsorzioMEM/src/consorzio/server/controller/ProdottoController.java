package consorzio.server.controller;

import org.slim3.controller.Controller;
import org.slim3.controller.Navigation;

public class ProdottoController extends Controller {

    @Override
    public Navigation run() throws Exception {
        return forward("Prodotto.jsp");
    }
}
