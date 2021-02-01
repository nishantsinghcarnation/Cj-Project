package com.cts.cj.scheduler;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import com.cts.cj.constants.EmailSendStatus;
import com.cts.cj.domain.EmailMessage;
import com.cts.cj.repository.MessageRepository;
import com.cts.cj.util.CJUtilCommon;

@Component
public class EmailScheduler {
	/*
	 * 
	 * 
	 * 
	 * public static final Logger logger =
	 * LoggerFactory.getLogger(EmailScheduler.class);
	 * 
	 * @Autowired CJUtilCommon i2iCommonUtil;
	 * 
	 * @Autowired MessageRepository messageRepository;
	 * 
	 * @Scheduled(cron = "0 * * * * ?") public void cronJobSch() {
	 * 
	 * List<EmailMessage> deliverymessage = messageRepository.getMessage();
	 * if(deliverymessage!=null) { for (EmailMessage emailtosend : deliverymessage)
	 * { int attempts = emailtosend.getAttempts(); if (attempts < 3) { try {
	 * i2iCommonUtil.sendMail(new String[] { emailtosend.getRecieverEmail() },
	 * emailtosend.getMessage(), emailtosend.getSubject()); logger.debug("message: "
	 * + emailtosend); emailtosend.setEmailsendStatus(EmailSendStatus.SENT);
	 * 
	 * } catch (Exception ex) {
	 * emailtosend.setEmailsendStatus(EmailSendStatus.FAILED);
	 * logger.error("Error scheduling email", ex); } attempts++;
	 * emailtosend.setAttempts(attempts); messageRepository.save(emailtosend); } } }
	 * else { logger.info("There is no scheduled Email found to send"); } }
	 * 
	 */}
