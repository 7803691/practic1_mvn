package com.kdv;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class CalculatorTestMulDiv {

//    private Calculator calculator = null;
//
//    @BeforeMethod
//    public void setUp() {
//        calculator = new Calculator();
//    }
//
//    @AfterMethod
//    public void tearDown() {
//        calculator = null;
//    }

    @Test(description = "Test multiplication method", dataProvider = "dataForMultiplication",
            dataProviderClass = CalculatorDataProvider.class, groups = "Unit1")
    public void testMultiplication(int a, int b, int c){
        Calculator calculator = new Calculator();
        Assert.assertEquals(c, calculator.multiplication(a,b));
    }


    @Test(description = "Test multiplication method", dataProvider = "dataForDivision",
            dataProviderClass = CalculatorDataProvider.class, groups = "Unit2", dependsOnMethods = {"testMultiplication"})
    public void testDivision(int a, int b, int c){
        Calculator calculator = new Calculator();
        Assert.assertEquals(c, calculator.division(a,b));
    }



}
