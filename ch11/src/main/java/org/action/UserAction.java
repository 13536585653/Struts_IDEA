package org.action;

import com.opensymphony.xwork2.ActionSupport;
import org.entity.Users;

/**
 * Created by guowei on 2017/2/13.
 * 执行验证必须继承ActionSupport
 * 可以重写validate方法，也可以自定义validateXxx方法
 * 两者的区别在于：validate方法会在执行任何action方法前执行
 * 而validateXxx方法是针对某个action方法调用之前执行，
 * Xxx就是action的方法名，将首字母变为大写
 * 如果这个两个校验方法同时存在，那么先执行validateXxx方法，
 * 最后再执行validate方法
 */
public class UserAction extends ActionSupport{
    private Users user;

    public Users getUser() {
        return user;
    }

    public void setUser(Users user) {
        this.user = user;
    }

//重写父类的validate方法
@Override
public void validate(){
    System.out.println("执行validate方法进行验证");
}

//自定义validateXxx方法,这个方法对应reg方法，在执行reg方法前执行此验证方法
public void validateReg(){
    System.out.println("执行validateReg方法进行验证");
    if(user!=null && "langYe".equals(user.getUserName())){
        //手动添加错误信息
        addFieldError("user.userName","用户名或密码输入错误");
    }
}

//自定义validateXxx方法,这个方法对应login方法，在执行login方法前执行此验证方法
public void validateLogin(){
    System.out.println("执行validateLogin方法进行验证");
}
//登录
public String login(){
    System.out.println("登录成功！");
    return SUCCESS;
}

//注册
public String reg(){
    System.out.println("注册成功！");
    return SUCCESS;
}
}
