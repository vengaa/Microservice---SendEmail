package com.felipe.email_service.core.cases;

public interface EmailSenderUseCase {
	
	void sendEmail(String to, String subject, String body);

}
