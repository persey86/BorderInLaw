package com.border.servlet.actions;

import com.border.servlet.actions.impl.ShowAllTroops;

import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by Anastasia on 19.03.2017.
 */
public class ActionFactory {

    public static Map<String,Action> actions = new HashMap<>();

    static {
        actions.put("GET/", new ShowAllTroops());
    }

    private ActionFactory(){}
    public static Action getAction(HttpServletRequest request){
        return actions.get(request.getMethod() + request.getRequestURI());
    }
}
