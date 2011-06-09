package consorzio.server.service;

import org.slim3.datastore.Datastore;

import consorzio.client.service.TwitterService;
import consorzio.shared.model.Tweet;

public class TwitterServiceImpl implements TwitterService {

    public void tweet(String content) {
        Tweet tweet = new Tweet();
        tweet.setContent(content);
        Datastore.put(tweet);
    }
}