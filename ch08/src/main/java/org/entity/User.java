package org.entity;

/**
 * Created by langye on 2017/2/8.
 */
public class User {

	private String userName;
	private String password;
	private Card card;
private String email;
private String age;
private String birth;

public Card getCard() {
	return card;
}

public void setCard(Card card) {
	this.card = card;
}

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

public void setEmail(String email) {
	this.email = email;
}

public String getEmail() {
	return email;
}

public void setAge(String age) {
	this.age = age;
}

public String getAge() {
	return age;
}

public void setBirth(String birth) {
	this.birth = birth;
}

public String getBirth() {
	return birth;
}
}
