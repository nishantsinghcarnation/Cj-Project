package com.cts.cj.dto;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import org.springframework.data.annotation.CreatedDate;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

@JsonInclude(Include.NON_NULL)
public class MessageRequestResponsePaginated implements Serializable {
	private static final long serialVersionUID = 1L;

	private Integer currentPageNo;
	private String timeStr;
	List<MessageRequestResponse> messages = new ArrayList<>();
	
	@CreatedDate
	LocalDateTime created;

	public MessageRequestResponsePaginated(Integer currentPageNo, String timeStr,
			List<MessageRequestResponse> messages) {
		super();
		this.currentPageNo = currentPageNo;
		this.timeStr = timeStr;
		this.messages = messages;
	}
	
	public MessageRequestResponsePaginated(
			List<MessageRequestResponse> messages) {
		super();
		
	}

	public MessageRequestResponsePaginated() {
	}


	public Integer getCurrentPageNo() {
		return currentPageNo;
	}

	public void setCurrentPageNo(Integer currentPageNo) {
		this.currentPageNo = currentPageNo;
	}

	public String getTimeStr() {
		return timeStr;
	}

	public void setTimeStr(String timeStr) {
		this.timeStr = timeStr;
	}

	public List<MessageRequestResponse> getMessages() {
		return messages;
	}

	public void setMessages(List<MessageRequestResponse> messages) {
		this.messages = messages;
	}

}