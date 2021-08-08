package main.servlet.param;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(
        name = "ContextServlet",
        urlPatterns = "/context"
)
public class ContextServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String token = getServletContext().getInitParameter("authorizationToken");

        if (token != null){
            resp.setContentType("text/plain");
            resp.getWriter().println("Token: " + token);
        }

    }
}
