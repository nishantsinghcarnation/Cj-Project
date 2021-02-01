package com.cts.cj.domain;

import com.cts.cj.util.CJUtil;

public class SocketUser {

	private String socketId;
	private Long userId;

	public SocketUser(Long userId) {
		this.userId = userId;
		
		String randomNumber = CJUtil.randomNumber();
		this.socketId = this.userId + "-" +randomNumber;
	}

	public String getSocketId() {
		return socketId;
	}

	public Long getUserId() {
		return userId;
	}
}
