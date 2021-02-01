package com.cts.cj.util;

import java.io.InputStream;
import java.nio.charset.StandardCharsets;

import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.io.ByteArrayResource;
import org.springframework.core.io.InputStreamSource;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.stereotype.Component;
import org.thymeleaf.context.Context;

import com.cts.cj.constants.CJMessageConstant;
import com.cts.cj.domain.Mail;
import org.thymeleaf.spring5.SpringTemplateEngine;


@Component
public class EmailUtil {

	
	private static final Logger logger = LoggerFactory.getLogger(EmailUtil.class);
	@Value("${spring.mail.username}")
    private String mailFrom;
	@Value("${cj.mail.name}")
    private String displayName;
	@Autowired
	private JavaMailSender emailSender;
	
	@Autowired
	private SpringTemplateEngine templateEngine;

	public void sendEmail(Mail mail, String templatename, InputStreamSource source, String fileName , boolean sendError) {
		try {
			MimeMessage message = emailSender.createMimeMessage();
			MimeMessageHelper helper = new MimeMessageHelper(message, MimeMessageHelper.MULTIPART_MODE_MIXED_RELATED,
					StandardCharsets.UTF_8.name());
			Context context = new Context();
			context.setVariables(mail.getModel());
			context.setVariable(CJMessageConstant.CJ_BORDER_IMAG_KEY, CJMessageConstant.CJ_BORDER_IMAG_NAME);
			context.setVariable(CJMessageConstant.CJ_LOGO_IMAG_KEY, CJMessageConstant.CJ_LOGO_IMAG_NAME);
			//context.setVariable(mail.getInviteCode());
			String html = templateEngine.process("email/" + templatename, context);

			//helper.setTo(mail.getTo());
			if(mail.getTo()!=null) {
				String strToEmail=mail.getTo();
				String[] strToEmailArray= strToEmail.split(",");
				helper.setTo(strToEmailArray);
				}
			
			if(mail.getCc()!=null) {
				helper.setCc(mail.getCc());
			}
			helper.setText(html, true);
			helper.setSubject(mail.getSubject());
			helper.setFrom( new InternetAddress(mailFrom, displayName));
			
			  InputStream is =
			  this.getClass().getClassLoader().getResourceAsStream(CJMessageConstant.
			  CJ_LOGO_IMAG_PATH); byte[] imageByteArray =
			  org.apache.commons.io.IOUtils.toByteArray(is); final InputStreamSource
			  imageSource = new ByteArrayResource(imageByteArray);
			  helper.addInline(CJMessageConstant.CJ_LOGO_IMAG_NAME, imageSource,
			  CJMessageConstant.CJ_LOGO_IMAG_TYPE);
			 
			
			InputStream isb = this.getClass().getClassLoader().getResourceAsStream(CJMessageConstant.CJ_BORDER_IMAG_PATH);
			byte[] imageByteBorder = org.apache.commons.io.IOUtils.toByteArray(isb);
			final InputStreamSource imageSourceBorder = new ByteArrayResource(imageByteBorder);
			helper.addInline(CJMessageConstant.CJ_BORDER_IMAG_NAME, imageSourceBorder, CJMessageConstant.CJ_BORDER_IMAG_TYPE);
			
			
			/*//War packing 
			Resource resource = new ClassPathResource(Constants.GC_LOGO_IMAG_PATH);
			//File file=resource.getFile();
			FileSystemResource image = new FileSystemResource(resource.getFile());			
			helper.addInline(Constants.GC_LOGO_IMAG_NAME, image,Constants.GC_LOGO_IMAG_TYPE);*/
			
		if(null!=source) {
				helper.addAttachment(fileName,source );
			}
			emailSender.send(message);
			logger.info("Email Send successfully  for :"+mail.getSubject());
			logger.info("Email Send successfully  To :"+mail.getTo());
			
		} catch (Exception ex) {
			logger.error("Error occured in email Send>>>>>"+ex);
			ex.printStackTrace();
			if(sendError) {
				throw new RuntimeException("Unable to send email...");
			}
			
		}
	}

}


