package org.vs;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.util.CompoundRoot;
import com.opensymphony.xwork2.util.ValueStack;
import org.entity.Card;
import org.entity.User;

import java.util.Map;

/**
 * Created by langye on 2017/2/8.
 */
public class ValueStackDemoAction {
	private User user;

public User getUser() {
	return user;
}

public void setUser(User user) {
	this.user = user;
}

public String test(){
	//获取请求对象
	Map<String,Object> request = (Map<String, Object>) ActionContext.getContext().get("request");
	//获取会话对象
	Map<String,Object> session =  ActionContext.getContext().getSession();
	//获取上下文对象
	Map<String,Object> application = ActionContext.getContext().getApplication();
	//获取值栈，默认Struts将ValeStack设置为OgnlContext的根（Root）
	ValueStack vs = ActionContext.getContext().getValueStack();
	//Struts的值栈是基于list的数据结构实现的，当创建一个action实例的时候
	//Struts就会将这个action实例放入到值栈的栈顶
	//值栈中最关键的一个对象就是CompoundRoot，他是整个值栈的核心，
	//compoundRoot就是对Ognl的真正封装，并且这个CompoundRoot是一个集合
	//它实现了list接口的一种数据结构。
	//（重点:当Struts创建了一个action实例的时候，就会将这个实例放入到root集合中）
	CompoundRoot root = vs.getRoot();
	//可以遍历这个集合查看值栈中的所有元素
	for(Object obj: root){
		System.out.println(obj);
	}
	return "test";
}

public String index2(){
	User u1 = new User();
	u1.setUserName("User1");
	u1.setPassword("123");
	Card card = new Card();
	card.setCardNum("234565768655");
	u1.setCard(card);
	//Struts默认会将整个action实例放入值栈
	//我们也可以手动将一些数据放入到值栈中
	ValueStack vs = ActionContext.getContext().getValueStack();
	CompoundRoot root = vs.getRoot();
	//进行压栈操作，其实就是将数据放入list集合中，并设置为栈顶元素
	vs.push(u1);
	//弹栈操作，就是将栈顶的元素进行移除
	//vs.pop();
	for (Object obj:root){
		System.out.println(obj);
	}
	return "success";
}

public String index3(){
	User u1 = new User();
	u1.setUserName("user1");
	u1.setPassword("123");
	Card card = new Card();
	card.setCardNum("32242354657");
	u1.setCard(card);

	//将u1存入actionContext中
	//这样操作其实就是将u1对象保存在了两个地方（双重作用）
	//一个是actionContext对象的map中
	//然后还会存储一份在request请求作用域
	ActionContext.getContext().put("u1",user);

	//将u1对象只存放在请求作用域
	Map<String,Object> request = (Map<String, Object>) ActionContext.getContext().get("request");
	request.put("u1",u1);

	//将u1对象存放在会话作用域
	Map<String,Object> session = ActionContext.getContext().getSession();
	session.put("u1",u1);

	//将u1对象存放在上下文作用域
	Map<String,Object> application = ActionContext.getContext().getApplication();
	application.put("u1",u1);

	//将u1对象放入到值栈中
	ValueStack vs = ActionContext.getContext().getValueStack();
	vs.push(u1);
	return "success";
}
}
