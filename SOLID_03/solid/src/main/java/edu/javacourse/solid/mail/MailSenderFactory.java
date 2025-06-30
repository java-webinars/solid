package edu.javacourse.solid.mail;

import edu.javacourse.solid.mail.impl.AmazonMailSender;
import edu.javacourse.solid.mail.impl.StabdardMailSender;

public class MailSenderFactory
{
    public static MailSender getMailSender() {
        return new AmazonMailSender();
    }
}
