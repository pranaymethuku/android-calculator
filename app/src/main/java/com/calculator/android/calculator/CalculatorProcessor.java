package com.calculator.android.calculator;

public class CalculatorProcessor {
    //Checks the type of operand and calls the appropriate function
    public static double checkOperation(double num1, double num2, String operator) {
        if (operator.equals("+")) {
            return add(num1, num2);
        }
        else if (operator.equals("-")) {
            return subtract(num1, num2);
        }
        else if (operator.equals("*")) {
            return multiply(num1, num2);
        }
        else if (operator.equals("/")) {
            return divide(num1, num2);
        }
        return (999999999);
    }
    //Adds 2 values
    public static double add(double num1, double num2) {
        return (num1 + num2);
    }
    //Subtracts 2 values
    public static double subtract(double num1, double num2) {
        return (num1 - num2);
    }
    //Multiplies 2 values
    public static double multiply(double num1, double num2) {
        return (num1 * num2);
    }
    //Divides 2 values
    public static double divide(double num1, double num2) {
        return (num1 / num2);
    }
}
