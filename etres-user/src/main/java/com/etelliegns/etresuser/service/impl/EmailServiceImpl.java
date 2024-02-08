package com.etelliegns.etresuser.service.impl;

import com.etelliegns.etresuser.model.EmailDetailsEntity;
import com.etelliegns.etresuser.repo.EmailRepo;
import com.etelliegns.etresuser.service.EmailService;
import jakarta.mail.MessagingException;
import jakarta.mail.internet.MimeMessage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.io.FileSystemResource;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.stereotype.Service;

import java.io.File;

@Service
public class EmailServiceImpl implements EmailService {


    @Autowired
    EmailRepo emailrepo;
    @Autowired private JavaMailSender javaMailSender;

    @Value("${spring.mail.username}")
    private String sender;


    public String sendSimpleMail(EmailDetailsEntity details)
    {


        try {


            SimpleMailMessage mailMessage
                    = new SimpleMailMessage();


            mailMessage.setFrom(sender);
            mailMessage.setTo(details.getRecipient());
            mailMessage.setText(details.getMsgBody());
            mailMessage.setSubject(details.getSubject());



            javaMailSender.send(mailMessage);
            // emailrepo.save(details);

            return "Mail Sent Successfully...........";
        }


        catch (Exception e) {
            return "Error while Sending imple Mail  ";
        }
    }



    public String  sendMailWithAttachment(EmailDetailsEntity details)
    {

        MimeMessage mimeMessage
                = javaMailSender.createMimeMessage();
        MimeMessageHelper mimeMessageHelper;

        try {


            mimeMessageHelper
                    = new MimeMessageHelper(mimeMessage, true);
            mimeMessageHelper.setFrom(sender);
            mimeMessageHelper.setTo(details.getRecipient());
            mimeMessageHelper.setText(details.getMsgBody());
            mimeMessageHelper.setSubject(
                    details.getSubject());


            FileSystemResource file
                    = new FileSystemResource(
                    new File(details.getAttachment()));

            mimeMessageHelper.addAttachment(
                    file.getFilename(), file);

            // Sending the mail
            javaMailSender.send(mimeMessage);
            return "Mail sent Successfully";
        }


        catch (MessagingException e) {


            return "Error while sending mail!!!";
        }

    }
    public String saveEmail(EmailDetailsEntity detail)
    {
        return "save data"+emailrepo.save(detail);
    }
}
