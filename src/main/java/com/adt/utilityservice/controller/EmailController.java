package com.adt.utilityservice.controller;

import com.adt.utilityservice.model.Mail;
import com.adt.utilityservice.service.CommonEmailService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/emails")
public class EmailController {

    private static final Logger logger = LoggerFactory.getLogger(EmailController.class);

    @Autowired
    private CommonEmailService commonEmailService;


    @PostMapping("/send")
    public ResponseEntity<String> sendEmail(@RequestBody Mail mail) {
        try {
            commonEmailService.sendEmail(mail);
            return ResponseEntity.ok("Email sent successfully");
        } catch (Exception e) {
            return new ResponseEntity<>("Failed to send email: " + e.getMessage(), HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
}