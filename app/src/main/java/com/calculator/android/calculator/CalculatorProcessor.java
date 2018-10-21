package com.calculator.android.calculator;

public class CalculatorProcessor {
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
        return (1.79769313486231570E+308);
    }

    public static double add(double num1, double num2) {
        return (num1 + num2);
    }

    public static double subtract(double num1, double num2) {
        return (num1 - num2);
    }

    public static double multiply(double num1, double num2) {
        return (num1 * num2);
    }

    public static double divide(double num1, double num2) {
        return (num1 / num2);
    }
}
