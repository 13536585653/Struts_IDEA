package org.sms.action;

import com.yunpian.sdk.model.ResultDO;
import com.yunpian.sdk.model.SendSingleSmsInfo;
import org.apache.commons.lang3.RandomStringUtils;
import org.apache.struts2.ServletActionContext;
import org.sms.utils.SMSUtil;

import javax.servlet.http.HttpSession;

/**
 * Created by langye on 2017/1/10.
 */
public class SmsAction {
	private String tel;
	private String code;
	private String message;

public String getTel() {
	return tel;
}

public void setTel(String tel) {
	this.tel = tel;
}

public String getCode() {
	return code;
}

public void setCode(String code) {
	this.code = code;
}

public String getMessage() {
	return message;
}

public void setMessage(String message) {
	this.message = message;
}

/**
 * 发送短信验证
 * @return return "success" 响应结果集
 */
public String sendSms(){
	//产生一个随机的验证码
	String code = RandomStringUtils.randomNumeric(6);
	System.out.println("生成的随机验证码是："+code);
	//获取原生的HttpSession对象
	HttpSession session = ServletActionContext.getRequest().getSession();
	//将验证码放入session中
	session.setAttribute("code",code);
	//设置当前session的生命时长
	session.setMaxInactiveInterval(60*30);
	//发送短信
	ResultDO<SendSingleSmsInfo> result = SMSUtil.send(tel,code);
	message = result.isSuccess() ? "发送完成" : "发送失败";
	System.out.println(message);
	return "success";
}


/**
 * 验证短信验证码，并添加用户手机信息到数据库
 * @return 返回结果到页面
 */
public String addUserInfo(){
	HttpSession session = ServletActionContext.getRequest().getSession();
	String sessionCode = (String) session.getAttribute("code");
	System.out.println("会话中的验证码："+sessionCode);
	System.out.println("提交过来的验证码："+code);
	if (code.trim().equals(sessionCode)){
		//将手机号码保存到数据库

		//回馈信息给客户端
		message = "感谢您关注旺盛企业公众号";
		return "success";
	}else {
		message = "您输入的验证码无效";
		return "error";
	}
}
}
