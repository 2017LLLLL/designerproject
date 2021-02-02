package action;

import event.ActionEvent;

/*
* 具体事件执行接口
* 通过传入事件进行判断，该执行类能不能执行该事件
* */
public interface UserAgentAction<T extends ActionEvent>{

    // 通过该方法返回该处理类对应的事件类对象
    public Class<T> getBindingEvnetClass();

    public void act(ActionEvent event);
}
