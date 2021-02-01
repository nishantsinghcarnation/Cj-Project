package com.cts.cj.dto;

import java.time.LocalDateTime;
import java.util.List;

import org.neo4j.ogm.annotation.GeneratedValue;
import org.neo4j.ogm.annotation.Id;
import org.neo4j.ogm.annotation.Relationship;
import org.springframework.data.annotation.CreatedDate;

import com.cts.cj.domain.Comment;
import com.cts.cj.domain.Group;
import com.cts.cj.domain.PostUrl;
import com.cts.cj.domain.User;

public class PostDto {
	private Long id;
	
	private String content;
	
	private Long createdBy;
	
	private String strCreatedBy;
	
	private String profileImageUrl;
	private LocalDateTime createdDate;
	
	private Boolean isPrivate = Boolean.FALSE;
	private Boolean isDeleted = Boolean.FALSE;
	private List<PostUrl> urlList;
	private List<User> memberList;
	private List<Group> groupList;
	private List<Comment> commentList;
	private List<Long> tagUserlist;
	private Boolean expandOne = Boolean.FALSE;
	private Boolean expandTwo = Boolean.FALSE;
	
	/**
	 * @return the commentList
	 */
	public List<Comment> getCommentList() {
		return commentList;
	}

	/**
	 * @param commentList the commentList to set
	 */
	public void setCommentList(List<Comment> commentList) {
		this.commentList = commentList;
	}

	public Long getCreatedBy() {
		return createdBy;
	}

	public void setCreatedBy(Long createdBy) {
		this.createdBy = createdBy;
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
	 * @return the createdDate
	 */
	public LocalDateTime getCreatedDate() {
		return createdDate;
	}

	/**
	 * @param createdDate the createdDate to set
	 */
	public void setCreatedDate(LocalDateTime createdDate) {
		this.createdDate = createdDate;
	}

	/**
	 * @return the urlList
	 */
	public List<PostUrl> getUrlList() {
		return urlList;
	}

	/**
	 * @param urlList the urlList to set
	 */
	public void setUrlList(List<PostUrl> urlList) {
		this.urlList = urlList;
	}

	/**
	 * @return the memberList
	 */
	

	/**
	 * @param memberList the memberList to set
	 */
	

	/**
	 * @return the groupList
	 */
	public List<Group> getGroupList() {
		return groupList;
	}



	public List<User> getMemberList() {
		return memberList;
	}

	public void setMemberList(List<User> memberList) {
		this.memberList = memberList;
	}

	/**
	 * @param groupList the groupList to set
	 */
	public void setGroupList(List<Group> groupList) {
		this.groupList = groupList;
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
	 * @return the isDeleted
	 */
	public Boolean getIsDeleted() {
		return isDeleted;
	}

	/**
	 * @param isDeleted the isDeleted to set
	 */
	public void setIsDeleted(Boolean isDeleted) {
		this.isDeleted = isDeleted;
	}

	public String getStrCreatedBy() {
		return strCreatedBy;
	}

	public void setStrCreatedBy(String strCreatedBy) {
		this.strCreatedBy = strCreatedBy;
	}

	public String getProfileImageUrl() {
		return profileImageUrl;
	}

	public void setProfileImageUrl(String profileImageUrl) {
		this.profileImageUrl = profileImageUrl;
	}

	public List<Long> getTagUserlist() {
		return tagUserlist;
	}

	public void setTagUserlist(List<Long> tagUserlist) {
		this.tagUserlist = tagUserlist;
	}

	public Boolean getExpandOne() {
		return expandOne;
	}

	public Boolean getExpandTwo() {
		return expandTwo;
	}

	public void setExpandOne(Boolean expandOne) {
		this.expandOne = expandOne;
	}

	public void setExpandTwo(Boolean expandTwo) {
		this.expandTwo = expandTwo;
	}
	
	
}
