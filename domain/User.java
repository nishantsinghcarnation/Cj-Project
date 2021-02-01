package com.cts.cj.domain;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.List;

import org.neo4j.ogm.annotation.GeneratedValue;
import org.neo4j.ogm.annotation.Id;
import org.neo4j.ogm.annotation.NodeEntity;
import org.neo4j.ogm.annotation.Property;
import org.neo4j.ogm.annotation.Relationship;
import org.neo4j.ogm.annotation.Transient;

import com.cts.cj.constants.Status;
import com.cts.cj.constants.UserSource;

@NodeEntity
public class User implements Serializable {
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue()
	private Long id;

	@Property(name = "last_name")
	private String lastName;

	private String password;

	@Property(name = "first_name")
	private String firstName;

	@Property(name = "mobile_number")
	private String mobileNumber;

	@Property(name = "email")
	private String emailId;

	private Long referedBy;
	private UserSource source;
	private String inviteBy;
	private Status status = Status.INACTIVE;

	@Property(name = "inviteCode")
	private String inviteCode;
	@Property(name = "quickboxuserid")
	private String qbid;

	private LocalDateTime createdDate;

	private LocalDateTime registrationDate;

	private String nationality;

	private String maritalStatus;

	private String dateOfBirth;

	private String alternateEmail;

	private String alternateMobileNumber;

	private String gender;
	private String country;
	private String city;
	private String state;
	private String addressLine1;
	private String addressLine2;
	private String zipCode;
	private String profileImageUrl;
	private String designation;

	private LocalDateTime ModifiedDate;

	private Boolean isResetPassword;

	public LocalDateTime getModifiedDate() {
		return ModifiedDate;
	}

	public void setModifiedDate(LocalDateTime modifiedDate) {
		ModifiedDate = modifiedDate;
	}

	public Boolean getIsResetPassword() {
		return isResetPassword;
	}

	public void setIsResetPassword(Boolean isResetPassword) {
		this.isResetPassword = isResetPassword;
	}

	public LocalDateTime getCreatedDate() {
		return createdDate;
	}

	public void setCreatedDate(LocalDateTime createdDate) {
		this.createdDate = createdDate;
	}

	public String getDesignation() {
		return designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}

	@Transient
	private String roleType;

	@Transient
	private String src;

	public String getNationality() {
		return nationality;
	}

	public void setNationality(String nationality) {
		this.nationality = nationality;
	}

	public String getMaritalStatus() {
		return maritalStatus;
	}

	public void setMaritalStatus(String maritalStatus) {
		this.maritalStatus = maritalStatus;
	}

	public String getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(String dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	public String getAlternateEmail() {
		return alternateEmail;
	}

	public void setAlternateEmail(String alternateEmail) {
		this.alternateEmail = alternateEmail;
	}

	public String getAlternateMobileNumber() {
		return alternateMobileNumber;
	}

	public void setAlternateMobileNumber(String alternateMobileNumber) {
		this.alternateMobileNumber = alternateMobileNumber;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public void setId(Long id) {
		this.id = id;
	}

	/*
	 * @Property(name = "change_pass_on_first_login") private boolean
	 * forceToChangePassword;
	 */

	/*
	 * @Relationship(type = "HAS_EMAIL_MESSAGE", direction = Relationship.OUTGOING)
	 * private List<EmailMessage> emailMessege;
	 * 
	 * @Relationship(type = "HAS_POST", direction = Relationship.UNDIRECTED) private
	 * List<Post> postExists;
	 */

	@Relationship(type = "HAS_SKILL", direction = Relationship.OUTGOING)
	private List<Skill> skill;

	@Relationship(type = "HAS_ROLETYPE", direction = Relationship.OUTGOING)
	private List<Role> roles;

	@Relationship(type = "HAS_EDUCATION", direction = Relationship.OUTGOING)
	private List<Education> educations;

	@Relationship(type = "HAS_OCCUPATION", direction = Relationship.OUTGOING)
	private List<Occupation> occupation;

	private String connectionDate;

	public String getConnectionDate() {
		return connectionDate;
	}

	public void setConnectionDate(String connectionDate) {
		this.connectionDate = connectionDate;
	}

	public List<Education> getEducation() {
		return educations;
	}

	public void setEducation(List<Education> educations) {
		this.educations = educations;
	}

	public List<Occupation> getOccupation() {
		return occupation;
	}

	public void setOccupation(List<Occupation> occupations) {
		this.occupation = occupations;
	}

	/*
	 * public List<Post> getPostExists() { return postExists; }
	 * 
	 * public void setPostExists(List<Post> postExists) { this.postExists =
	 * postExists; }
	 * 
	 */
	public Long getReferedBy() {
		return referedBy;
	}

	public void setReferedBy(Long referedBy) {
		this.referedBy = referedBy;
	}

	/*
	 * public List<EmailMessage> getEmailMessege() { return emailMessege; }
	 * 
	 * public void setEmailMessege(List<EmailMessage> emailMessege) {
	 * this.emailMessege = emailMessege; }
	 */

	public String getInviteBy() {
		return inviteBy;
	}

	public void setInviteBy(String inviteBy) {
		this.inviteBy = inviteBy;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public Status getStatus() {
		return status;
	}

	public void setStatus(com.cts.cj.constants.Status status) {
		this.status = status;
	}

	public String getRoleType() {
		return roleType;
	}

	public void setRoleType(String roleType) {
		this.roleType = roleType;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public List<Role> getRole() {
		return roles;
	}

	public void setRole(List<Role> roles) {
		this.roles = roles;
	}

	public String getMobileNumber() {
		return mobileNumber;
	}

	public void setMobileNumber(String mobileNumber) {
		this.mobileNumber = mobileNumber;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getEmailId() {
		return emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	/*
	 * public boolean isForceToChangePassword() { return forceToChangePassword; }
	 * 
	 * public void setForceToChangePassword(boolean forceToChangePassword) {
	 * this.forceToChangePassword = forceToChangePassword; }
	 */

	public UserSource getSource() {
		return source;
	}

	public void setSource(UserSource source) {
		this.source = source;
	}

	public String getSrc() {
		return src;
	}

	public void setSrc(String src) {
		this.src = src;
	}


	public String getQbid() {
		return qbid;
	}

	public void setQbid(String qbid) {
		this.qbid = qbid;
	}

	public String getInviteCode() {
		return inviteCode;
	}

	public void setInviteCode(String inviteCode) {
		this.inviteCode = inviteCode;
	}

	public LocalDateTime getRegistrationDate() {
		return registrationDate;
	}

	public void setRegistrationDate(LocalDateTime registrationDate) {
		this.registrationDate = registrationDate;
	}

	public String getCity() {
		return city;
	}

	public String getState() {
		return state;
	}

	public String getAddressLine1() {
		return addressLine1;
	}

	public String getAddressLine2() {
		return addressLine2;
	}

	public String getZipCode() {
		return zipCode;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public void setState(String state) {
		this.state = state;
	}

	public void setAddressLine1(String addressLine1) {
		this.addressLine1 = addressLine1;
	}

	public void setAddressLine2(String addressLine2) {
		this.addressLine2 = addressLine2;
	}

	public void setZipCode(String zipCode) {
		this.zipCode = zipCode;
	}

	public String getProfileImageUrl() {
		return profileImageUrl;
	}

	public void setProfileImageUrl(String profileImageUrl) {
		this.profileImageUrl = profileImageUrl;
	}

	public List<Skill> getSkill() {
		return skill;
	}

	public void setSkill(List<Skill> skill) {
		this.skill = skill;
	}

}