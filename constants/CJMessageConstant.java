package com.cts.cj.constants;

public class CJMessageConstant {

	public static final String SIGN_UP_SUBJECT = "Registeration Sucessfully";
	public static final String emailSignature = "Thanks & Regards, <br> Team CarrierJourney";

	public static final String passwordChangeNotes = "It is recommended to change your password on your first login to the I2I platform."
			+ "<br>";

	public static final String I2I_USER_CREDENTIALS = "User ID: %s <br> Password: %s <br>";

	public static final String INVITED_BY_ADMIN_EMAIL_MESSAGE = "Dear User,<br>"
			+ "You can join the Carrier Journey platform by using the following informations:  \n";
	public static final String PASSWORDSUBJECT = "To reset your Password";

	public static final String DECLINEREQUESTSUBJECT = "Request Declined";
	
	public static final String IGNOREREQUESTSUBJECT = "Request Ignored";
	
	public static final String CONFIRMREQUESTSUBJECT = "Confirmation to your request";

	public static final String SUBJECT = "Invitation to join CarrierJourney Platform";
	public static final String USER_APPROVED = "Dear User,\n"
			+ "Your request to register in I2I platform has been approved.\r\n"
			+ "Please use this password to login to platform.\r\n" + "\r\n" + "Password:%s\n" + "%s\n" + "\n"
			+ passwordChangeNotes + "";

	public static final String USER_APPROVED_SUBJECT = "I2I Registration Request Approved";
	public static final String CONNECT_Notification_SUBJECT = "CarrierJourney Connect User Notification";

	public static final String USER_REJECTED = "Dear User,\r\n" + "\r\n"
			+ "Your request to register in I2I platform has been approved.\r\n"
			+ "Thank you for your interest to be part of I2I platform.\r\n" + "\r\n" + emailSignature + "\r\n";

	public static final String USER_REJECTED_SUBJECT = "I2I Org.Registration Rejected Email";
	public static final String FORGET_PASSWORD = "Dear User,<br>"
			+ "use this temporary password:%s to login to the I2I platform.<BR> URL to the I2I platform:%s"
			+ passwordChangeNotes + "<BR>" + emailSignature;

	public static final String FORGET_PASSWORD_SUBJECT = "I2I Password Reset Request";

	public static final String SIGN_UP_MESSAGE = "Dear %s ,"
			+ " On successful process, your will be getting an email with your user credentials for I2I platform, in next 24 hours \n "
			+ passwordChangeNotes + emailSignature;

	public static final String SIGN_UP_MESSAGE_WITHOUT_APPROVAL = "Dear %s," + "<br>"
			+ " Thanks for showing interest in Carrier Journey, here is your user credentials to login to the Carrier Journey.<br>"
			+ I2I_USER_CREDENTIALS + "to login, please follow the link:" + CJCommonConstants.I2I_LOGIN_URL + "<br>"
			+ passwordChangeNotes + "<br>" + emailSignature;

	public static final String CANCELL_MEETING = "Dear %s ," + "<br>" + "<br>"
			+ " Your meeting scheduled with i2i  has been cancelled " + "<br>" + "<br>" + emailSignature;

	public static final String CANCELL_MEETING_SUBJECT = "I2I Meeting cancelled";

	public static final String RESET_PASSWORD = "Dear %s ," + "<br>" + "<br>"
			+ " Your password has been changed successfully" + "<br>" + "<br>" + emailSignature;

	public static final String RESET_PASSWORD_SUBJECT = "I2I Password changed  successfully";

	public static final String UPDATE_PASSWORD = "Dear %s ," + "<br>" + "<br>"
			+ " Your password has been updated successfully" + "<br>" + "<br>" + emailSignature;

	public static final String UPDATE_PASSWORD_SUBJECT = "I2I Password updated  successfully";
	public static final String MESSAGE_Notification_SUBJECT = "NEW MESSAGE";
	public static final String DELETE_CONNECTION_Notification_SUBJECT ="Connection Removed";
	public static final String CJ_LOGO_IMAG_KEY = "logoImageName";
	public static final String CJ_LOGO_IMAG_NAME = "Logo.png";
	public static final String CJ_LOGO_IMAG_TYPE = "image/png";
	public static final String CJ_BORDER_IMAG_NAME ="border.gif";
	public static final String CJ_BORDER_IMAG_KEY = "borderImageName";
	public static final String CJ_BORDER_IMAG_TYPE = "image/gif";
	

	public static final String CJ_EMAIL = "Career Journey";
	public static final String CJ_BORDER_IMAG_PATH = "templates/email/img/border.gif";
	public static final String CJ_LOGO_IMAG_PATH = "templates/email/img/Logo.png";
	public static final String PASSWORD_CHANGE = "Password Changed";

	
}
