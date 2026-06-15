package com.CSE2027.day1;

public class Forwardnumber {
	public static void main(String[] argsw) {
		int n = 30;
		System.out.println(n);

        int temp = n;
        int digits = 0;

        while (temp != 0) {
            digits++;
            temp =temp/10;
        }
        System.out.println(digits);
        
        int square = n * n;
        
        System.out.println(square);
        
        int power = (int) Math.pow(10, digits);
        
        System.out.println(power);
        
        int right = square % power;
        int left = square / power;
        
        System.out.println(right);
        System.out.println(left);

        if (left + right == n)
            System.out.println(n + " is a Kaprekar number ✔");
        else
            System.out.println(n + " is NOT a Kaprekar number ❌");

		
	}

}
