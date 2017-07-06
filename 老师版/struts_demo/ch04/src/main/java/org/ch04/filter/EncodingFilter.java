package org.ch04.filter;

import javax.servlet.*;
import java.io.IOException;

/**
 * Created by wangl on 2017/1/3.
 */
public class EncodingFilter implements Filter{

    String encoder = null;

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        System.out.println("init EncodingFilter...");
        encoder = filterConfig.getInitParameter("encoder");
    }

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain filterChain) throws IOException, ServletException {
        request.setCharacterEncoding(encoder);
        response.setCharacterEncoding(encoder);
        //放行请求
        filterChain.doFilter(request, response);
    }

    @Override
    public void destroy() {

    }
}
