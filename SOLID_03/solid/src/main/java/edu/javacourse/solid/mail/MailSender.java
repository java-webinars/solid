package edu.javacourse.solid.mail;

public interface MailSender
{
    void sendEmail(String email, String subject, String body);
}
