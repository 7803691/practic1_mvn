package com.kdv;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class CalculatorTestMod {

 //   private Calculator calculator;

    @BeforeMethod
    public void setUp() {
    //    calculator = new Calculator();
    }

    @AfterMethod
    public void tearDown() {
    //    calculator = null;
    }

    @Test(description = "Test modulo method", dataProvider = "dataForModulo",
            dataProviderClass = CalculatorDataProvider.class, groups = "Unit3")
    public void testModulo(int a, int b, int c){
        Calculator calculator = new Calculator();
        Assert.assertEquals(c, calculator.modulo(a, b));
    }


}
