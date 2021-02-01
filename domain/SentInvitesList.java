/**
 * 
 */
package com.cts.cj.domain;

import java.time.LocalDateTime;

import com.cts.cj.constants.Status;
import com.cts.cj.constants.UserSource;

/**
 * @author Shikha.Mishra
 *
 */
public class SentInvitesList {

	private Long userId;
	private String firstName;
	private String lastName;
	private String mobileNumber;
	private String email;
	private Long referedBy;
	private UserSource source;
	private String inviteBy;
	private Status status = Status.INACTIVE;
	private String inviteCode;

	private LocalDateTime createdDate;
	private LocalDateTime registrationDate;
	private LocalDateTime ConnectionDate;
	
	private String profileImageUrl;
	private String designation;
	private String startdate;
	private String employerName;
	
	public Long getUserId() {
		return userId;
	}

	public void setUserId(Long userId) {
		this.userId = userId;
	}

	/**
	 * @return the firstName
	 */
	public String getFirstName() {
		return firstName;
	}

	/**
	 * @param firstName the firstName to set
	 */
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	/**
	 * @return the lastName
	 */
	public String getLastName() {
		return lastName;
	}

	/**
	 * @param lastName the lastName to set
	 */
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	/**
	 * @return the mobileNumber
	 */
	public String getMobileNumber() {
		return mobileNumber;
	}

	/**
	 * @param mobileNumber the mobileNumber to set
	 */
	public void setMobileNumber(String mobileNumber) {
		this.mobileNumber = mobileNumber;
	}

	/**
	 * @return the emailId
	 */
	public String getEmail() {
		return email;
	}

	/**
	 * @param emailId the emailId to set
	 */
	public void setEmail(String email) {
		this.email = email;
	}

	/**
	 * @return the referedBy
	 */
	public Long getReferedBy() {
		return referedBy;
	}

	/**
	 * @param referedBy the referedBy to set
	 */
	public void setReferedBy(Long referedBy) {
		this.referedBy = referedBy;
	}

	/**
	 * @return the source
	 */
	public UserSource getSource() {
		return source;
	}

	/**
	 * @param source the source to set
	 */
	public void setSource(UserSource source) {
		this.source = source;
	}

	/**
	 * @return the inviteBy
	 */
	public String getInviteBy() {
		return inviteBy;
	}

	/**
	 * @param inviteBy the inviteBy to set
	 */
	public void setInviteBy(String inviteBy) {
		this.inviteBy = inviteBy;
	}

	/**
	 * @return the status
	 */
	public Status getStatus() {
		return status;
	}

	/**
	 * @param status the status to set
	 */
	public void setStatus(Status status) {
		this.status = status;
	}

	/**
	 * @return the inviteCode
	 */
	public String getInviteCode() {
		return inviteCode;
	}

	/**
	 * @param inviteCode the inviteCode to set
	 */
	public void setInviteCode(String inviteCode) {
		this.inviteCode = inviteCode;
	}

	/**
	 * @return the createdDate
	 */
	public LocalDateTime getCreatedDate() {
		return createdDate;
	}

	/**
	 * @param createdDate the createdDate to set
	 */
	public void setCreatedDate(LocalDateTime createdDate) {
		this.createdDate = createdDate;
	}

	/**
	 * @return the registrationDate
	 */
	public LocalDateTime getRegistrationDate() {
		return registrationDate;
	}

	/**
	 * @param registrationDate the registrationDate to set
	 */
	public void setRegistrationDate(LocalDateTime registrationDate) {
		this.registrationDate = registrationDate;
	}

	/**
	 * @return the connectionDate
	 */
	public LocalDateTime getConnectionDate() {
		return ConnectionDate;
	}

	/**
	 * @param connectionDate the connectionDate to set
	 */
	public void setConnectionDate(LocalDateTime connectionDate) {
		ConnectionDate = connectionDate;
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

	public String getStartdate() {
		return startdate;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}

	public void setStartdate(String startdate) {
		this.startdate = startdate;
	}

	public String getEmployerName() {
		return employerName;
	}

	public void setEmployerName(String employerName) {
		this.employerName = employerName;
	}

	
}
