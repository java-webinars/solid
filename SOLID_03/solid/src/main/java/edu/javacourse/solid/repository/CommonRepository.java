package edu.javacourse.solid.repository;

import edu.javacourse.solid.domain.Conract;
import edu.javacourse.solid.domain.Offer;
import edu.javacourse.solid.domain.ValidationResult;

public interface CommonRepository
{
    void saveValidationResult(ValidationResult result);

    Conract getContract(Long contractId);

    void saveOffer(Offer offer);
}
