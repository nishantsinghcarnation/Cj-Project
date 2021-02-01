package com.cts.cj.util;

import java.text.SimpleDateFormat;

import javax.mail.MessagingException;
import javax.mail.internet.MimeMessage;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.stereotype.Component;

import com.cts.cj.constants.UserSource;

@Component
public class CJUtilCommon {

	@Autowired
	private JavaMailSender javaMailSender;

	public SimpleDateFormat timeStampFormat = new SimpleDateFormat("dd-MM-yyyy HH:mm");

	/**
	 * @param emailId
	 * @param subject
	 * @param message method to send email to one recipient;
	 */
	public void sendMail(String[] emailIds,String emailMessage, String emailSubject) {

		MimeMessage msg = javaMailSender.createMimeMessage();
	
		MimeMessageHelper helper;
		try {
			helper = new MimeMessageHelper(msg, true);
			helper.setTo(emailIds);

			helper.setSubject(emailSubject);

			helper.setText(emailMessage, true);
			javaMailSender.send(msg);
		} catch (MessagingException e) {

			e.printStackTrace();
		}
	}

	private static String decodeUserSource(String random) {
		
		
		return random;
	}

	public static UserSource deCodeUserSource(String randomString) {
		// ToDO: decode the random string to get actual source
		String deCodedUserSource = decodeUserSource(randomString);
		

		if (deCodedUserSource.equalsIgnoreCase(UserSource.INVITED_BY_ADMIN.name())) {
			return UserSource.INVITED_BY_ADMIN;
		} else if (deCodedUserSource.equalsIgnoreCase(UserSource.INVITED_BY_MENTOR.name())) {
			return UserSource.INVITED_BY_MENTOR;
		} else if (deCodedUserSource.equalsIgnoreCase(UserSource.INVITED_BY_MENTEE.name())) {
			return UserSource.INVITED_BY_MENTEE;
		} else if (deCodedUserSource.equalsIgnoreCase(UserSource.NORMAL_SIGNUP.name())) {
			return UserSource.NORMAL_SIGNUP;
		}

		return null;

	}
	
	public static UserSource setUserSource(String inviteBy) {
		if (inviteBy.equalsIgnoreCase("MENTEE")) {
			return UserSource.INVITED_BY_MENTEE;
		}
		if (inviteBy.equalsIgnoreCase("MENTOR")) {
			return UserSource.INVITED_BY_MENTOR;
		}
		if (inviteBy.equalsIgnoreCase("ADMIN")) {
			return UserSource.INVITED_BY_ADMIN;
		}
		if (inviteBy.equalsIgnoreCase("USER")) {
			return UserSource.INVITED_BY_USER;
		}

		return null;

	}

	private static String encodeUserSource(String src) {
		return src;
	}

	public static String getEncodedUserSource(UserSource source) {
		return encodeUserSource(source.name());
	}
	
	
	public void sendMail(String emailId,String emailMessage, String emailSubject) throws MessagingException {
		
		MimeMessage msg = javaMailSender.createMimeMessage();
	
		MimeMessageHelper helper;
		try {
			helper = new MimeMessageHelper(msg, true);
			helper.setTo(emailId);

			helper.setSubject(emailSubject);

			helper.setText(emailMessage, true);
			javaMailSender.send(msg);
		} catch (Exception ex) {
			throw ex;
		}
	}
	
	public String getFileExtension(String fileName) {
		String fileExtension = "";
		// If fileName do not contain "." or starts with "." then it is not a valid file
		if (fileName.contains(".") && fileName.lastIndexOf(".") != 0) {
			fileExtension = fileName.substring(fileName.lastIndexOf(".") + 1);
		}

		return fileExtension;
	}
}
