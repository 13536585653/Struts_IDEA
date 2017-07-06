package org.ch12.action;

import com.opensymphony.xwork2.ActionSupport;
import org.ch12.entity.Users;

/**
 * Created by langye on 2017/2/14.
 * 使用令牌必须继承ActionSupport
 */
public class UserAction extends ActionSupport{
	private Users user;

public Users getUser() {
	return user;
}

public void setUser(Users user) {
	this.user = user;
}

//用户登录
public String login(){
	System.out.println("登录成功！");
	System.out.println("用户名："+user.getUserName());
	return SUCCESS;
}

}
