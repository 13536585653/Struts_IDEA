package org.action;

import org.entity.Users;

/**
 * Created by Administrator on 2017/3/13.
 */
public class userAction {
    private Users users;

    public Users getUsers() {
        return users;
    }

    public void setUsers(Users users) {
        this.users = users;
    }

    public String find(){
        System.out.println("用户名："+users.getUserName());
        return "success";
    }
}
