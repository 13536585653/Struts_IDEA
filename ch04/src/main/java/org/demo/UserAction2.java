package org.demo;

import org.demo.entity.Address;
import org.demo.entity.User;

/**
 * Created by langye on 2017/1/3.
 */
public class UserAction2 {

private User user;

	public String add(){
		System.out.println("用户名："+user.getUserName());
		System.out.println("密码："+user.getPassword());
		System.out.println("身份证："+user.getCard().getCardNum());
		for (String like : user.getLikes()){
			System.out.println("爱好："+like);
		}
		for (Address address : user.getAddrs()){
			System.out.println("地址："+address.getAddr());
		}
		return "addUser";
	}

public User getUser() {
	return user;
}

public void setUser(User user) {
	this.user = user;
}

}
