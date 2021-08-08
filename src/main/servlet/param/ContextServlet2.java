package main.servlet.param;


import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class ContextServlet2 extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String token = getServletConfig().getInitParameter("authorizationToken");
        resp.setContentType("text/plain");
        resp.getWriter().println("Token: " + token);
    }
}
