package com.kdv;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Factory;
import org.testng.annotations.Test;

//Test for factory
public class CalculatorTestForFactory {

    private int a;
    private int b;
    private int c;

    @Factory(dataProvider = "dataForModulo", dataProviderClass = CalculatorDataProvider.class)
    public CalculatorTestForFactory(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    @BeforeSuite
    public void setUp(){
        System.out.println("Before Suite");
    }

    @BeforeClass(alwaysRun = true)
    public void init(){
        System.out.println(a + "-" + b + "-" + c);
    }

    @Test
    public void moduloTestMethod(){
        Calculator calculator =new Calculator();
        Assert.assertEquals(c, calculator.modulo(a, b));
    }

}
