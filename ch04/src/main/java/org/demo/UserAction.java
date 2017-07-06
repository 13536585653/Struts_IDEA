package org.demo;

/**
 * Created by langye on 2017/1/3.
 */
public class UserAction {

	//映射表单的参数（属性名和表单的name属性一致）
	private String userName;
	private String password;
	private int age;
	private String[] address;



public String login(){
	System.out.println("用户名："+userName);
	System.out.println("密码："+password);
	System.out.println("年龄："+age);
	for (int i=0;i<address.length;i++){
		System.out.println("地址："+address[i]);
	}
	return "success";
}
public String getUserName() {
	return userName;
}

public void setUserName(String userName) {
	this.userName = userName;
}

public String getPassword() {
	return password;
}

public void setPassword(String password) {
	this.password = password;
}

public int getAge() {
	return age;
}

public void setAge(int age) {
	this.age = age;
}

public String[] getAddress() {
	return address;
}

public void setAddress(String[] address) {
	this.address = address;
}
}
