package consorzio.server.service;

import org.slim3.tester.ServletTestCase;
import org.slim3.datastore.Datastore;
import org.junit.Test;
import java.util.List;

import consorzio.shared.model.Tweet;
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;

public class TwitterServiceImplTest extends ServletTestCase {

    private TwitterServiceImpl service = new TwitterServiceImpl();

    @Test
    public void test() throws Exception {
        assertThat(service, is(notNullValue()));
    }
    
    @Test
    public void tweet() throws Exception {
        service.tweet("Hello");
        //To query a model, you use Datastore.query(Class modelClass).asSingle().
        Tweet tweet = Datastore.query(Tweet.class).asSingle();
        assertThat(tweet, is(notNullValue()));
        assertThat(tweet.getContent(), is("Hello"));
    }
    
    @Test
    public void getTweetList() throws Exception {
        Tweet tweet = new Tweet();
        tweet.setContent("Hello");
        Datastore.put(tweet);
        List<Tweet> tweetList = service.getTweetList();
        assertThat(tweetList.size(), is(1));
        assertThat(tweetList.get(0).getContent(), is("Hello"));
    }
}
    