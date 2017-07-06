package org.sms.utils;

import com.yunpian.sdk.model.ResultDO;
import com.yunpian.sdk.model.SendSingleSmsInfo;
import com.yunpian.sdk.service.SmsOperator;
import com.yunpian.sdk.service.YunpianRestClient;

/**
 * Created by langye on 2017/1/10.
 */
public class SMSUtil {
//定义对接的APIkey
private static final String API_KEY = "65a8ac0847e87a6d7132bb463a4f02c9";
//创建云片客户端对象
private static YunpianRestClient client = new YunpianRestClient(API_KEY);

/**
 *发送短信验证码
 * @param tel 短信接收者的电话号码
 * @param code 客户端传过来的验证码
 * @return	result 可以从这个对象中获取发送的结果
 */
public static ResultDO<SendSingleSmsInfo> send(String tel,String code){
	//替换模板内容
	String smsTemplate = "【旺盛集团】您的验证码是#，有效时间为10分钟。感谢关注 旺盛股票微信公众号。";
	smsTemplate = smsTemplate.replace("#",code);
	//创建短信发送对象
	SmsOperator smsOperator = client.getSmsOperator();
	ResultDO<SendSingleSmsInfo> result = smsOperator.singleSend(tel,smsTemplate);
	return result;
}
}
