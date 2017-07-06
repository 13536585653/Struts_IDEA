package org.ch04.entity;

/**
 * Created by wangl on 2017/1/3.
 */
public class Users {

    //映射表单参数(属性名和表单的name属性一致)
    private String userName;
    private String password;
    private int age;
    //数组用于接收表单中name属性名相同的内容
    private String[] addr;

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

    public String[] getAddr() {
        return addr;
    }

    public void setAddr(String[] addr) {
        this.addr = addr;
    }
}
