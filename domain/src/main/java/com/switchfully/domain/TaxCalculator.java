package com.switchfully.domain;

import com.switchfully.domain.calculations.TaxCalculation;

import javax.inject.Inject;
import javax.inject.Named;

@Named
public class TaxCalculator {

    private TaxCalculation taxCalculation;

    @Inject
    public TaxCalculator(TaxCalculation taxCalculation) {
        this.taxCalculation = taxCalculation;
    }

    public double calculateTax(double yearlyIncome){
        return taxCalculation.TaxCalculation(yearlyIncome);
    }
}
