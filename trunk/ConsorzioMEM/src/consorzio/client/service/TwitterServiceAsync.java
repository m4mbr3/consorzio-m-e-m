package consorzio.client.service;

import com.google.gwt.user.client.rpc.AsyncCallback;

public interface TwitterServiceAsync {

    void tweet (String content, AsyncCallback<Void> callback);

}