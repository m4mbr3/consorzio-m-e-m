package consorzio.controller;

import org.slim3.controller.Controller;
import org.slim3.controller.Navigation;

public class TweetController extends Controller {

    @Override
    public Navigation run() throws Exception {
        return forward("Tweet.jsp");
    }
}
