package com.switchfully.domain;

import com.switchfully.domain.TaxCalculator;
import com.switchfully.domain.calculations.AmericanTaxCalculation;
import com.switchfully.domain.calculations.BelgianTaxCalculation;
import com.switchfully.domain.calculations.FrenchTaxCalculation;
import com.switchfully.domain.calculations.TaxCalculation;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import static org.mockito.Mockito.when;

class TaxCalculatorTest {

    TaxCalculator calculator;


    //MOCKING
    @Test
    void calculateTaxBelgianTaxMOCKING_given100k_return45000(){
        TaxCalculation belgianTax = Mockito.mock(BelgianTaxCalculation.class);

        calculator = new TaxCalculator(belgianTax);
        when(calculator.calculateTax(100000)).thenReturn(45000.0);

        double actualResult = calculator.calculateTax(100000);

        Assertions.assertEquals(actualResult, 45000);
    }

    @Test
    void calculateTaxFrenchTaxMOCKING_given100k_return48000(){
        TaxCalculation frenchTax = Mockito.mock(FrenchTaxCalculation.class);

        calculator = new TaxCalculator(frenchTax);
        when(calculator.calculateTax(100000)).thenReturn(48000.0);

        double actualResult = calculator.calculateTax(100000);

        Assertions.assertEquals(actualResult, 48000);
    }

    @Test
    void calculateTaxAmericanTaxMOCKING_given100k_return18950(){
        TaxCalculation americanTax = Mockito.mock(AmericanTaxCalculation.class);

        calculator = new TaxCalculator(americanTax);
        when(calculator.calculateTax(100000)).thenReturn(18950.0);

        double actualResult = calculator.calculateTax(100000);

        Assertions.assertEquals(actualResult, 18950);
    }

    //NO MOCKING
    @Test
    void calculateTaxBelgianTax_given100k_return45000() {
        TaxCalculator calculator2 = new TaxCalculator(new BelgianTaxCalculation());
        double actualResult = calculator2.calculateTax(100000);
        Assertions.assertEquals(actualResult, 45000);
    }
}