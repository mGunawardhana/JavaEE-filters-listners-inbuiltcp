package filters;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import java.io.IOException;
import java.util.Objects;

/**
 * CopyWriteOwner - mr.Gunawardhana
 * Contact - 071 - 733 1792
 * <p>
 * © 2022 mGunawardhana,INC. ALL RIGHTS RESERVED.
 */

//@WebFilter(urlPatterns = "/a")
public class FilterOne implements Filter {

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        System.out.println("Filter One Initialize");
    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        System.out.println("Filter One doFilter Method Invoked");
        String name = servletRequest.getParameter("name");

        if (name.equals("ijse")){
            servletResponse.getWriter().write("<h1>Authenticated User</h1>");
        }else{
            servletResponse.getWriter().write("<h1>Un Authorized User </h1>");
        }


    }

    @Override
    public void destroy() {
        System.out.println("Filter One Destroyed");
    }
}
