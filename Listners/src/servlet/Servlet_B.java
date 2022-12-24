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

@WebServlet(urlPatterns = "/b")
public class Servlet_B extends HttpServlet {
    public Servlet_B() {
        System.out.println("Servlet B Instantiated !");
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("Servlet B doGet method Invoked ! ");
    }

    @Override
    public void init() throws ServletException {
        System.out.println("Servlet B Init !");
    }

    @Override
    public void destroy() {
        System.out.println("Servlet B Destroyed !");
    }
}
