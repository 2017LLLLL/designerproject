package action;

import entity.UserAgent;
import event.ActionEvent;
import event.PlayActionEvent;
import event.StudyActionEvent;

public class PlayAction implements UserAgentAction{

    @Override
    public Class<PlayActionEvent> getBindingEvnetClass() {
        return PlayActionEvent.class;
    }

    @Override
    public void act(ActionEvent event) {
        PlayActionEvent playActionEvent = (PlayActionEvent)event;
        // 获取操作对象的人员
        UserAgent userAgent = playActionEvent.getUserAgent();
        String name = userAgent.getName();
        System.out.println(name + "正在玩耍.....");
        System.out.println("===============相关玩耍的业务逻辑================");
        System.out.println(name + "玩耍结束.....");
    }
}
