package com.cts.cj.domain;

import java.time.LocalDateTime;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class UserConnection  {

	private Long userId;
	private String email;
	private String firstName;
	private String lastName;
	private String profileImageUrl;
	private String designation;
	private String startDate;

	private String qbid;
	
	private LocalDateTime ConnectionDate;

	public LocalDateTime getConnectionDate() {
		return ConnectionDate;
	}

	public void setConnectionDate(LocalDateTime connectionDate) {
		this.ConnectionDate = connectionDate;
	}

	private String endDate;
	private Boolean tillDate = Boolean.FALSE;
	private String employerName;

	public Boolean getTillDate() {
		return tillDate;
	}

	public void setTillDate(Boolean tillDate) {
		this.tillDate = tillDate;
	}

	public String getEmployerName() {
		return employerName;
	}

	public void setEmployerName(String employerName) {
		this.employerName = employerName;
	}

	

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	
	public String getProfileImageUrl() {
		return profileImageUrl;
	}

	public void setProfileImageUrl(String profileImageUrl) {
		this.profileImageUrl = profileImageUrl;
	}

	public String getDesignation() {
		return designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}

	/*
	 * public LocalDateTime getConnectionDate() { return ConnectionDate; }
	 * 
	 * public void setConnectionDate(LocalDateTime connectionDate) { ConnectionDate
	 * = connectionDate; }
	 */
	

	public String getEndDate() {
		return endDate;
	}

	public void setEndDate(String endDate) {
		this.endDate = endDate;
	}

	public String getQbid() {
		return qbid;
	}

	public void setQbid(String qbid) {
		this.qbid = qbid;
	}

	public Long getUserId() {
		return userId;
	}

	public String getFirstName() {
		return firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public String getStartDate() {
		return startDate;
	}

	public void setUserId(Long userId) {
		this.userId = userId;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public void setStartDate(String startDate) {
		this.startDate = startDate;
	}

	

}
