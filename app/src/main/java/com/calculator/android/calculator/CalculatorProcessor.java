package com.calculator.android.calculator;
/*
* Class for performing
* */
public class CalculatorProcessor {
    public static void checkOperation(double num1, double num2, String operator) {
        if (operator.equals("+")) {
            add(num1, num2);
        }
        else if (operator.equals("-")) {
            subtract(num1, num2);
        }
        else if (operator.equals("*")) {
            multiply(num1, num2);
        }
        else if (operator.equals("/")) {
            divide(num1, num2);
        }
        else {
            invalid();
        }

    }

    /**
     * Created by: Rohan Paul
     *
     * Adds two double numbers
     *
     */
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

    public static void invalid() {
        System.out.println("Invalid operator. Please try again.");
    }
}
