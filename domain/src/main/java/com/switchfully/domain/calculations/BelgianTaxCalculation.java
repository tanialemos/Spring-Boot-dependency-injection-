package com.switchfully.domain.calculations;

import javax.inject.Named;

@Named("BelgianTaxation")
public class BelgianTaxCalculation implements TaxCalculation {
    @Override
    public double TaxCalculation(double yearlyIncome) {
        return yearlyIncome * 0.45;
    }
}
