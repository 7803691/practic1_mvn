package com.kdv;

import org.testng.annotations.Factory;

public class CalculatorFactory {

    @Factory(dataProvider = "dataForModulo", dataProviderClass = CalculatorDataProvider.class)
    public Object [] getTestClasses(int a, int b, int c){
        Object [] tests = new Object[3];
        for (int i = 0; i<3;i++){
            tests[i] = new CalculatorTestForFactory(a, b, c);
        }
        return tests;
    }
}
