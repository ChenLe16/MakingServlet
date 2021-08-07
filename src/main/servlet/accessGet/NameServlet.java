package main.servlet.accessGet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(
        name = "NameServlet",
        urlPatterns = "/name"
)
public class NameServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String firstName = req.getParameter("firstName");
        String lastName = req.getParameter("lastName");

        // /name?firstName=FIRSTNAME&lastName=LASTNAME
        if (firstName == null || lastName == null){
            System.out.println("a full name is needed");
        } else {
            System.out.println(firstName + lastName);
        }
    }
}
