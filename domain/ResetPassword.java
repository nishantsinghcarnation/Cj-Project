/**
 * 
 */
package com.cts.cj.domain;

/**
 * @author Shikha.Mishra
 *
 */
public class ResetPassword {

	private String password;
	private String confirmPassword;
	private String token;

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getConfirmPassword() {
		return confirmPassword;
	}

	public void setConfirmPassword(String confirmPassword) {
		this.confirmPassword = confirmPassword;
	}

	public String getToken() {
		return token;
	}

	public void setToken(String token) {
		this.token = token;
	}
}
