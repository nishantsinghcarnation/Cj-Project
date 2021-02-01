/**
 * 
 */
package com.cts.cj.domain;

import java.time.LocalDateTime;
import java.util.List;
import org.neo4j.ogm.annotation.NodeEntity;
import org.neo4j.ogm.annotation.Relationship;
import org.springframework.data.annotation.CreatedDate;

/**
 * @author Shikha.Mishra
 *
 */
@NodeEntity
public class Comment {

	private Long id;
	private String comment;
	private Boolean isDeleted = Boolean.FALSE;
	@CreatedDate
	private LocalDateTime createdDate;
	private String strCreatedByName;
	private Long createdBy;

	@Relationship(type = "HAS_ASSOCIATED_URL", direction = Relationship.OUTGOING)
	private List<CommentUrl> urlList;
	private String profileImageUrl;
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
	 * @return the comment
	 */
	public String getComment() {
		return comment;
	}
	/**
	 * @param comment the comment to set
	 */
	public void setComment(String comment) {
		this.comment = comment;
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
	public String getStrCreatedByName() {
		return strCreatedByName;
	}
	public Long getCreatedBy() {
		return createdBy;
	}
	public void setStrCreatedByName(String strCreatedByName) {
		this.strCreatedByName = strCreatedByName;
	}
	public void setCreatedBy(Long createdBy) {
		this.createdBy = createdBy;
	}

	/**
	 * @return the urlList
	 */
	public List<CommentUrl> getUrlList() {
		return urlList;
	}
	/**
	 * @param urlList the urlList to set
	 */
	public void setUrlList(List<CommentUrl> urlList) {
		this.urlList = urlList;
	}
	public String getProfileImageUrl() {
		return profileImageUrl;
	}
	public void setProfileImageUrl(String profileImageUrl) {
		this.profileImageUrl = profileImageUrl;
	}
	
}
