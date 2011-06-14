package consorzio.service;

import java.util.List;
import java.util.Map;

import org.slim3.datastore.Datastore;
import org.slim3.util.BeanUtil;

import consorzio.meta.TweetMeta;
import consorzio.model.Tweet;

import com.google.appengine.api.datastore.Transaction;

public class TwitterService {
    private TweetMeta t = new TweetMeta();

    public Tweet tweet(Map<String, Object> input) {
        Tweet tweet = new Tweet();
        BeanUtil.copy(input, tweet);
        Transaction tx = Datastore.beginTransaction();
        Datastore.put(tweet);
        tx.commit();
        return tweet;
    }
    //per la lista dei tweet prendendo dal datastore
    public List<Tweet> getTweetList() {
        return Datastore.query(t).sort(t.createdDate.asc).asList();
    }
}