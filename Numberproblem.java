package com.CSE2027.day1;

public class Numberproblem {

	public static void main(String[] args) {
		int n = 123;
		int square=n*n;
		System.out.println(square);
		int rev = 0;
		int rev_rev_square=0;
		while(n!=0) {
			rev = rev*10+(n%10);
			n=n/10;	
		}
		System.out.println(rev);
		int rev_square=rev*rev;
		System.out.println(rev_square);
		
		while(rev_square!=0) {
			rev_rev_square= rev_rev_square*10+(rev_square%10);
			rev_square=rev_square/10;	
		}
		
		System.out.println(rev_rev_square);
		
		
		if(square==rev_rev_square) {
			System.out.println("It is adam");
		}else {
			System.out.println("It is not adam");
		}


	}
	
}
