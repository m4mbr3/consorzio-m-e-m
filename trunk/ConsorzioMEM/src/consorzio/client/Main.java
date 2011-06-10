package consorzio.client;

import java.util.List;

import consorzio.client.service.TwitterService;
import consorzio.client.service.TwitterServiceAsync;
import consorzio.shared.model.Tweet;


import com.google.gwt.core.client.GWT;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.uibinder.client.UiHandler;
import com.google.gwt.user.client.Window;
import com.google.gwt.user.client.rpc.AsyncCallback;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.FlexTable;
import com.google.gwt.user.client.ui.TextArea;
import com.google.gwt.user.client.ui.Widget;    

public class Main extends Composite {

    private static MainUiBinder uiBinder = GWT.create(MainUiBinder.class);
    
    private static TwitterServiceAsync service = GWT.create(TwitterService.class);

    interface MainUiBinder extends UiBinder<Widget, Main> {
    }
    
    @UiField
    TextArea content;
    
    @UiField
    Button tweet;
    
    @UiField
    FlexTable table;
    
    @UiField
    Button refresh;

    public Main() {
        initWidget(uiBinder.createAndBindUi(this));
        getTweetList();

    }

    @UiHandler({"tweet", "refresh"})
    void handleClick(ClickEvent e) {
        if (e.getSource() == tweet) {
            tweet();
        } else if (e.getSource() == refresh) {
            getTweetList();
        }
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
    void getTweetList() {
        service.getTweetList(new AsyncCallback<List<Tweet>>() {
            
            public void onSuccess(List<Tweet> result) {
                table.clear();
                for (int i = 0; i < result.size(); i++) {
                    table.setHTML(i, 0, result.get(i).getContent());
                }
            }
            
            public void onFailure(Throwable caught) {
                Window.alert(caught.getMessage());
            }
        });
    }
}