package com.cts.cj.dto;

public class MesiBoApiRequestData {

private  String op;
private	 String token;
private	 String appId;
private	 String email;

public String getOp() {
	return op;
}
public void setOp(String op) {
	this.op = op;
}
public String getToken() {
	return token;
}
public String getAppId() {
	return appId;
}

public void setToken(String token) {
	this.token = token;
}
public void setAppId(String appId) {
	this.appId = appId;
}
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}



}
