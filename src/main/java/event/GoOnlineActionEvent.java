package event;

import entity.UserAgent;

public class GoOnlineActionEvent extends ActionEvent{

    public GoOnlineActionEvent(UserAgent userAgent) {
        super(userAgent);
    }
}
