package com.cts.cj.dto;

import org.springframework.web.multipart.MultipartFile;

public class CommentDto {
	
	private Long id;
	private MultipartFile files [];
	private String content;
	private Long postId;
	private Long commentedBy;
	
	public Long getId() {
		return id;
	}
	public MultipartFile[] getFiles() {
		return files;
	}
	public String getContent() {
		return content;
	}
	public Long getPostId() {
		return postId;
	}
	public Long getCommentedBy() {
		return commentedBy;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public void setFiles(MultipartFile[] files) {
		this.files = files;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public void setPostId(Long postId) {
		this.postId = postId;
	}
	public void setCommentedBy(Long commentedBy) {
		this.commentedBy = commentedBy;
	}

}
