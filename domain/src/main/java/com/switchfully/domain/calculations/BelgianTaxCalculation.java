package com.switchfully.domain.calculations;

public class BelgianTaxCalculation implements TaxCalculation {
    @Override
    public double TaxCalculation(double yearlyIncome) {
        return yearlyIncome * 0.45;
    }
}
