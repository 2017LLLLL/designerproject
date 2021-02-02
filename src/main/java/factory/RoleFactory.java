package factory;

import action.GoOnlineAction;
import action.PlayAction;
import action.StudyAction;
import action.UserAgentAction;

import java.util.HashMap;

public class RoleFactory {

    private static HashMap<String, UserAgentAction> actionMap = new HashMap<>();

    static {
        actionMap.put("shangwang", new GoOnlineAction());
        actionMap.put("wanshua", new PlayAction());
        actionMap.put("xuexi",new StudyAction());
    }

    public static UserAgentAction<?> getAction(String actionName) {
        return actionMap.get(actionName);
    }


}
