package com.newframe.core.vo;

import com.newframe.core.pojo.pojoimpl.impl.Function;

import java.util.Map;

import com.newframe.core.pojo.pojoimpl.impl.User;

/**
 * 在线用户对象
 * 
 * @version 1.0
 */
public class Client implements java.io.Serializable {

	private static final long serialVersionUID = 1L;
	
	private User user;

	private Map<String, Function> functions;
	/**
	 * 用户IP
	 */
	private java.lang.String ip;
	/**
	 *登录时间
	 */
	private java.util.Date logindatetime;

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}


	public Map<String, Function> getFunctions() {
		return functions;
	}

	public void setFunctions(Map<String, Function> functions) {
		this.functions = functions;
	}

	public java.lang.String getIp() {
		return ip;
	}

	public void setIp(java.lang.String ip) {
		this.ip = ip;
	}

	public java.util.Date getLogindatetime() {
		return logindatetime;
	}

	public void setLogindatetime(java.util.Date logindatetime) {
		this.logindatetime = logindatetime;
	}


}
