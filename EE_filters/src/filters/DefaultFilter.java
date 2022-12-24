package filters;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;

/**
 * CopyWriteOwner - mr.Gunawardhana
 * Contact - 071 - 733 1792
 * <p>
 * © 2022 mGunawardhana,INC. ALL RIGHTS RESERVED.
 */

@WebFilter(urlPatterns = "/*")
public class DefaultFilter implements Filter {

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {

    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {


        String name = servletRequest.getParameter("name");

        HttpServletRequest servletRequest1 = (HttpServletRequest) servletRequest;
        System.out.println(name + " " + servletRequest1.getServletPath());


        if (name.equals("ijse") && servletRequest1.getServletPath().equals("/a")) {

            filterChain.doFilter(servletRequest, servletResponse);

        } else if (name.equals("ijse") && servletRequest1.getServletPath().equals("/b")) {

            filterChain.doFilter(servletRequest, servletResponse);

        } else {

            System.out.println("Fuck This ... ");

        }
        System.out.println("Default Filter Invoked..");
    }

    @Override
    public void destroy() {

    }
}
