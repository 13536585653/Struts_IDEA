package org.demo;

import javax.servlet.*;
import java.io.IOException;

/**
 * Created by langye on 2017/1/3.
 */
public class EncodingFilter implements Filter {
	String encoder = null;
@Override
public void init(FilterConfig filterConfig) throws ServletException {
	System.out.println("init EncodingFilter...");
	encoder = filterConfig.getInitParameter("encoding");
}

@Override
public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
	request.setCharacterEncoding(encoder);
	response.setCharacterEncoding(encoder);
	response.setContentType("text/html");
	//放行
	chain.doFilter(request,response);
}

@Override
public void destroy() {

}
}
