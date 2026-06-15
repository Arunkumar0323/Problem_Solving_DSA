package com.CSE2027.day1;

public class Binary {
	public static void main(String[] args) {
		int num = 100;
		int base = 8;
		String binary=" ";
		while(num>0) {
			int rem = num%base;
			binary = rem+binary;
			num=num/base;
		}
		System.out.println(binary); 
	}

}
