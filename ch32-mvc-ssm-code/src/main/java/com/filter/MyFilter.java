package com.filter;

import javax.servlet.*;
import java.io.IOException;

/**
 * @author cj
 * @date 2019/12/25
 */
public class MyFilter implements Filter {
    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        
    }

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
        System.out.println("-----debug: myfilter in spring mvc");
        chain.doFilter(request, response);
    }

    @Override
    public void destroy() {

    }
}
