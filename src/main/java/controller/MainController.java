package controller;

import entity.UserAgent;
import event.GoOnlineActionEvent;
import event.PlayActionEvent;
import service.UserAction;
import service.impl.UserActionImp;

import java.util.ArrayList;
import java.util.List;

public class MainController {

    public static void main(String[] args) {
        play();
    }


    public static void play(){
        // 构建权限
        List roleList = new ArrayList();
        roleList.add("xuexi");
        roleList.add("wanshua");
        // 创建操作用户对象
        UserAgent userAgent = new UserAgent(12, "小明", roleList);
        // 公共方法类对象
        UserAction userAction = new UserActionImp();
        // 传入操作事件的对象，以及事件对象本身
        userAction.action(userAgent,new PlayActionEvent(userAgent));

        userAction.action(userAgent,new GoOnlineActionEvent(userAgent));
    }


    public static void goOnline(){

    }

    public static void study(){

    }
}
