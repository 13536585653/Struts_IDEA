package org.demo;

/**
 * Created by langye on 2017/1/3.
 */
public class UserAction{

	public String login(){
		System.out.println("用户登录");
		return "success";
	}

	public String register(){
		System.out.println("用户注册");
		return "success";
	}
}
