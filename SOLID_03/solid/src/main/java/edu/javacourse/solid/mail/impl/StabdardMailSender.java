package edu.javacourse.solid.mail.impl;

import edu.javacourse.solid.mail.MailSender;

public class StabdardMailSender implements MailSender
{
    private String emailHost = "";
    private String emailLogin = "";
    private String emailPassword = "";

    public StabdardMailSender() {
    }

    @Override
    public void sendEmail(String email, String subject, String body) {
        // Logic to send email
    }
}