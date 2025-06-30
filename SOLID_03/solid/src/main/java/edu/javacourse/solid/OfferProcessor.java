package edu.javacourse.solid;

import edu.javacourse.solid.domain.Conract;
import edu.javacourse.solid.domain.Offer;
import edu.javacourse.solid.domain.ValidationResult;
import edu.javacourse.solid.mail.MailSender;
import edu.javacourse.solid.report.ReportBuilder;
import edu.javacourse.solid.repository.CommonRepository;
import edu.javacourse.solid.validator.OfferValidator;

public class OfferProcessor
{
    private CommonRepository repository;
    private OfferValidator offerValidator;
    private ReportBuilder reportBuilder;
    private MailSender mailSender;

    public void setRepository(CommonRepository repository) {
        this.repository = repository;
    }

    public void setOfferValidator(OfferValidator offerValidator) {
        this.offerValidator = offerValidator;
    }

    public void setReportBuilder(ReportBuilder reportBuilder) {
        this.reportBuilder = reportBuilder;
    }

    public void setMailSender(MailSender mailSender) {
        this.mailSender = mailSender;
    }

    public void submitOffer(Offer offer)
    {
        repository.saveOffer(offer);
        Conract contract = repository.getContract(offer.getContractId());
        ValidationResult result = offerValidator.validateOffer(contract, offer);
        repository.saveValidationResult(result);
        String subject = reportBuilder.generateTitle(result);
        String body = reportBuilder.generateReport(result);
        mailSender.sendEmail(offer.getEmail(), subject, body);
    }
}
