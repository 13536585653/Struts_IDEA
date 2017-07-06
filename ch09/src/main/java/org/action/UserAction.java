package org.action;

import com.opensymphony.xwork2.ActionContext;
import org.entity.Users;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by langye on 2017/2/9.
 */
public class UserAction {
	private Users user;

public Users getUser() {
	return user;
}

public void setUser(Users user) {
	this.user = user;
}

public String login(){
		System.out.println("hello world...");
		System.out.println("welcome,"+user.getUserName());
		return "login";
	}

	public String findList(){
		List<Users> list = new ArrayList<>();
		Users u1 = new Users();
		u1.setUserName("user1");
		u1.setPassword("123");
		Users u2 = new Users();
		u2.setUserName("user2");
		u2.setPassword("234");
		list.add(u1);
		list.add(u2);
		ActionContext.getContext().put("list",list);
		return "list";
	}
}
