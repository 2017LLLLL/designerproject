package action;

import entity.UserAgent;
import event.ActionEvent;
import event.StudyActionEvent;

public class StudyAction implements UserAgentAction{

    @Override
    public Class<StudyActionEvent> getBindingEvnetClass() {
        return StudyActionEvent.class;
    }

    @Override
    public void act(ActionEvent event) {
        StudyActionEvent studyActionEvent = (StudyActionEvent)event;
        // 获取操作对象的人员
        UserAgent userAgent = studyActionEvent.getUserAgent();
        String name = userAgent.getName();
        System.out.println(name + "正在学习.....");
        System.out.println("===============相关学习的业务逻辑================");
        System.out.println(name + "学习结束.....");
    }
}
