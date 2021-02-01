package com.cts.cj.constants;

public class CJCommonConstants {
	//commented for the local pc configuration
	public static final String I2I_DOMAIN_URL="https://182.156.233.29/itoi";
	//public static final String I2I_DOMAIN_URL="http://localhost:4200/itoi";
	
	public static final String I2I_REGISTRATION_URL=I2I_DOMAIN_URL + "/register";
	public static final String I2I_LOGIN_URL=I2I_DOMAIN_URL + "/login";
	public static final String emailSignature="<br>"+"<br>"+"<B>Thanks & Regards,<BR><B>Team Carrier Journey";
	public static final String groupEmailSignature="<br>"+"<br>"+"<B>Thanks & Regards,<BR>";
	public static final Integer USER_MESSAGE_PAGE_SIZE = 10;
	public static final String PENDING = "Pending";
	public static final String COMPLETED = "Completed";
	public static final String USER_ROLE = "USER";
	public static final long ACCESS_TOKEN_VALIDITY_SECONDS = 05 * 60 * 60;
	public static final String SIGNING_KEY = "cj-2020";
	public static final String AUTHORITIES_KEY = "scopes";
	public static final String HEADER_STRING = "Authorization";
	public static final String TOKEN_PREFIX = "Bearer";
	public static final String PROFILE_IMAGE_URL="/nonsecure/ua/profileImage/";
	public static final String GROUP_IMAGE_URL="/nonsecure/ua/groupImage/";
	public static final String GROUP_ATTACHMENT_IMAGE_URL="/nonsecure/ua/image/";
	public static final String GROUP_ATTACHMENT_VIDEO_URL="/nonsecure/ua/video/";
	public static final String GROUP_ATTACHMENT_DOC_URL="/nonsecure/ua/document/";
	public static final String imageExtension = ",JPG,jpeg,png,gif";
	public static final String docExtension = "pdf,docx,txt,xls";
	public static final String vedioExtension = "mkv,mp3,mp4,quicktime";
}
