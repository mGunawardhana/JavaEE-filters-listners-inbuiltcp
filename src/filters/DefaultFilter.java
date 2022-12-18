package filters;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import java.io.IOException;

/**
 * CopyWriteOwner - mr.Gunawardhana
 * Contact - 071 - 733 1792
 *
 * © 2022 mGunawardhana,INC. ALL RIGHTS RESERVED.
 */

@WebFilter(urlPatterns = "/*")
public class DefaultFilter implements Filter {
    @Override
    public void init(FilterConfig filterConfig) throws ServletException {

    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        System.out.println("Default Filter Invoked..");
    }

    @Override
    public void destroy() {

    }
}
