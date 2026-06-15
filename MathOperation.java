package com.CSE2027.day1;

class MathOperation {

    // Method with 2 parameters
    int add(int a, int b) {
        return a + b;
    }

    // Method with 3 parameters
    int add(int a, int b, int c) {
        return a + b + c;
    }

    public static void main(String[] args) {
        MathOperation m = new MathOperation();

        System.out.println("Addition of 2 numbers: " + m.add(10, 20));
        System.out.println("Addition of 3 numbers: " + m.add(10, 20, 30));
    }
}

