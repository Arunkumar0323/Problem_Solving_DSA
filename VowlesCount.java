package com.CSE2027.day1;
import java.util.*;


public class VowlesCount {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the sring:");
		String str1 = input.nextLine();
		int count = 0;
		str1=str1.toLowerCase();
		for(int i=0;i<str1.length();i++) {
			char ch = str1.charAt(i);
			if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u') {
				count++;
			}
		}
		System.out.println("The vowles count:" +count);

	}

}
