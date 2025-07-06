package edu.javacourse.solid.validator;

import edu.javacourse.solid.domain.Conract;
import edu.javacourse.solid.domain.Offer;
import edu.javacourse.solid.domain.ValidationResult;

public interface OfferValidator
{
    ValidationResult validateOffer(Conract contract, Offer offer);
}
