package com.cts.cj.domain;

import org.neo4j.ogm.annotation.GeneratedValue;
import org.neo4j.ogm.annotation.Id;
import org.neo4j.ogm.annotation.NodeEntity;
import org.neo4j.ogm.annotation.Property;

@NodeEntity
public class Invitaition {
	
	@Id
	@GeneratedValue()
	private Long id;
	
	@Property(name="email")
	private String email;
	
	@Property(name="inviteCode")
	private String invitationCode;
	
	@Property(name="status")
	private String status;

	public Long getId() {
		return id;
	}

	public String getEmail() {
		return email;
	}

	public String getInvitationCode() {
		return invitationCode;
	}

	public String getStatus() {
		return status;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public void setInvitationCode(String invitationCode) {
		this.invitationCode = invitationCode;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	
	
}
