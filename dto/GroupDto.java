package com.cts.cj.dto;

import java.util.List;

import org.springframework.web.multipart.MultipartFile;

import com.fasterxml.jackson.annotation.JsonInclude;
@JsonInclude(JsonInclude.Include.NON_NULL)
public class GroupDto {

	private Long groupId;
	
	private String groupName;
	
	private String description;
	
	private String groupImageUrl;
	
	private String createdDate;
	
	private Long createdBy;
	
	private List<Long> userIds;
	
	private Boolean isDeleted = Boolean.FALSE;
	
	private MultipartFile groupImage;

	private Boolean isGroupImageDeleted = Boolean.FALSE;
	
	public Long getGroupId() {
		return groupId;
	}

	public String getGroupName() {
		return groupName;
	}

	public String getDescription() {
		return description;
	}

	public String getCreatedDate() {
		return createdDate;
	}

	public Long getCreatedBy() {
		return createdBy;
	}

	public List<Long> getUserIds() {
		return userIds;
	}

	public Boolean getIsDeleted() {
		return isDeleted;
	}

	public void setGroupId(Long groupId) {
		this.groupId = groupId;
	}

	public void setGroupName(String groupName) {
		this.groupName = groupName;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public void setCreatedDate(String createdDate) {
		this.createdDate = createdDate;
	}

	

	public void setUserIds(List<Long> userIds) {
		this.userIds = userIds;
	}

	public void setIsDeleted(Boolean isDeleted) {
		this.isDeleted = isDeleted;
	}

	public String getGroupImageUrl() {
		return groupImageUrl;
	}

	public MultipartFile getGroupImage() {
		return groupImage;
	}

	public void setGroupImageUrl(String groupImageUrl) {
		this.groupImageUrl = groupImageUrl;
	}

	public void setGroupImage(MultipartFile groupImage) {
		this.groupImage = groupImage;
	}

	public Boolean getIsGroupImageDeleted() {
		return isGroupImageDeleted;
	}

	public void setIsGroupImageDeleted(Boolean isGroupImageDeleted) {
		this.isGroupImageDeleted = isGroupImageDeleted;
	}

	public void setCreatedBy(Long createdBy) {
		this.createdBy = createdBy;
	}
	
	
	
	


}
