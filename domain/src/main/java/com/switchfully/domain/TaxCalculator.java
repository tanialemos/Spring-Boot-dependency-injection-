package com.switchfully.domain;

import com.switchfully.domain.calculations.TaxCalculation;
import org.springframework.beans.factory.annotation.Qualifier;

import javax.inject.Inject;
import javax.inject.Named;

@Named
public class TaxCalculator {

    private TaxCalculation taxCalculation;

    @Inject
    public TaxCalculator(@Qualifier("AmericanTaxation")TaxCalculation taxCalculation) {
        this.taxCalculation = taxCalculation;
    }

    public double calculateTax(double yearlyIncome){
        return taxCalculation.TaxCalculation(yearlyIncome);
    }
}
