package edu.javacourse.solid.report;

import edu.javacourse.solid.domain.ValidationResult;

public interface ReportBuilder
{
    String generateReport(ValidationResult result);

    String generateTitle(ValidationResult result);
}
