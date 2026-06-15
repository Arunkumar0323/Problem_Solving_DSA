package com.CSE2027.day1;

public class THrow {
	static void vote(int age) {
		if(age<18) {
			throw new ArithmeticException("Not Eligible");
		}
	}

	public static void main(String[] args) {
		int age =10;
		try {
			vote(age);
		}
		catch(ArithmeticException e) {
			System.out.println(e);
			System.out.println(e.getMessage());
		}
		

	}

}
