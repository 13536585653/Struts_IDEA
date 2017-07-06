package org.demo.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Created by langye on 2017/1/3.
 */
@Entity
@Table(name = "user_info")
public class User {

	private String id;
	private String userName;
	private String password;
	private String sex;
	private int age;
	private String address;


@Id
@Column(name = "u_id")
public String getId() {
	return id;
}

public void setId(String id) {
	this.id = id;
}
@Column(name = "u_name")
public String getUserName() {
	return userName;
}

public void setUserName(String userName) {
	this.userName = userName;
}
@Column(name = "u_pwd")
public String getPassword() {
	return password;
}

public void setPassword(String password) {
	this.password = password;
}
@Column(name = "u_sex")
public String getSex() {
	return sex;
}

public void setSex(String sex) {
	this.sex = sex;
}
@Column(name = "u_age")
public int getAge() {
	return age;
}

public void setAge(int age) {
	this.age = age;
}
@Column(name = "u_addr")
public String getAddress() {
	return address;
}

public void setAddress(String address) {
	this.address = address;
}
}
