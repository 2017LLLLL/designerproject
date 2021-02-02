package event;

import entity.UserAgent;

/*
* 事件抽象实体类
* */
public class ActionEvent {
    private UserAgent userAgent;

    /*提供一个有参构造。来装配源对象*/
    public ActionEvent(UserAgent userAgent) {
        this.userAgent = userAgent;
    }

    public UserAgent getUserAgent() {
        return userAgent;
    }

    public void setUserAgent(UserAgent userAgent) {
        this.userAgent = userAgent;
    }
}
