package com.cts.cj.dto;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class EmailMessageDto {
	private String to;
	private String from;
	private String strMessage;
	public String getTo() {
		return to;
	}
	public String getFrom() {
		return from;
	}
	public String getStrMessage() {
		return strMessage;
	}
	public void setTo(String to) {
		this.to = to;
	}
	public void setFrom(String from) {
		this.from = from;
	}
	public void setStrMessage(String strMessage) {
		this.strMessage = strMessage;
	}
	
	
}
