package service;

import entity.UserAgent;
import event.ActionEvent;

public interface UserAction {

    void action(UserAgent userAgent, ActionEvent actionEvent);

}
