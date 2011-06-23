package consorzio.controller.twitter;

import java.util.List;

import consorzio.model.Tweet;
import consorzio.service.TwitterService;
import org.slim3.controller.Controller;
import org.slim3.controller.Navigation;

public class IndexController extends Controller {

    private TwitterService service = new TwitterService();

    /**
     * When you visit "/twitter/", tutorial.controller.twitter.IndexController#run() is performed. 
     * The return value of run() is a destination path.
     *  "index.jsp" is equivalent to "war/twitter/index.jsp".
     */
    @Override
    public Navigation run() throws Exception {
        List<Tweet> tweetList = service.getTweetList();
        requestScope("tweetList", tweetList);
        return forward("/index.jsp");
    }
}
