package servlet;

import sun.net.httpserver.HttpServerImpl;

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
public class B extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("Servlet B Get Method Invoked");
        resp.getWriter().write("<h1>B : DO GET CALLED </h1>");
    }
}
