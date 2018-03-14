package com.switchfully.domain;

import com.switchfully.domain.TaxCalculator;
import com.switchfully.domain.calculations.BelgianTaxCalculation;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class TaxCalculatorTest {

    //NO MOCKING
    @Test
    void calculateTaxBelgianTax_given100k_return45000() {
        TaxCalculator calculator = new TaxCalculator(new BelgianTaxCalculation());
        double actualResult = calculator.calculateTax(100000);
        Assertions.assertEquals(actualResult, 45000);
    }
}