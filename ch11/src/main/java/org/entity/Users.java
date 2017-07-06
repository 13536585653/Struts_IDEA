package org.entity;

import java.util.Date;

/**
 * Created by guowei on 2017/2/13.
 */
public class Users {
    private  String userName;
    private  String password;
    private Integer age;
    private Date birth;
    private String email;
    private Card card;

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

public Integer getAge() {
    return age;
}

public void setAge(Integer age) {
    this.age = age;
}

public Date getBirth() {
    return birth;
}

public void setBirth(Date birth) {
    this.birth = birth;
}

public String getEmail() {
    return email;
}

public void setEmail(String email) {
    this.email = email;
}

public Card getCard() {
    return card;
}

public void setCard(Card card) {
    this.card = card;
}
}
