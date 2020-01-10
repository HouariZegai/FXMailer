package com.houarizegai.templateemailsender.engine;

import org.apache.commons.mail.Email;

import javax.activation.DataHandler;
import javax.activation.DataSource;
import javax.activation.FileDataSource;
import javax.mail.*;
import javax.mail.internet.*;
import java.util.Iterator;
import java.util.List;
import java.util.Properties;

public class EmailEngine {
    private Properties props;
    private Session session;
    Message message;

    MimeMultipart multipart;
    BodyPart messageBodyPart;

    public EmailEngine() {
        props = new Properties();
        props.put("mail.smtp.auth", "true");
        props.put("mail.smtp.starttls.enable", "true");
        props.put("mail.smtp.host", "smtp.gmail.com");
        props.put("mail.smtp.port", "587");

        // This mail has 2 part, the BODY and the embedded image
        multipart = new MimeMultipart("related");
    }

    public EmailEngine setAuth(String email, String password) {
        session = Session.getInstance(props,
                new javax.mail.Authenticator() {
                    protected PasswordAuthentication getPasswordAuthentication() {
                        return new PasswordAuthentication(email, password);
                    }
                });

        // Create a default MimeMessage object.
        message = new MimeMessage(session);

        // Set From: header field of the header.
        try {
            message.setFrom(new InternetAddress(email));
        } catch (MessagingException e) {
            e.printStackTrace();
        }

        return this;
    }

    public EmailEngine setSubject(String subject) {
        // Set Subject: header field
        try {
            message.setSubject("Testing Subject");
        } catch (MessagingException e) {
            e.printStackTrace();
        }

        return this;
    }

    public EmailEngine setContent(String htmlContent) {
        // first part (the html)
        messageBodyPart = new MimeBodyPart();
        try {
            messageBodyPart.setContent(htmlContent, "text/html");
            // add it
            multipart.addBodyPart(messageBodyPart);
        } catch (MessagingException e) {
            e.printStackTrace();
        }

        return this;
    }

    public EmailEngine setHeaderImage(String path) {
        // second part (the image)
        messageBodyPart = new MimeBodyPart();
        DataSource fds = new FileDataSource(path);

        try {
            messageBodyPart.setDataHandler(new DataHandler(fds));
            messageBodyPart.setHeader("Content-ID", "<headerImage>");

            // add image to the multipart
            multipart.addBodyPart(messageBodyPart);
        } catch (MessagingException e) {
            e.printStackTrace();
        }

        return this;
    }

    public boolean send(String recipient) {

        try {
            // Set To: header field of the header.
            message.setRecipients(Message.RecipientType.TO, InternetAddress.parse(recipient));

            // put everything together
            message.setContent(multipart);

            // Send message
            Transport.send(message);

            return true; // successful send it
        } catch (MessagingException e) {
            throw new RuntimeException(e);
        }
    }
}
