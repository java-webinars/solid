package edu.javacourse.mail;

public interface MailSender
{
    void sendEmail(String email, String subject, String body);
}
