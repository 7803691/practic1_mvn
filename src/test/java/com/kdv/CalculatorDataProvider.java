package com.kdv;

import org.testng.annotations.DataProvider;

import java.lang.reflect.Method;

public class CalculatorDataProvider {

    @DataProvider(name = "dataForMultiplication")
    public static Object [][] dataForMultiplication(){
        return new Object[][] {
                {2,5,10},
                {6,6,36},
                {7,8,56}
        };
    }

    @DataProvider(name = "dataForDivision")
    public static Object [] [] dataForDivision(){
        return new Object[][]{
                {72,9,8},
                {35,7,5},
                {12,3,4}
        };
    }

    @DataProvider(name = "dataForModulo")
    public static Object [] [] dataForModulo(){
        return new Object[][] {
                {10,3,1},
                {15,4,3},
                {19,3,1}
        };
    }


    //Static DataProvider returns different data sets based on the test method being invoked
    @DataProvider(name = "dataByMethod")
    public static Object [][] getMethodData(Method method){
        String testCase = method.getName();
        if ("testAddition1".equals(testCase)){
            return new Object[][] {
                    {15,10,25},
                    {45,5,50},
                    {100,10,110}
            };
        }else if ("testSubtraction1".equals(method.getName())){
            return new Object[][] {
                    {50,25,25},
                    {36,7,29},
                    {44,9,35}
            };
        }else return null;
    }




}
