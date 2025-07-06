package edu.javacourse.solid.mail;


import edu.javacourse.amazon.mail.AmazonMailSender;
import edu.javacourse.mail.MailSender;
import edu.javacourse.mail.standard.StandardMailSender;

public class MailSenderFactory
{
    public static MailSender getMailSender() {
//        return new StandardMailSender();
        return new AmazonMailSender();
    }
}
