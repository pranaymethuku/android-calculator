package com.calculator.android.calculator;

public class Calc_Processor {
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

    public double add(double num1, double num2) {
        return (num1 + num2);
    }

    public double subtract(double num1, double num2) {
        return (num1 - num2);
    }

    public double multiply(double num1, double num2) {
        return (num1 * num2);
    }

    public double divide(double num1, double num2) {
        return (num1 / num2);
    }
    public void invalid() {
        System.out.println("Invalid operator. Please try again.");
    }
}
