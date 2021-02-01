package com.cts.cj.domain;

import java.time.LocalDateTime;
import java.util.List;

import org.neo4j.ogm.annotation.GeneratedValue;
import org.neo4j.ogm.annotation.Id;
import org.neo4j.ogm.annotation.NodeEntity;
import org.neo4j.ogm.annotation.Relationship;
import org.neo4j.ogm.annotation.Transient;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;

@NodeEntity
public class PostPrevious {

	@Id
	@GeneratedValue
	private Long postId;

	private String postDescription;

	@CreatedDate
	LocalDateTime created;

	@LastModifiedDate
	LocalDateTime updated;

	private String whomToShare;
	
	@Transient
	private String firstName;
	
	
	@Transient
	private String lastName;
	
	
	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	@Transient
	private String mobileNumer;
	
	
	public String getMobileNumer() {
		return mobileNumer;
	}

	public void setMobileNumer(String mobileNumer) {
		this.mobileNumer = mobileNumer;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	private String postCreatedDate;
	
	public String getPostCreatedDate() {
		return postCreatedDate;
	}

	public void setPostCreatedDate(String postCreatedDate) {
		this.postCreatedDate = postCreatedDate;
	}

	@Relationship(type = "HAS_POST", direction = Relationship.OUTGOING)
	public List<User> usertoshare;

	public List<User> getUsertoshare() {
		return usertoshare;
	}

	public void setUsertoshare(List<User> usertoshare) {
		this.usertoshare = usertoshare;
	}

	public String getWhomToShare() {
		return whomToShare;
	}

	public void setWhomToShare(String whomToShare) {
		this.whomToShare = whomToShare;
	}

	public LocalDateTime getCreated() {
		return created;
	}

	public void setCreated(LocalDateTime created) {
		this.created = created;
	}

	public LocalDateTime getUpdated() {
		return updated;
	}

	public void setUpdated(LocalDateTime updated) {
		this.updated = updated;
	}

	private Long userId;

	public Long getUserId() {
		return userId;
	}

	public void setUserId(Long userId) {
		this.userId = userId;
	}

	public Long getPostId() {
		return postId;
	}

	public void setPostId(Long postId) {
		this.postId = postId;
	}

	public String getPostDescription() {
		return postDescription;
	}

	public void setPostDescription(String postDescription) {
		this.postDescription = postDescription;
	}

}
