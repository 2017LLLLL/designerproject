package event;

import entity.UserAgent;

public class PlayActionEvent extends ActionEvent{

    public PlayActionEvent(UserAgent userAgent) {
        super(userAgent);
    }
}
