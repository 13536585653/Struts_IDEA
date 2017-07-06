package org.ch04.action;

import org.ch04.entity.Users;

/**
 * Created by wangl on 2017/1/3.
 */
public class UserAction2 {

    //映射对象类型
    //(表单的name属性名则是user.userName的方式)
    private Users user;

    public Users getUser() {
        return user;
    }

    public void setUser(Users user) {
        this.user = user;
    }

    public String login(){
        System.out.println(user.getUserName());
        System.out.println(user.getPassword());
        System.out.println(user.getAge());
        for (String s : user.getAddr()) {
            System.out.println(s);
        }
        return "success";
    }
}
