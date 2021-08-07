package main.servlet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(
        name = "HelloServlet",
        urlPatterns = "/hello"
)

public class HelloServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("Post method");
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/plain");
        resp.getWriter().println("Get Request has been called");
        resp.getWriter().println("Another Line!");

        resp.setContentType("text/html");
        resp.getWriter().println("<h1>header1</h1>" +
                "<h2>header2</h2>" +
                "<h3>header3</h3>" +
                "<h4>header4</h4>" +
                "<h5>header5</h5>" +
                "<h6>header6</h6>" +
                "<p>paragraph</p>");
    }
}
