package com.hqy.demo.utils;

/**
 * 
 * @Title: Message.java
 * @Package com.hqy.demo.utils
 * @Description:自定义返回数据类型
 * @author hqy
 * @date 2020-10-23
 * @version V1.0
 */
public class Message<T> {
	
	/**
	 * 状态码
	 */
	private Integer status;
	
	/**
	 * 返回的信息
	 */
	private String message;
	
	/**
	 * 返回的数据类
	 */
	private T data;
	
	/**
	 * 时间
	 */
	private Long time;
	
	public Message() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Message(Integer status, String message, T data, Long time) {
		super();
		this.status = status;
		this.message = message;
		this.data = data;
		this.time = time;
	}

	public Integer getStatus() {
		return status;
	}

	public void setStatus(Integer status) {
		this.status = status;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public T getData() {
		return data;
	}

	public void setData(T data) {
		this.data = data;
	}

	public Long getTime() {
		return time;
	}

	public void setTime(Long time) {
		this.time = time;
	}
	
}
