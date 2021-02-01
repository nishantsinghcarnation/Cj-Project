/**
 * 
 */
package com.cts.cj.dto;

import java.util.List;

import org.springframework.web.multipart.MultipartFile;

/**
 * @author Shikha.Mishra
 *
 */
public class PostUrlDto {
	
	private Long id;
	private MultipartFile files [];
	private String content;
	private Long createdBy;
	private List<Long> groupId;
	private List<Long> tagUsers;
	private Boolean isPrivate = Boolean.FALSE;
	private List<String> primaryFiles;
	
	/**
	 * @return the content
	 */
	public String getContent() {
		return content;
	}
	/**
	 * @param content the content to set
	 */
	public void setContent(String content) {
		this.content = content;
	}
	/**
	 * @return the isPrivate
	 */
	public boolean isPrivate() {
		return isPrivate;
	}
	/**
	 * @param isPrivate the isPrivate to set
	 */
	public void setPrivate(boolean isPrivate) {
		this.isPrivate = isPrivate;
	}
//	/**
//	 * @return the isPrimary
//	 */
//	public boolean isPrimary() {
//		return isPrimary;
//	}
//	/**
//	 * @param isPrimary the isPrimary to set
//	 */
//	public void setPrimary(boolean isPrimary) {
//		this.isPrimary = isPrimary;
//	}
	/**
	 * @return the createdBy
	 */
	public Long getCreatedBy() {
		return createdBy;
	}
	/**
	 * @param createdBy the createdBy to set
	 */
	public void setCreatedBy(Long createdBy) {
		this.createdBy = createdBy;
	}
	
	public List<String> getPrimaryFiles() {
		return primaryFiles;
	}
	public void setPrimaryFiles(List<String> primaryFiles) {
		this.primaryFiles = primaryFiles;
	}
	/**
	 * @return the groupId
	 */
	public List<Long> getGroupId() {
		return groupId;
	}
	/**
	 * @param groupId the groupId to set
	 */
	public void setGroupId(List<Long> groupId) {
		this.groupId = groupId;
	}
	/**
	 * @return the isPrivate
	 */
	public Boolean getIsPrivate() {
		return isPrivate;
	}
	/**
	 * @param isPrivate the isPrivate to set
	 */
	public void setIsPrivate(Boolean isPrivate) {
		this.isPrivate = isPrivate;
	}
	/**
	 * @return the id
	 */
	public Long getId() {
		return id;
	}
	/**
	 * @param id the id to set
	 */
	public void setId(Long id) {
		this.id = id;
	}
	
	/**
	 * @return the files
	 */
	public MultipartFile[] getFiles() {
		return files;
	}
	/**
	 * @param files the files to set
	 */
	public void setFiles(MultipartFile[] files) {
		this.files = files;
	}
	/**
	 * @return the tagUsers
	 */
	public List<Long> getTagUsers() {
		return tagUsers;
	}
	/**
	 * @param tagUsers the tagUsers to set
	 */
	public void setTagUsers(List<Long> tagUsers) {
		this.tagUsers = tagUsers;
	}
	
}
