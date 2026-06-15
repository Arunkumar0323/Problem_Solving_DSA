package com.CSE2027.day1;

public class Calculator {

    void add(int a, int b) {
        System.out.println("Addition: " + (a + b));
    }

    void subtract(int a, int b) {
        System.out.println("Subtraction: " + (a - b));
    }

    void multiply(int a, int b) {
        System.out.println("Multiplication: " + (a * b));
    }

    void divide(int a, int b) {
        System.out.println("Division: " + (a / b));
    }

    public static void main(String[] args) {
        Calculator cal = new Calculator();
        cal.add(10, 5);
        cal.subtract(10, 5);
        cal.multiply(10, 5);
        cal.divide(10, 5);
    }
}

