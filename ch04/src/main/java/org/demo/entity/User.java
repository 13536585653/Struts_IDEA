package org.demo.entity;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by langye on 2017/1/3.
 */
public class User {

private String userName;
private String password;
private int age;
//数组的映射
private String[] likes;
//对象的映射
private Card card;
//集合的映射
private List<Address> addrs = new ArrayList<>();

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

public String[] getLikes() {
	return likes;
}

public void setLikes(String[] likes) {
	this.likes = likes;
}

public Card getCard() {
	return card;
}

public void setCard(Card card) {
	this.card = card;
}

public List<Address> getAddrs() {
	return addrs;
}

public void setAddrs(List<Address> addrs) {
	this.addrs = addrs;
}


}
