package com.cts.cj.domain;

import java.time.LocalDateTime;

import org.neo4j.ogm.annotation.GeneratedValue;
import org.neo4j.ogm.annotation.Id;
import org.neo4j.ogm.annotation.NodeEntity;

@NodeEntity
public class FileUpload {
	
	@Id
	@GeneratedValue
	private Long fileId;
	
    private String fileName;
	
	private Long userId;
	
	private String uploadType;
	
	
	public String getUploadType() {
		return uploadType;
	}

	public void setUploadType(String uploadType) {
		this.uploadType = uploadType;
	}

	private LocalDateTime uploadedTime;
	
	public LocalDateTime getUploadedTime() {
		return uploadedTime;
	}

	public void setUploadedTime(LocalDateTime uploadedTime) {
		this.uploadedTime = uploadedTime;
	}

	public Long getUserId() {
		return userId;
	}

	public void setUserId(Long userId) {
		this.userId = userId;
	}

	private String uploadedUrl;
	
	public Long getFileId() {
		return fileId;
	}

	public void setFileId(Long fileId) {
		this.fileId = fileId;
	}

	public String getFileName() {
		return fileName;
	}

	public void setFileName(String fileName) {
		this.fileName = fileName;
	}


	public String getUploadedUrl() {
		return uploadedUrl;
	}

	public void setUploadedUrl(String uploadedUrl) {
		this.uploadedUrl = uploadedUrl;
	}

	
	

}
