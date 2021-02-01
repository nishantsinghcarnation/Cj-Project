package com.cts.cj.domain;

import org.neo4j.ogm.annotation.GeneratedValue;
import org.neo4j.ogm.annotation.Id;
import org.neo4j.ogm.annotation.NodeEntity;

@NodeEntity
public class OccupationStaus {

	@Id
	@GeneratedValue
	private Long occupStatusId;

	private String occupationStatus;

	public Long getOccupStatusId() {
		return occupStatusId;
	}

	public void setOccupStatusId(Long occupStatusId) {
		this.occupStatusId = occupStatusId;
	}

	public String getOccupationStatus() {
		return occupationStatus;
	}

	public void setOccupationStatus(String occupationStatus) {
		this.occupationStatus = occupationStatus;
	}

}
