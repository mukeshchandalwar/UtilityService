package com.adt.utilityservice.service;

import com.adt.utilityservice.model.Mail;
import jakarta.mail.MessagingException;

public interface CommonEmailService {
    public void sendEmail(Mail mail) throws MessagingException;
}


