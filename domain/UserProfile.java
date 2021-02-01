package com.cts.cj.domain;

import java.util.List;

import org.neo4j.ogm.annotation.GeneratedValue;
import org.neo4j.ogm.annotation.Id;
import org.neo4j.ogm.annotation.NodeEntity;
import org.neo4j.ogm.annotation.Relationship;

@NodeEntity
public class UserProfile {
	
	@Id
	@GeneratedValue
	private Long profileId;
	
	private Long userId; 
	
	private String firstName;
	
	private String gender;

	private String lastName;
	
	private String nationality;
	
	private String maritalStatus;
	
	private String  dateOfBirth;
	
	private String alternateEmail;
	
	private String alternateMobileNumber;
	
	private String countryCode;
	
	private String mobileNumber;
	
	
	public String getMobileNumber() {
		return mobileNumber;
	}

	public void setMobileNumber(String mobileNumber) {
		this.mobileNumber = mobileNumber;
	}

	public String getCountryCode() {
		return countryCode;
	}

	public void setCountryCode(String countryCode) {
		this.countryCode = countryCode;
	}

	public String getAlternateMobileNumber() {
		return alternateMobileNumber;
	}

	public void setAlternateMobileNumber(String alternateMobileNumber) {
		this.alternateMobileNumber = alternateMobileNumber;
	}

	public String getAlternateEmail() {
		return alternateEmail;
	}

	public void setAlternateEmail(String alternateEmail) {
		this.alternateEmail = alternateEmail;
	}

	public String getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(String dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	private String emailId;
	
	
	public String getEmailId() {
		return emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	@Relationship(type = "HAS_PROFILE", direction = Relationship.INCOMING)
	private User userProfile;
	
	@Relationship(type = "HAS_CONTACT_DETAILS", direction = Relationship.OUTGOING)
	private Address address;
	
	@Relationship(type = "HAS_OCCUPATION", direction = Relationship.OUTGOING)
	private    List <Occupation> occupations;
	
	
	public List<Occupation> getOccupations() {
		return occupations;
	}

	public void setOccupations(List<Occupation> occupations) {
		this.occupations = occupations;
	}

	@Relationship(type = "HAS_IDENTITY", direction = Relationship.OUTGOING)
	private     IdentityDetails identityDetails;
	
	
	@Relationship(type = "HAS_EDUCATION", direction = Relationship.OUTGOING)
	private     List <Education> Education;
	
	public List<Education> getEducation() {
		return Education;
	}

	public void setEducation(List<Education> education) {
		Education = education;
	}

	@Relationship(type = "HAS_OCCUPATION_STAUS", direction = Relationship.OUTGOING)
	private    OccupationStaus OccupationStaus;
	
	
	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
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

	

	public User getUserProfile() {
		return userProfile;
	}

	public void setUserProfile(User userProfile) {
		this.userProfile = userProfile;
	}

	public OccupationStaus getOccupationStaus() {
		return OccupationStaus;
	}

	public void setOccupationStaus(OccupationStaus occupationStaus) {
		OccupationStaus = occupationStaus;
	}

	
	public User getUserprofile() {
		return userProfile;
	}

	public void setUserprofile(User userprofile) {
		this.userProfile = userprofile;
	}

	public Long getUserId() {
		return userId;
	}

	public void setUserId(Long userId) {
		this.userId = userId;
	}



	public IdentityDetails getIdentityDetails() {
		return identityDetails;
	}

	public void setIdentityDetails(IdentityDetails identityDetails) {
		this.identityDetails = identityDetails;
	}

	

	
	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}	
	
	
	public Long getProfileId() {
		return profileId;
	}

	public void setProfileId(Long profileId) {
		this.profileId = profileId;
	}
	
}
