package main.servlet.error;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;


// created an error500.html
// web.xml create error-page
// xml can put error code as well as exception type
// refer to xml
@WebServlet(
        name = "ErrorServlet",
        urlPatterns = "/error"
)
public class ErrorServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        throw new NullPointerException();
    }
}
