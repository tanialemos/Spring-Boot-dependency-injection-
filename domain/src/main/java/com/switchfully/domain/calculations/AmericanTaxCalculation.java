package com.switchfully.domain.calculations;

import javax.inject.Named;

@Named("AmericanTaxation")
public class AmericanTaxCalculation implements TaxCalculation {

    @Override
    public double TaxCalculation(double yearlyIncome) {
        return yearlyIncome * 0.18 + 950;
    }

}
