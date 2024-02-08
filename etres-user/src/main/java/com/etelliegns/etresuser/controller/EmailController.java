package com.etelliegns.etresuser.controller;

import com.etelliegns.etresuser.model.EmailDetailsEntity;
import com.etelliegns.etresuser.service.impl.EmailServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmailController {

    @Autowired
    private EmailServiceImpl emailService;

        // Sending a simple Email
        @PostMapping("/sendMail")
        public String
        sendMail(@RequestBody EmailDetailsEntity details)
        {
            String status
                    = emailService.sendSimpleMail(details);

            return status;
        }

        // Sending email with attachment
        @PostMapping("/sendMailWithAttachment")
        public String sendMailWithAttachment(
                @RequestBody EmailDetailsEntity details)
        {
            String status
                    = emailService.sendMailWithAttachment(details);

            return status;
        }
    }


