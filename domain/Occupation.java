package com.cts.cj.domain;

import java.time.LocalDateTime;

import org.neo4j.ogm.annotation.GeneratedValue;
import org.neo4j.ogm.annotation.Id;
import org.neo4j.ogm.annotation.NodeEntity;

@NodeEntity(label="Occupation")
public class Occupation {
	
	@Id
	@GeneratedValue
	private Long occupationId;
	private String occupationName;
	private String occupationStatus;
	private String employerName;
	private String designation;
	private boolean tillDate;
	private Long userId;
	private String startdate;
	private String endDate;
	private LocalDateTime createdDate;
	
	public boolean isTillDate() {
		return tillDate;
	}

	public void setTillDate(boolean tillDate) {
		this.tillDate = tillDate;
	}
	
	public String getOccupationStatus() {
		return occupationStatus;
	}

	public void setOccupationStatus(String occupationStatus) {
		this.occupationStatus = occupationStatus;
	}

	public Long getUserId() {
		return userId;
	}

	public void setUserId(Long userId) {
		this.userId = userId;
	}

	
	public String getStartdate() {
		return startdate;
	}

	public void setStartdate(String startdate) {
		this.startdate = startdate;
	}
	public String getEndDate() {
		return endDate;
	}

	public void setEndDate(String endDate) {
		this.endDate = endDate;
	}

	public String getDesignation() {
		return designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}

	public String getEmployerName() {
		return employerName;
	}

	public void setEmployerName(String employerName) {
		this.employerName = employerName;
	}

	public Long getOccupationId() {
		return occupationId;
	}

	public void setOccupationId(Long occupationId) {
		this.occupationId = occupationId;
	}

	public String getOccupationName() {
		return occupationName;
	}

	public void setOccupationName(String occupationName) {
		this.occupationName = occupationName;
	}

	public LocalDateTime getCreatedDate() {
		return createdDate;
	}

	public void setCreatedDate(LocalDateTime createdDate) {
		this.createdDate = createdDate;
	}

}
