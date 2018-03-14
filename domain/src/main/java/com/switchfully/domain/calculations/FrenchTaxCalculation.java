package com.switchfully.domain.calculations;

public class FrenchTaxCalculation implements TaxCalculation {
    @Override
    public double TaxCalculation(double yearlyIncome) {
        return yearlyIncome * 0.48;
    }
}
