package org.ch13.action;

import org.ch13.entity.User;
import org.ch13.exception.UserNotFoundException;

/**
 * Created by langye on 2017/3/29.
 */
public class UserAction {

    private User user;

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public String login(){
        if(user.getUserName().equals("langye") && "123".equals(user.getPassword())){
            user.setAge(20);
            return "success";
        }

        throw new UserNotFoundException("用户名或密码错误！");
    }
}
