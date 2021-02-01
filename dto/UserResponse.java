package com.cts.cj.dto;

import java.io.Serializable;
import java.util.List;

import com.cts.cj.domain.Role;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

@JsonInclude(Include.NON_NULL)
public class UserResponse implements Serializable {
	private static final long serialVersionUID = 1L;

	
	private Long id;
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}


	private String firstName;
	private String emailId;
	private String mobileNumber;
	private String password;
	private String lastName;
	private List<Role> role;
	private String socketId;
	

	public String getSocketId() {
		return socketId;
	}

	public void setSocketId(String socketId) {
		this.socketId = socketId;
	}

	public UserResponse() {
	}

	public UserResponse(Long id, String name) {
		super();
		this.id = id;
		this.firstName = name;
	}

	
	private Long referedBy;

	public Long getReferedBy() {
		return referedBy;
	}

	public void setReferedBy(Long referedBy) {
		this.referedBy = referedBy;
	}
	
	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getEmailId() {
		return emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	public String getMobileNumber() {
		return mobileNumber;
	}

	public void setMobileNumber(String mobileNumber) {
		this.mobileNumber = mobileNumber;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	
	public List<Role> getRole() {
		return role;
	}

	public void setRole(List<Role> role) {
		this.role = role;
	}

	private Boolean online;

	
	
	 
	
	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Boolean getOnline() {
		return online;
	}

	public void setOnline(Boolean online) {
		this.online = online;
	}

	

}