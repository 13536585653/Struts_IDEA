package org.demo.action;

import com.opensymphony.xwork2.ActionContext;
import org.demo.entity.Users;

/**
 * Created by langye on 2017/1/4.
 */
public class UserAction {
	private Users user;

public Users getUser() {
	return user;
}

public void setUser(Users user) {
	this.user = user;
}

public String add(){
	ActionContext.getContext().put("user",user);
	return "add";
}
}
