package com.cts.cj.dto;

import java.time.LocalDateTime;
import java.util.List;

import org.springframework.web.multipart.MultipartFile;

import com.cts.cj.constants.Status;
import com.cts.cj.constants.UserSource;
import com.cts.cj.domain.Education;
import com.cts.cj.domain.Occupation;
import com.cts.cj.domain.Role;
import com.cts.cj.domain.Skill;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class UserDto {
	//private static final long serialVersionUID = 1L;
	
	private Long id;
	private String firstName;
	private String lastName;
	private String invitationCode;
	private String emailId;
	private String mobileNumber;
	private String password;	
	private Long referedBy;
	private UserSource source;	
	private String inviteBy;	
	private Status status = Status.INACTIVE;	
	private String nationality;	
	private String maritalStatus;	
	private String  dateOfBirth;	
	private String alternateEmail;	
	private String alternateMobileNumber;	
	private String gender;	
	private String roleType;	
	private String src;	
	//private boolean forceToChangePassword;	
	private String qbid;	
	/*
	 * private List<EmailMessage> emailMessege; private List<Post> postExists;
	 */
	private List<Role> roles;
	private String inviteCode;
	private LocalDateTime createdDate;
	private LocalDateTime registrationDate; 
	private String country;
	private String city;
	private String state;
	private String addressLine1;
	private String addressLine2;
	private String zipCode;
	private String profileImageUrl;
	private Boolean isBasicDetail=Boolean.FALSE;
	private Boolean isContactDetail=Boolean.FALSE;
	private Boolean isEducationDetail=Boolean.FALSE;
	private Boolean isExperienceDetail=Boolean.FALSE;
	private Boolean isSkillDetail=Boolean.FALSE;
	private Boolean isDeleteProfileImage=Boolean.FALSE;
	private List <Education> education;	
	private List <Occupation> occupation;	
	private List <Skill> skill;
	private MultipartFile profileImage;
	
	public Long getId() {
		return id;
	}
	public String getFirstName() {
		return firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public String getInvitationCode() {
		return invitationCode;
	}
	public String getEmailId() {
		return emailId;
	}
	public String getMobileNumber() {
		return mobileNumber;
	}
	public String getPassword() {
		return password;
	}
	public Long getReferedBy() {
		return referedBy;
	}
	public UserSource getSource() {
		return source;
	}
	public String getInviteBy() {
		return inviteBy;
	}
	public Status getStatus() {
		return status;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public void setInvitationCode(String invitationCode) {
		this.invitationCode = invitationCode;
	}
	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}
	public void setMobileNumber(String mobileNumber) {
		this.mobileNumber = mobileNumber;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public void setReferedBy(Long referedBy) {
		this.referedBy = referedBy;
	}
	public void setSource(UserSource source) {
		this.source = source;
	}
	public void setInviteBy(String inviteBy) {
		this.inviteBy = inviteBy;
	}
	public void setStatus(Status status) {
		this.status = status;
	}
	public String getNationality() {
		return nationality;
	}
	public String getMaritalStatus() {
		return maritalStatus;
	}
	public String getDateOfBirth() {
		return dateOfBirth;
	}
	public String getAlternateEmail() {
		return alternateEmail;
	}
	public String getAlternateMobileNumber() {
		return alternateMobileNumber;
	}
	public String getGender() {
		return gender;
	}
	public String getRoleType() {
		return roleType;
	}
	public String getSrc() {
		return src;
	}

	/*
	 * public boolean isForceToChangePassword() { return forceToChangePassword; }
	 */
	

	/*
	 * public List<EmailMessage> getEmailMessege() { return emailMessege; } public
	 * List<PostPrevious> getPostExists() { return postExists; }
	 */
	/*
	 * public List<Role> getRole() { return roles; }
	 */
	public void setNationality(String nationality) {
		this.nationality = nationality;
	}
	public void setMaritalStatus(String maritalStatus) {
		this.maritalStatus = maritalStatus;
	}
	public void setDateOfBirth(String dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}
	public void setAlternateEmail(String alternateEmail) {
		this.alternateEmail = alternateEmail;
	}
	public void setAlternateMobileNumber(String alternateMobileNumber) {
		this.alternateMobileNumber = alternateMobileNumber;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public void setRoleType(String roleType) {
		this.roleType = roleType;
	}
	public void setSrc(String src) {
		this.src = src;
	}
	/*
	 * public void setForceToChangePassword(boolean forceToChangePassword) {
	 * this.forceToChangePassword = forceToChangePassword; }
	 */
	

	/*
	 * public void setEmailMessege(List<EmailMessage> emailMessege) {
	 * this.emailMessege = emailMessege; } public void setPostExists(List<PostPrevious>
	 * postExists) { this.postExists = postExists; }
	 */
	/*
	 * public void setRole(List<Role> roles) { this.roles = roles; }
	 */
	public String getInviteCode() {
		return inviteCode;
	}
	public void setInviteCode(String inviteCode) {
		this.inviteCode = inviteCode;
	}
	public LocalDateTime getCreatedDate() {
		return createdDate;
	}
	public void setCreatedDate(LocalDateTime createdDate) {
		this.createdDate = createdDate;
	}
	
	public LocalDateTime getRegistrationDate() {
		return registrationDate;
	}
	public String getCountry() {
		return country;
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
	
	public void setRegistrationDate(LocalDateTime registrationDate) {
		this.registrationDate = registrationDate;
	}
	public void setCountry(String country) {
		this.country = country;
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
	
	public Boolean getIsBasicDetail() {
		return isBasicDetail;
	}
	public Boolean getIsContactDetail() {
		return isContactDetail;
	}
	public Boolean getIsEducationDetail() {
		return isEducationDetail;
	}
	public Boolean getIsExperienceDetail() {
		return isExperienceDetail;
	}
	public void setIsBasicDetail(Boolean isBasicDetail) {
		this.isBasicDetail = isBasicDetail;
	}
	public void setIsContactDetail(Boolean isContactDetail) {
		this.isContactDetail = isContactDetail;
	}
	public void setIsEducationDetail(Boolean isEducationDetail) {
		this.isEducationDetail = isEducationDetail;
	}
	public void setIsExperienceDetail(Boolean isExperienceDetail) {
		this.isExperienceDetail = isExperienceDetail;
	}
	public String getProfileImageUrl() {
		return profileImageUrl;
	}
	public void setProfileImageUrl(String profileImageUrl) {
		this.profileImageUrl = profileImageUrl;
	}
	public MultipartFile getProfileImage() {
		return profileImage;
	}
	public void setProfileImage(MultipartFile profileImage) {
		this.profileImage = profileImage;
	}
	public List<Education> getEducation() {
		return education;
	}
	public void setEducation(List<Education> education) {
		this.education = education;
	}
	public List<Occupation> getOccupation() {
		return occupation;
	}
	public void setOccupation(List<Occupation> occupation) {
		this.occupation = occupation;
	}
	public Boolean getIsSkillDetail() {
		return isSkillDetail;
	}
	public void setIsSkillDetail(Boolean isSkillDetail) {
		this.isSkillDetail = isSkillDetail;
	}
	public List<Skill> getSkill() {
		return skill;
	}
	public void setSkill(List<Skill> skill) {
		this.skill = skill;
	}
	public List<Role> getRole() {
		return roles;
	}

	public void setRole(List<Role> roles) {
		this.roles = roles;
	}
	public Boolean getIsDeleteProfileImage() {
		return isDeleteProfileImage;
	}
	public void setIsDeleteProfileImage(Boolean isDeleteProfileImage) {
		this.isDeleteProfileImage = isDeleteProfileImage;
	}
	public String getQbid() {
		return qbid;
	}
	public void setQbid(String qbid) {
		this.qbid = qbid;
	}
	
}
