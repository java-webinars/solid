package edu.javacourse.solid.report.impl;

import edu.javacourse.solid.domain.ValidationResult;
import edu.javacourse.solid.report.ReportBuilder;

public class TextReportBuilder implements ReportBuilder
{
    public TextReportBuilder() {
    }

    @Override
    public String generateReport(ValidationResult result) {
        // Logic for email body generation
        return null;
    }

    @Override
    public String generateTitle(ValidationResult result) {
        // Loigc for email subject generation
        return null;
    }
}