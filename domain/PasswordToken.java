/**
 * 
 */
package com.cts.cj.domain;

import java.util.Calendar;
import java.util.Date;

import org.neo4j.ogm.annotation.GeneratedValue;
import org.neo4j.ogm.annotation.Id;
import org.neo4j.ogm.annotation.NodeEntity;
import org.neo4j.ogm.annotation.Property;

/**
 * @author Shikha.Mishra
 *
 *
 */
@NodeEntity
public class PasswordToken {

	@Id
	@GeneratedValue
	private Long passwordTokenId;
	
	@Property
	private String token;

	@Property
	private String email;

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

	@Property
	private Date expiryDate;
	
	@Property
	private String password;
	
	@Property
	private String confirmPassword;
	

	public Long getPasswordTokenId() {
		return passwordTokenId;
	}

	public void setPasswordTokenId(Long passwordTokenId) {
		this.passwordTokenId = passwordTokenId;
	}


	public String getToken() {
		return token;
	}

	public void setToken(String token) {
		this.token = token;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Date getExpiryDate() {
		return expiryDate;
	}

	public void setExpiryDate(Date expiryDate) {
		this.expiryDate = expiryDate;
	}

	public void setExpiryDate(int minutes) {
		Calendar now = Calendar.getInstance();
		now.add(Calendar.MINUTE, minutes);
		this.expiryDate = now.getTime();
	}

	public boolean isExpired() {
		return new Date().after(this.expiryDate);
	}
}
