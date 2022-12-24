package servlet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * CopyWriteOwner - mr.Gunawardhana
 * Contact - 071 - 733 1792
 *
 * © 2022 mGunawardhana,INC. ALL RIGHTS RESERVED.
 */

@WebServlet(urlPatterns = "/a")
public class Servlet_A extends HttpServlet {
    public Servlet_A() {
        System.out.println("Servlet A Instantiated !");
    }

    @Override
    public void init() throws ServletException {
        System.out.println("Servlet A Init !");
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("Servlet A doGet method Invoked !");
    }

    @Override
    public void destroy() {
        System.out.println("Servlet A Destroyed !");
    }
}
