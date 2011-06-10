package consorzio.client.service;

import java.util.List;
import consorzio.shared.model.Tweet;


import com.google.gwt.user.client.rpc.AsyncCallback;

public interface TwitterServiceAsync {

    void tweet (String content, AsyncCallback<Void> callback);
    void getTweetList(AsyncCallback<List<Tweet>> callback);


}