package main.servlet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(
        name = "FruitServlet",
        urlPatterns = "/fruit"
)
public class FruitServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        // capable of jsp, html and servlet
        getServletContext().getRequestDispatcher("/fruits.jsp").forward(req, resp);
//        getServletContext().getRequestDispatcher("/apple.html").forward(req, resp);
    }
}
