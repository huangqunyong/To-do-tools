package com.hqy.demo.utils;

import java.util.Date;

/**
 * 
 * @Title: MessageUtil.java
 * @Package com.hqy.demo.utils
 * @Description:返回消息的工具类
 * @author hqy
 * @date 2020-10-23
 * @version V1.0
 */
public class MessageUtil {
	/**
	 * 成功，并且返回数据
	 */
	public static <E>Message<E> sucess(E obj){
		return new Message<E>(200,"sucess",obj,new Date().getTime());
	}
	
	/**
	 * 成功，但无返回值
	 */
	public static <E>Message<E> sucess(){
		return new Message<E>(200,"sucess",null,new Date().getTime());
	}
	
	/**
	 * 失败，将自定义异常信息返回
	 */
	public static <E>Message<E> error(Integer code,String msg){
		return new Message<E>(code,msg,null,new Date().getTime());
	}
	
	
}
