package main.servlet.param;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebInitParam;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(
        name = "ContextServlet3",
        urlPatterns = "/context3",
        initParams = {@WebInitParam(name = "authorizationToken", value = "Emily")}
)
public class ContextServlet3 extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String token = getServletConfig().getInitParameter("authorizationToken");
        resp.setContentType("text/plain");
        resp.getWriter().println("Token: " + token);
    }
}
