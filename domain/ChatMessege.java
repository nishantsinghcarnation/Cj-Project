package com.cts.cj.domain;

import java.time.LocalDateTime;

import org.neo4j.ogm.annotation.GeneratedValue;
import org.neo4j.ogm.annotation.Id;
import org.neo4j.ogm.annotation.NodeEntity;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.Transient;

@NodeEntity
public class ChatMessege {

	@Id
	@GeneratedValue
	private Long messageId;

	private String messege;

	@CreatedDate
	LocalDateTime created;
	
	@Transient
    String chatedDate;

	public String getChatedDate() {
		return chatedDate;
	}

	public void setChatedDate(String chatedDate) {
		this.chatedDate = chatedDate;
	}

	public LocalDateTime getCreated() {
		return created;
	}

	public void setCreated(LocalDateTime created) {
		this.created = created;
	}

	private Long recieverId;

	private Long senderId;

	public Long getSenderId() {
		return senderId;
	}

	public void setSenderId(Long senderId) {
		this.senderId = senderId;
	}

	public Long getRecieverId() {
		return recieverId;
	}

	public void setRecieverId(Long recieverId) {
		this.recieverId = recieverId;
	}

	public Long getMessageId() {
		return messageId;
	}

	public void setMessageId(Long messageId) {
		this.messageId = messageId;
	}

	public String getMessege() {
		return messege;
	}

	public void setMessege(String messege) {
		this.messege = messege;
	}

}
