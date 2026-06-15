package com.CSE2027.day1;

import java.util.Scanner;

public class Factorial {
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		if(n==0 || n==1) {
			System.out.println("1");
			
		}else {
			long fact=1;
			for(int i=1;i<=n;i++) {
				fact=fact*i;
			}
			System.out.println(fact);
		}
		
		
	}
	

}
