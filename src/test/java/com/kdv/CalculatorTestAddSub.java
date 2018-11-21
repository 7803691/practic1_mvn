package com.kdv;

import com.kdv.Calculator;
import org.testng.Assert;
import org.testng.ITestContext;
import org.testng.annotations.*;

import static org.testng.Assert.*;

public class CalculatorTestAddSub {

  //  Calculator calculator = null;

    @BeforeMethod
    public void setUp() {
//        calculator = new Calculator();
    }

    @AfterMethod
    public void tearDown() {
 //       calculator = null;
    }

    @DataProvider(name = "testDataForAddition")
    public Object [][] testData(){
        return new Object[][]{
                {5, 5, 10},
                {10, 5, 15},
                {7,6, 13},
                {11,40, 51}
        };
    }

    //  Test with Data provider in test class
    @Test(description = "Test addition method", dataProvider = "testDataForAddition", groups = "Unit1", priority = 2)
    public void testAddition(int a, int b, int c) {
        Calculator calculator = new Calculator();
        Assert.assertEquals(c, calculator.addition(a,b));
    }

    //  Test with parameters from testng1.xml
    @Parameters({"number1","number2", "difference"})
    @Test(description = "Test subtraction method", groups = "Unit2",priority = 2)
    public void testSubtraction(@Optional("33") int a, @Optional("3") int b, @Optional("30") int c) {
        Calculator calculator = new Calculator();
       Assert.assertEquals(c, calculator.subtraction(a, b));
        System.out.println(calculator.subtraction(a,b));
    }


    //    Test with enable parameter now false;
    @Test(description = "Test addition method", dataProvider = "testDataForAddition", enabled = false)
    public void testAddition2(int a, int b, int c) {
        Calculator calculator = new Calculator();
        Assert.assertEquals(c, calculator.addition(a,b));
    }

    // Test addition with DataProvider returns different data sets based on the test method being invoked
    @Test(dataProvider = "dataByMethod", dataProviderClass = CalculatorDataProvider.class, priority = 1)
    public void testAddition1(int a, int b, int c) {
        Calculator calculator = new Calculator();
        Assert.assertEquals(c, calculator.addition(a,b));
    }

    // Test addition with DataProvider returns different data sets based on the test method being invoked
    @Test(dataProvider = "dataByMethod", dataProviderClass = CalculatorDataProvider.class, priority = 1)
    public void testSubtraction1(int a, int b, int c) {
        Calculator calculator = new Calculator();
        Assert.assertEquals(c, calculator.subtraction(a, b));
        System.out.println(calculator.subtraction(a,b));
    }

}