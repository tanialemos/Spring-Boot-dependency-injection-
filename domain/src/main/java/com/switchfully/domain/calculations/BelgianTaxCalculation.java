package com.switchfully.domain.calculations;

import org.springframework.context.annotation.Primary;

import javax.inject.Named;

@Named("BelgianTaxation")
@Primary
public class BelgianTaxCalculation implements TaxCalculation {
    @Override
    public double TaxCalculation(double yearlyIncome) {
        return yearlyIncome * 0.45;
    }
}
