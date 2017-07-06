package org.demo.action;

import com.opensymphony.xwork2.ActionContext;
import org.demo.entity.Users;

import java.util.Map;

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

	/*System.out.println(user.getUserName());
	System.out.println(user.getPassword());*/
	//将user放入map集合
	Map<String,Object> map = (Map<String, Object>) ActionContext.getContext().get("request");
	map.put("user",user);
	ActionContext.getContext().put("user",user);
	ActionContext.getContext().getSession().put("user",user);
	ActionContext.getContext().getApplication().put("user",user);
	Users users = (Users) ActionContext.getContext().getSession().get("user");
	System.out.println("用户名："+users.getUserName());
	return "add";
}
}
