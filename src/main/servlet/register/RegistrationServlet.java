package main.servlet.register;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(
        name = "RegistrationServlet",
        urlPatterns = "/register"
)
public class RegistrationServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String email = req.getParameter("email");
        String name = req.getParameter("name");
        String age = req.getParameter("age");
        String password = req.getParameter("password");
        String confirmPassword = req.getParameter("confirmPassword");

        if (email == null || name == null || age == null || password == null || confirmPassword == null){
            req.setAttribute("error", "You are missing of the inputs");
            doGet(req, resp);
        } else{
            if (!password.equals(confirmPassword)){
                req.setAttribute("error", "The passwords do not match");
                doGet(req, resp);
            } else {
                resp.setContentType("text/html");
                resp.getWriter().println("<p>The account has been created successfully!</p>");
                resp.getWriter().println(name + " " + age + " years old");
            }
        }

    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        getServletContext().getRequestDispatcher("/register.jsp").forward(req, resp);
    }
}
