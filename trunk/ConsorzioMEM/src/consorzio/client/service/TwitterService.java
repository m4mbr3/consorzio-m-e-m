package consorzio.client.service;

import java.util.List;

import consorzio.shared.model.Tweet;

import com.google.gwt.user.client.rpc.RemoteService;
import com.google.gwt.user.client.rpc.RemoteServiceRelativePath;

@RemoteServiceRelativePath("service.s3gwt")
public interface TwitterService extends RemoteService {

    void tweet(String content);
    List<Tweet> getTweetList();

}