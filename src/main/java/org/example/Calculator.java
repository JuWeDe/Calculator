package org.example;

public class Calculator {
    public double add(double num1, double num2) {
        return num1 + num2;
    }

    public double multiply(double num1, double num2) {
        return num1 * num2;
    }

    public double div(double num1, double num2) {
        if (num2 == 0) {
            System.out.println("Error!");
        }
        return num1 / num2;
    }
    public double toSquare(double num1) {
        return num1*num1;
    }

    public double sub(double num1, double num2) {
        return num1 - num2;
    }
}
