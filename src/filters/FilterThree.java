package filters;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import java.io.IOException;

/**
 * CopyWriteOwner - mr.Gunawardhana
 * Contact - 071 - 733 1792
 * <p>
 * © 2022 mGunawardhana,INC. ALL RIGHTS RESERVED.
 */
@WebFilter(urlPatterns = "/b")
public class FilterThree implements Filter {
    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        System.out.println("Filter Three Invoked");
    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        System.out.println("Filter Three doFilter Method Invoked");
        String name = servletRequest.getParameter("name");

        if (name.equals("ijse")){

            filterChain.doFilter(servletRequest,servletResponse);

        }else{

            servletResponse.getWriter().write("<h1>Un Authorized User </h1>");
        }
    }

    @Override
    public void destroy() {
        System.out.println("Filter Three Destroyed");

    }
}
