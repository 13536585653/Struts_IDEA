package org.interceptor;


import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.interceptor.Interceptor;

/**
 * Created by langye on 2017/2/7.
 */
public class LoginInterceptor implements Interceptor{
@Override
public void destroy() {
	System.out.println("拦截器销毁");
}

@Override
public void init() {
	System.out.println("初始化拦截器");
}

/**
 *
 * @param actionInvocation 拦截器回调处理：负责调用整个拦截器站
 * @return 返回中的结果集返回值
 * @throws Exception
 */

@Override
public String intercept(ActionInvocation actionInvocation) throws Exception {
	System.out.println("登陆之前...");
	//调用目标action中的方法，并返回显影结果集字符串
	String result = actionInvocation.invoke();
	System.out.println("登陆之后...");
	return result;
}
}
