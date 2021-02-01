/**
 * 
 */
package com.cts.cj.domain;

/**
 * @author Shikha.Mishra
 *
 */

public class ChangePassword {

	private String email;
	private String changedPassword;
	private String currentPassword;

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getChangedPassword() {
		return changedPassword;
	}

	public void setChangedPassword(String changedPassword) {
		this.changedPassword = changedPassword;
	}

	public String getCurrentPassword() {
		return currentPassword;
	}

	public void setCurrentPassword(String currentPassword) {
		this.currentPassword = currentPassword;
	}

}
