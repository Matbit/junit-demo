package com.company;

public class Calculator {
    public double plus(double doubleValueOne, double doubleValueTwo){
        return (doubleValueOne + doubleValueTwo);
    }

    public boolean isValidated(double doubleValueOne, double doubleValueTwo){
        if(doubleValueOne > 10 || doubleValueTwo > 10){
            return false;
        }
        return true;
    }
}
