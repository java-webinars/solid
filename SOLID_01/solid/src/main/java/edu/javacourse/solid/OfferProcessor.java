package edu.javacourse.solid;

public class OfferProcessor
{
    private String dbUrl = "";
    private String dbLogin = "";
    private String dbPassword = "";

    private String emailHost = "";
    private String emailLogin = "";
    private String emailPassword = "";

    public void submitOffer(Offer offer)
    {
        saveOffer(offer);
        Conract contract = getContract(offer.getContractId());
        ValidationResult result = validateContract(contract, offer);
        saveValidationResult(result);
        String subject = generateEmailSubject(result);
        String body = generateEmailAnswer(result);
        sendEmail(offer.getEmail(), subject, body);
    }

    private void sendEmail(String email, String subject, String body) {
        // Logic to send email
    }

    private String generateEmailAnswer(ValidationResult result) {
        // Logic for email body generation
        return null;
    }

    private String generateEmailSubject(ValidationResult result) {
        // Loigc for email subject generation
        return null;
    }

    private void saveValidationResult(ValidationResult result) {
       // Logic for saving ValidationResult
    }

    private ValidationResult validateContract(Conract contract, Offer offer) {
        // Logic to validate Contract and Offer
        return null;
    }

    private Conract getContract(Long contractId) {
        // Logic for getting Contract
        return null;
    }

    private void saveOffer(Offer offer) {
        // Logic to save OFFER
    }
}
