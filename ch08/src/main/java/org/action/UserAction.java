package org.action;

import com.opensymphony.xwork2.ActionContext;
import org.entity.User;

/**
 * Created by langye on 2017/2/8.
 */
public class UserAction  {

private User user;
private String userName;
private String password;
private String adsfda;

public User getUser() {
	return user;
}

public void setUser(User user) {
	this.user = user;
}

public String login(){
	System.out.println(user.getUserName()+"正在登录...");
	System.out.println("密码是："+user.getPassword());
	//将用户名放入请求作用域
	ActionContext.getContext().put("userName",user.getUserName());
	return "login";
}

public String findList(){
	return "success";
}

public void setUserName(String userName) {
	this.userName = userName;
}

public String getUserName() {
	return userName;
}

public void setPassword(String password) {
	this.password = password;
}

public String getPassword() {
	return password;
}

public void setAdsfda(String adsfda) {
	this.adsfda = adsfda;
}

public String getAdsfda() {
	return adsfda;
}

public String reg(){
	return "success";
}
}
