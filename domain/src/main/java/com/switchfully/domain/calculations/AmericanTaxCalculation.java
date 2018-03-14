package com.switchfully.domain.calculations;

public class AmericanTaxCalculation implements TaxCalculation {

    @Override
    public double TaxCalculation(double yearlyIncome) {
        return yearlyIncome * 0.18 + 950;
    }

}
