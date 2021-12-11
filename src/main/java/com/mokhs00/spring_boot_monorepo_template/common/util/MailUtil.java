package com.mokhs00.spring_boot_monorepo_template.common.util;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Component;

import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import java.io.UnsupportedEncodingException;

@Component
@Slf4j
public class MailUtil {
    private final JavaMailSender javaMailSender;
    private final String FROM_ADDRESS;

    public MailUtil(JavaMailSender javaMailSender,
                    @Value("${spring.mail.username}") String FROM_ADDRESS) {
        this.javaMailSender = javaMailSender;
        this.FROM_ADDRESS = FROM_ADDRESS;
    }


    public void sendMailEx() {
        String targetEmail = "test@test.com";

        MimeMessage message = javaMailSender.createMimeMessage();
        try {
            message.addRecipient(Message.RecipientType.TO, new InternetAddress(targetEmail, "", "UTF-8"));
            message.setFrom(new InternetAddress(FROM_ADDRESS, "APPLICATION", "UTF-8"));

            message.setSubject("TITLE");

            String text = "TEXT";

            message.setText(text, "UTF-8", "html");
            javaMailSender.send(message);
        } catch (MessagingException e) {
            log.error("{}", e);
        } catch (UnsupportedEncodingException e) {
            log.error("{}", e);
        }


    }
}
