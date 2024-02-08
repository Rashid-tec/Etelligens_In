package com.etelliegns.etresuser.service;

import com.etelliegns.etresuser.model.EmailDetailsEntity;

public interface EmailService {

    String sendSimpleMail(EmailDetailsEntity details);

    String sendMailWithAttachment(EmailDetailsEntity details);

}
