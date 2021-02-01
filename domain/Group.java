/**
 * 
 */
package com.cts.cj.domain;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.List;

import org.neo4j.ogm.annotation.GeneratedValue;
import org.neo4j.ogm.annotation.Id;
import org.neo4j.ogm.annotation.NodeEntity;
import org.neo4j.ogm.annotation.Property;
import org.neo4j.ogm.annotation.Relationship;

/**
 * @author Shikha.Mishra
 *
 */
@NodeEntity
public class Group implements Serializable{
	
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue()
	private Long id;
	
	@Property(name = "groupName")
	private String groupName;
	
	@Property(name = "description")
	private String description;
	
	@Property(name = "groupImageUrl")
	private String groupImageUrl;
	
	private LocalDateTime createdDate;
	
	@Property(name = "createdBy")
	private Long createdBy;
	
	//@Property(name = "userIds")
	private List<Long> userIds;
	
	@Property(name = "isDeleted")
	private boolean isDeleted = false;
	
	private List<User> loggedInUserlist;
	
	@Relationship(type = "HAS_ASSOCIATED_MEMBER", direction = Relationship.OUTGOING)
	private List<User> memberList;
	
	private List<User> groupCreater;	
	
	private String createdByName;

	public String getGroupName() {
		return groupName;
	}

	public String getDescription() {
		return description;
	}

	public String getGroupImageUrl() {
		return groupImageUrl;
	}

	public Long getCreatedBy() {
		return createdBy;
	}

	public List<Long> getUserIds() {
		return userIds;
	}

	public boolean isDeleted() {
		return isDeleted;
	}

	

	public void setGroupName(String groupName) {
		this.groupName = groupName;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public void setGroupImageUrl(String groupImageUrl) {
		this.groupImageUrl = groupImageUrl;
	}

	

	public void setCreatedBy(Long createdBy) {
		this.createdBy = createdBy;
	}

	public void setUserIds(List<Long> userIds) {
		this.userIds = userIds;
	}

	public void setDeleted(boolean isDeleted) {
		this.isDeleted = isDeleted;
	}

	public LocalDateTime getCreatedDate() {
		return createdDate;
	}

	public void setCreatedDate(LocalDateTime createdDate) {
		this.createdDate = createdDate;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public List<User> getLoggedInUserlist() {
		return loggedInUserlist;
	}

	public List<User> getMemberList() {
		return memberList;
	}

	public void setLoggedInUserlist(List<User> loggedInUserlist) {
		this.loggedInUserlist = loggedInUserlist;
	}

	public void setMemberList(List<User> memberList) {
		this.memberList = memberList;
	}

	public List<User> getGroupCreater() {
		return groupCreater;
	}

	public void setGroupCreater(List<User> groupCreater) {
		this.groupCreater = groupCreater;
	}

	public String getCreatedByName() {
		return createdByName;
	}

	public void setCreatedByName(String createdByName) {
		this.createdByName = createdByName;
	}

	
	
	
}
