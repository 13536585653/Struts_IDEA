package org.action;


import org.entity.Users;

/**
 * Created by langye on 2017/2/7.
 */
public class UserAction{

private Users user;

public Users getUser() {
	return user;
}

public void setUser(Users user) {
	this.user = user;
}

public String login(){
	System.out.println("用户名："+user.getUserName());
	System.out.println("密码："+user.getPassword());
	System.out.println("登陆...");
	return "login";
	}

	public String reg(){
		System.out.println("注册...");
		return "reg";
	}
}
