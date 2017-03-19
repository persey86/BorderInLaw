package com.border.servlet;

import com.border.servlet.actions.Action;
import com.border.servlet.actions.ActionFactory;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created by Anastasia on 19.03.2017.
 */
public class MainServlet extends HttpServlet {

    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        try {
            Action action = ActionFactory.getAction(req);
            String view = action.execute(req, resp);

            req.getRequestDispatcher("/WEB-INF/" + view + ".jsp").forward(req, resp);

        } catch (Exception e) {
            throw new ServletException("E", e);
        }
    }
}
