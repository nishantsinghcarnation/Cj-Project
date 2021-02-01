package com.cts.cj.util;

import java.util.Random;
import java.util.regex.Pattern;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.util.StringUtils;

import com.cts.cj.domain.User;

public class CJUtil {

	private String errorMessage;

	public CJUtil(String errorMessage) {
		this.errorMessage = errorMessage;
	}

	public String getErrorMessage() {
		return errorMessage;

	}

	private static final String ALPHA_NUMERIC_STRING = "ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";

	public static String randomAlphaNumeric(int count) {
		StringBuilder builder = new StringBuilder();
		while (count-- != 0) {
			int character = (int) (Math.random() * ALPHA_NUMERIC_STRING.length());
			builder.append(ALPHA_NUMERIC_STRING.charAt(character));
		}
		return builder.toString();
	}
	
	public static String randomNumber() {
		int count=6;
		StringBuilder builder = new StringBuilder();
		while (count-- != 0) {
			int character = (int) (Math.random() * ALPHA_NUMERIC_STRING.length());
			builder.append(ALPHA_NUMERIC_STRING.charAt(character));
		}
		return builder.toString();
	}


	public static String signupMessege(String randomPassword, User user, String approvalmsg) {
		return String.format(approvalmsg, new String[] { user.getFirstName(), user.getEmailId(), randomPassword });
	}

	public static String changePwd(User alreadyexist, String approvalmsg) {
		return String.format(approvalmsg, new String[] { alreadyexist.getFirstName() });
	}

	public static String forgetUpdateMessege(String randomPassword, String approvalmsg, String domain) {
		return String.format(approvalmsg, new String[] { randomPassword, domain });
	}
	public static String cancelMeeting(User user, String cancelmsg) {
		return String.format(cancelmsg, new String[] { user.getFirstName() });
	}
	
	public static char[] generateInvitationCode(int length) {
		Random obj = new Random();
		char[] inviteCode = new char[length];
		for (int i = 0; i < length; i++) {
			inviteCode[i] = (char) (obj.nextInt(10) + 48);
		}
		return inviteCode;
	}
	
	public static String encodePassword(String strPassword) {
		 BCryptPasswordEncoder bCryptPasswordEncoder=new BCryptPasswordEncoder();
		return bCryptPasswordEncoder.encode(strPassword);
	}
	
	public static boolean isValid(String email) 
    { 
        String emailRegex = "^[a-zA-Z0-9_+&*-]+(?:\\."+ 
                            "[a-zA-Z0-9_+&*-]+)*@" + 
                            "(?:[a-zA-Z0-9-]+\\.)+[a-z" + 
                            "A-Z]{2,7}$"; 
                              
        Pattern pat = Pattern.compile(emailRegex); 
        if (email == null||StringUtils.isEmpty(email)) 
            return false; 
        return pat.matcher(email).matches(); 
    } 
	
	public static boolean matchPassword(String rawPassword, String encodedPassword) {
		 BCryptPasswordEncoder bCryptPasswordEncoder=new BCryptPasswordEncoder();
		return bCryptPasswordEncoder.matches(rawPassword, encodedPassword);
	}
  
}
