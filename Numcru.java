package com.CSE2027.day1;

public class Numcru {
	    public static void main(String[] args) {
	        int num = 4463277;

	        int digits = 0;
	        int temp = num;
	        while (temp != 0) {
	            digits++;
	            temp /= 10;
	        }

	        int power = 1;
	        for (int i = 1; i < digits; i++) {
	            power *= 10;
	        }
	        int copy = num;
	        while (power != 0) {
	            int digit = copy / power;
	            if (digit % 2 != 0) {
	                System.out.print(digit + " ");
	            }
	            copy = copy % power;
	            power /= 10;
	        }
	        power = 1;
	        for (int i = 1; i < digits; i++) {
	            power *= 10;
	        }
	        copy = num;
	        while (power != 0) {
	            int digit = copy / power;
	            if (digit % 2 == 0) {
	                System.out.print(digit + " ");
	            }
	            copy = copy % power;
	            power /= 10;
	        }
	    }
	}


