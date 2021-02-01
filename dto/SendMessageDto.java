package com.cts.cj.dto;

public class SendMessageDto {
	
	private Long groupId;
	
	private String senderEmail;
	
	private String messgeDescription;

	public Long getGroupId() {
		return groupId;
	}

	public String getSenderEmail() {
		return senderEmail;
	}

	public String getMessgeDescription() {
		return messgeDescription;
	}

	public void setGroupId(Long groupId) {
		this.groupId = groupId;
	}

	public void setSenderEmail(String senderEmail) {
		this.senderEmail = senderEmail;
	}

	public void setMessgeDescription(String messgeDescription) {
		this.messgeDescription = messgeDescription;
	}

	
	
}
