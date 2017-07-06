package org.ch03.action;

/**
 * Created by wangl on 2017/1/3.
 */
public class UserAction {

    //注册用户
    public String reg(){
        System.out.println("注册用户");
        return "success";
    }

    //用户登陆
    public String login(){
        System.out.println("用户登陆");
        return "success";
    }
}
