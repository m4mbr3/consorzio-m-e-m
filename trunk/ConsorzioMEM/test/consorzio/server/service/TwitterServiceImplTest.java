package consorzio.server.service;

import org.slim3.tester.ServletTestCase;
import org.slim3.datastore.Datastore;
import org.junit.Test;

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
}
    