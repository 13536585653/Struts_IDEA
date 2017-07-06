package org.ognl;

import ognl.Ognl;
import org.entity.Card;
import org.entity.User;

/**
 * Created by langye on 2017/2/8.
 */
public class Demo {
public static void main(String[] args) throws Exception {
	User user = new User();
	user.setUserName("狼野");
	user.setPassword("123");
	Card card = new Card();
	card.setCardNum("32534643654758823");
	user.setCard(card);

	//传统的方式进行数据访问
	System.out.println("-------传统方式--------");
	System.out.println(user.getUserName());
	System.out.println(user.getCard().getCardNum());

	//ognl的方式进行数据访问
	System.out.println("--------ognl-----------");
	//ognl其实就是一个表达式，表达式要结合其他的东西才能进行操作
	//第一个参数是对象里面的值，第二个参数是要取值的目标对象
	String userName = (String) Ognl.getValue("userName",user);
	System.out.println(userName);
	String card1 = (String) Ognl.getValue("card.cardNum",user);
	System.out.println(card1);
}
}
