package org.ch06.action;

import com.opensymphony.xwork2.ActionContext;
import org.ch06.entity.Users;

/**
 * Created by wangl on 2017/1/4.
 */
public class UserAction {

    private Users user;

    public Users getUser() {
        return user;
    }

    public void setUser(Users user) {
        this.user = user;
    }

    /**
     * 注册
     * @return
     */
    public String add(){
        ActionContext.getContext().getSession().put("user", user);
        //return "loginPage";
        //重定向action
        return "redirectLogin";
    }

    /**
     *登陆
     * @return
     */
    public String login(){
        if("zing".equals(user.getUserName()) && "123".equals(user.getPasswd())){
            ActionContext.getContext().put("user", user);
            return "forwardIndex";
        }
        ActionContext.getContext().put("message", "用户名或密码错误");
        return "loginError";
    }

    public String view(){
        return "viewLogin";
    }

    /**
     * ajax请求
     */
    public String ajax(){
        System.out.println(user.getUserName());
        System.out.println(user.getPasswd());
        System.out.println(user.getSex());
        return "jsonObject";
    }
}
