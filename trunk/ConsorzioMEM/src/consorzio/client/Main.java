package consorzio.client;

import consorzio.client.service.TwitterService;
import consorzio.client.service.TwitterServiceAsync;

import com.google.gwt.core.client.GWT;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.uibinder.client.UiHandler;
import com.google.gwt.user.client.Window;
import com.google.gwt.user.client.rpc.AsyncCallback;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.TextArea;
import com.google.gwt.user.client.ui.Widget;

public class Main extends Composite {

    private static MainUiBinder uiBinder = GWT.create(MainUiBinder.class);
    
    private static TwitterServiceAsync service = GWT.create(TwitterService.class);

    interface MainUiBinder extends UiBinder<Widget, Main> {
    }
    
    @UiField
    TextArea content;

    public Main() {
        initWidget(uiBinder.createAndBindUi(this));
    }

    @UiHandler("tweet")
    void handleClick(ClickEvent e) {
        tweet();
    }
    
    void tweet() {
        service.tweet(content.getText(), new AsyncCallback<Void>() {
            
            public void onSuccess(Void result) {
                Window.alert("Tweet Ricevuto!!!");
                content.setText(null);
            }
            
            public void onFailure(Throwable caught) {
                Window.alert(caught.getMessage());
            }
        });
    }
}