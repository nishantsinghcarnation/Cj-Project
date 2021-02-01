package com.cts.cj.domain;

import java.io.Serializable;
import java.time.LocalDate;

import org.neo4j.ogm.annotation.GeneratedValue;
import org.neo4j.ogm.annotation.Id;
import org.neo4j.ogm.annotation.NodeEntity;

import com.cts.cj.constants.EmailEventType;
import com.cts.cj.constants.EmailSendStatus;

@NodeEntity
public class EmailMessage implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	
	@Id
	@GeneratedValue
	private Long messageId;
	
	
	private EmailEventType emaileventType;
	
	private EmailSendStatus emailsendStatus;
	
	public EmailSendStatus getEmailsendStatus() {
		return emailsendStatus;
	}

	public void setEmailsendStatus(EmailSendStatus emailsendStatus) {
		this.emailsendStatus = emailsendStatus;
	}

	public EmailEventType getEmaileventType() {
		return emaileventType;
	}

	public void setEmaileventType(EmailEventType emaileventType) {
		this.emaileventType = emaileventType;
	}

	private int attempts;
	
	private String eventType;
	
    private String message;
	
	private String subject;
	
	private LocalDate Datetime;
	
	private  String meetingDescription;
	

	
	public String getMeetingDescription() {
		return meetingDescription;
	}

	public void setMeetingDescription(String meetingDescription) {
		this.meetingDescription = meetingDescription;
	}


	
	private String  recieverEmail;
	
	
	public String getRecieverEmail() {
		return recieverEmail;
	}

	public void setRecieverEmail(String recieverEmail) {
		this.recieverEmail = recieverEmail;
	}

	public LocalDate getDatetime() {
		return Datetime;
	}

	public void setDatetime(LocalDate localDate) {
		Datetime = localDate;
	}

	public Long getMessageId() {
		return messageId;
	}

	public void setMessageId(Long messageId) {
		this.messageId = messageId;
	}

	
	public int getAttempts() {
		return attempts;
	}

	public void setAttempts(int attempts) {
		this.attempts = attempts;
	}

	public String getEventType() {
		return eventType;
	}

	public void setEventType(String eventType) {
		this.eventType = eventType;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

}
