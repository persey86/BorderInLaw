package com.border.servlet.actions;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Created by Anastasia on 19.03.2017.
 */
public interface Action {
    String execute(HttpServletRequest request, HttpServletResponse response) throws Exception;
}
