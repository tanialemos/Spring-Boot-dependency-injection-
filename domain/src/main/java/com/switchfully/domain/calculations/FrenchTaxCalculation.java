package com.switchfully.domain.calculations;

import javax.inject.Named;

@Named("FrenchTaxation")
public class FrenchTaxCalculation implements TaxCalculation {
    @Override
    public double TaxCalculation(double yearlyIncome) {
        return yearlyIncome * 0.48;
    }
}
