package edu.javacourse.solid.validator.impl;

import edu.javacourse.solid.domain.Conract;
import edu.javacourse.solid.domain.Offer;
import edu.javacourse.solid.domain.ValidationResult;
import edu.javacourse.solid.validator.OfferValidator;

public class SimpleOfferValidator implements OfferValidator
{
    public SimpleOfferValidator() {
    }

    @Override
    public ValidationResult validateOffer(Conract contract, Offer offer) {
        // Logic to validate Contract and Offer
        return null;
    }
}