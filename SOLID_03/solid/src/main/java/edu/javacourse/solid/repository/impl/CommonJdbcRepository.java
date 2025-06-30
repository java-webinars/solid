package edu.javacourse.solid.repository.impl;

import edu.javacourse.solid.domain.Conract;
import edu.javacourse.solid.domain.Offer;
import edu.javacourse.solid.domain.ValidationResult;
import edu.javacourse.solid.repository.CommonRepository;

public class CommonJdbcRepository implements CommonRepository
{
    private String dbUrl = "";
    private String dbLogin = "";
    private String dbPassword = "";

    public CommonJdbcRepository() {
    }

    @Override
    public void saveValidationResult(ValidationResult result) {
        // Logic for saving ValidationResult
    }

    @Override
    public Conract getContract(Long contractId) {
        // Logic for getting Contract
        return null;
    }

    @Override
    public void saveOffer(Offer offer) {
        // Logic to save OFFER
    }
}