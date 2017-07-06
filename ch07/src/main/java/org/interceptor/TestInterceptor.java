package org.interceptor;

import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.interceptor.Interceptor;

/**
 * Created by langye on 2017/2/7.
 */
public class TestInterceptor implements Interceptor {
@Override
public void destroy() {
	System.out.println("拦截器销毁");
}

@Override
public void init() {
	System.out.println("初始化拦截器");
}

@Override
public String intercept(ActionInvocation actionInvocation) throws Exception {
	System.out.println("测试之前...");
	//调用目标action中的方法，并返回显影结果集字符串
	String result = actionInvocation.invoke();
	System.out.println("测试之后...");
	return result;
}
}
