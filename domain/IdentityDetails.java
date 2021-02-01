package com.cts.cj.domain;

import org.neo4j.ogm.annotation.GeneratedValue;
import org.neo4j.ogm.annotation.Id;
import org.neo4j.ogm.annotation.NodeEntity;

@NodeEntity
public class IdentityDetails {
	
	@Id
	@GeneratedValue
	private Long identityDetailsId;

	private String pan;
	
	private  String passport;

	public String getPassport() {
		return passport;
	}

	public void setPassport(String passport) {
		this.passport = passport;
	}

	public String getPan() {
		return pan;
	}

	public void setPan(String pan) {
		this.pan = pan;
	}

	private String aadharNumber;
	
	private String sSN;
	
	private String driverLicence;
	
	 public String getDriverLicence() {
		return driverLicence;
	}

	public void setDriverLicence(String driverLicence) {
		this.driverLicence = driverLicence;
	}

	private Long userId;

	public Long getUserId() {
		return userId;
	}

	public void setUserId(Long userId) {
		this.userId = userId;
	}

	

	public String getsSN() {
		return sSN;
	}

	public void setsSN(String sSN) {
		this.sSN = sSN;
	}

	public Long getIdentityDetailsId() {
		return identityDetailsId;
	}

	public void setIdentityDetailsId(Long identityDetailsId) {
		this.identityDetailsId = identityDetailsId;
	}

	
	public String getAadharNumber() {
		return aadharNumber;
	}

	public void setAadharNumber(String aadharNumber) {
		this.aadharNumber = aadharNumber;
	}

}
