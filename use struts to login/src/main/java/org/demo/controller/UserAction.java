package org.demo.controller;

import com.opensymphony.xwork2.ActionContext;
import org.demo.dao.UserDao;
import org.demo.entity.User;
import org.demo.utils.UUIDUtil;

/**
 * Created by langye on 2017/1/3.
 */
public class UserAction {

private User user;

	public String reg(){
		UserDao dao = new UserDao();
		user.setId(UUIDUtil.getUUID());
		dao.add(user);
		System.out.println("用户注册...");
		return "regSuccess";
	}

	public String login(){
		UserDao dao = new UserDao();
		User newUser = (User) dao.findUserByName(user.getUserName());
		if(newUser!=null&&newUser.getPassword().equals(user.getPassword())){
			System.out.println("登录成功！");
			ActionContext.getContext().put("user",newUser);
			return "loginSuccess";
		}
		ActionContext.getContext().put("massage","登录失败!");
		System.out.println("登录失败！");
		return "loginFail";
	}
public User getUser() {
	return user;
}

public void setUser(User user) {
	this.user = user;
}
}
