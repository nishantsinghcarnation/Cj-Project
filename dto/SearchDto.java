package com.cts.cj.dto;

public class SearchDto {
	
	private Long userId;
	private String firstName;
	private String lastName;
	private String profileImageUrl;
	private String email;
	private String quickboxuserId;
	
	public Long getUserId() {
		return userId;
	}
	public void setUserId(Long userId) {
		this.userId = userId;
	}
	public String getFirstName() {
		return firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getProfileImageUrl() {
		return profileImageUrl;
	}
	public void setProfileImageUrl(String profileImageUrl) {
		this.profileImageUrl = profileImageUrl;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	public String getQuickboxuserId() {
		return quickboxuserId;
	}
	public void setQuickboxuserId(String quickboxuserId) {
		this.quickboxuserId = quickboxuserId;
	}
	
	
	

}
