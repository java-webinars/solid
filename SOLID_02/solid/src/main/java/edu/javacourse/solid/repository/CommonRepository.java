package edu.javacourse.solid.repository;

import edu.javacourse.solid.Conract;
import edu.javacourse.solid.Offer;
import edu.javacourse.solid.ValidationResult;

public class CommonRepository
{
    private String dbUrl = "";
    private String dbLogin = "";
    private String dbPassword = "";

    public CommonRepository() {
    }

    public void saveValidationResult(ValidationResult result) {
        // Logic for saving ValidationResult
    }

    public Conract getContract(Long contractId) {
        // Logic for getting Contract
        return null;
    }

    public void saveOffer(Offer offer) {
        // Logic to save OFFER
    }
}