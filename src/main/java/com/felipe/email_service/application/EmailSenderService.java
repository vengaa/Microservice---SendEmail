package com.felipe.email_service.application;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.felipe.email_service.adapters.EmailSenderGateway;
import com.felipe.email_service.core.cases.EmailSenderUseCase;

@Service
public class EmailSenderService implements EmailSenderUseCase {

    private final EmailSenderGateway emailSenderGateway;

    @Autowired
    public EmailSenderService(EmailSenderGateway emailSenderGateway) {
        this.emailSenderGateway = emailSenderGateway;
    }

    @Override
    public void sendEmail(String toEmail, String subject, String body) {
        emailSenderGateway.sendEmail(toEmail, subject, body);
    }
}