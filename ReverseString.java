package com.CSE2027.day1;

import java.util.Scanner;

public class ReverseString {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the string:");
		String str = input.nextLine().toLowerCase().replaceAll("[^a-z0-9]", "");
		System.out.println(str);
		String str1=str;
		String rev="";
		for(int i=str.length()-1;i>=0;i--) {
			rev = rev+str.charAt(i);
		}
		System.out.println("the reverse string is:"  +rev);
		
		if(str1.equals(rev)) {
			System.out.println("It is palindrome");
		}else {
			System.out.println("It is not a palindrome");
			
		}

	}

}
