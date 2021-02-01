package com.cts.cj.domain;

import com.cts.cj.dto.UserDto;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class AuthToken {

	private String token;
	private String username;
	private String error;
	private UserDto user;

	/*
	 * public AuthToken(String token, String username, String error, UserDto user) {
	 * this.token = token; this.username = username; this.error = error; this.user =
	 * user; // TODO Auto-generated constructor stub }
	 */

	public AuthToken(String token, String username, String error) {
		this.token = token;
		this.username = username;
		this.error = error;
		// this.user=user;
		// TODO Auto-generated constructor stub
	}

	public AuthToken(String token, String username, UserDto user) {
		this.token = token;
		this.username = username;
		this.user = user;

	}

	public String getToken() {
		return token;
	}

	public String getUsername() {
		return username;
	}

	public void setToken(String token) {
		this.token = token;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getError() {
		return error;
	}

	public void setError(String error) {
		this.error = error;
	}

	public UserDto getUser() {
		return user;
	}

	public void setUser(UserDto user) {
		this.user = user;
	}

}
