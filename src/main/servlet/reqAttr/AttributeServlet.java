package main.servlet.reqAttr;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(
        name = "AttributeServlet",
        urlPatterns = "/attribute"
)
public class AttributeServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String firstName = req.getParameter("firstName");
        String lastName = req.getParameter("lastName");
        String age = req.getParameter("age");

        StringBuilder error = new StringBuilder();

        if (firstName == null){
            error.append("First Name is not provided");
        } else if (lastName == null){
            error.append("Last Name is not provided");
        } else if (age == null){
            error.append("Age is not provided");
        }

        if (error.length() > 0){
            req.setAttribute("error", error.toString());
        } else {
            req.setAttribute("firstName", firstName);
            req.setAttribute("lastName", lastName);
            req.setAttribute("age", age);
        }

        // can forward to servlet as well
        getServletContext().getRequestDispatcher("/name.jsp").forward(req, resp);
    }
}
