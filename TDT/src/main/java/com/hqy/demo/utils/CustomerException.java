package com.hqy.demo.utils;

/**
 * 
 * @Title: CustomerException.java
 * @Package com.hqy.demo.utils
 * @Description:自定义异常
 * @author Administrator
 * @date 2020-10-23
 * @version V1.0
 */
public class CustomerException extends RuntimeException{

	private static final long serialVersionUID = 1L;
	
	/**
	 * 状态码
	 */
	private Integer code;
	
	public CustomerException(Integer code,String message) {
		super(message);
		this.code = code;
	}

	public Integer getCode() {
		return code;
	}

	public void setCode(Integer code) {
		this.code = code;
	}

}
