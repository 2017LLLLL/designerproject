package action;

import entity.UserAgent;
import event.ActionEvent;
import event.GoOnlineActionEvent;
import event.StudyActionEvent;

public class GoOnlineAction implements UserAgentAction{
    @Override
    public Class<GoOnlineActionEvent> getBindingEvnetClass() {
        return GoOnlineActionEvent.class;
    }

    @Override
    public void act(ActionEvent event) {
        GoOnlineActionEvent goOnlineActionEvent = (GoOnlineActionEvent)event;
        // 获取操作对象的人员
        UserAgent userAgent = goOnlineActionEvent.getUserAgent();
        String name = userAgent.getName();
        System.out.println(name + "正在上网.....");
        System.out.println("===============相关上网的业务逻辑================");
        System.out.println(name + "上网结束.....");
    }
}
