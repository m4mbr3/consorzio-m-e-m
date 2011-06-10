package consorzio.server.service;

import java.util.List;


import org.slim3.datastore.Datastore;

import consorzio.client.service.TwitterService;
import consorzio.shared.model.Tweet;
import consorzio.server.meta.TweetMeta;


public class TwitterServiceImpl implements TwitterService {

    private TweetMeta t = new TweetMeta();

    public void tweet(String content) {
        Tweet tweet = new Tweet();
        tweet.setContent(content);
        Datastore.put(tweet);
    }
    
    public List<Tweet> getTweetList() {
        return Datastore.query(t).sort(t.createdDate.desc).asList();
    }
}