package service.impl;

import action.UserAgentAction;
import entity.UserAgent;
import event.ActionEvent;
import factory.RoleFactory;
import service.UserAction;

import java.util.List;

public class UserActionImp implements UserAction {

    @Override
    public void action(UserAgent userAgent, ActionEvent actionEvent) {
        List<String> role = userAgent.getRole();
        // 声明一个UserAgentAction 抽象类
        UserAgentAction<?> userAgentAction = null;
        for (String roleName : role) {
            // 从工厂中获取权限列表中对应的操作权限的实体类
            UserAgentAction<?> action = RoleFactory.getAction(roleName);
            if(action.getBindingEvnetClass().isInstance(actionEvent)){
                userAgentAction = action;
                break;
            }
        }

        if(userAgentAction == null){
            throw new RuntimeException("找不到对应的操作");
        }
        // 交给事件执行者去执行任务，并传入任务源对象
        userAgentAction.act(actionEvent);

    }

}
