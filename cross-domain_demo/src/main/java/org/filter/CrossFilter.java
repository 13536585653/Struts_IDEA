package org.filter;


import javax.servlet.*;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created by Administrator on 2017/3/13.
 */
public class CrossFilter implements Filter {
    @Override
    public void init(FilterConfig filterConfig) throws ServletException {

    }

    @Override
    public void doFilter(ServletRequest req, ServletResponse res, FilterChain filterChain) throws IOException, ServletException {
        System.out.println("filter...");
        //相应之前设置响应的头部，授权跨域访问
        HttpServletResponse response = (HttpServletResponse) res;
        //设置编译指示没有缓存
        response.setHeader("Pragma", "no-cache");
        //设置控制缓存没有缓存
        response.setHeader("Cache-Control", "no-cache");
        //设置跨域请求为*
        response.setHeader("Access-Control-Allow-Origin", "*");
        //设置有效期为0（刷新很快）
        response.setDateHeader("Expires", 0);
        //放行
        filterChain.doFilter(req,res);

    }

    @Override
    public void destroy() {

    }
}
