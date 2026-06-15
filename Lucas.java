package com.CSE2027.day1;

public class Lucas {

	public static void main(String[] args) {
		 int n = 1;

	        int first = 2, second = 1;

	        System.out.print(first + " " + second + " ");

	        for (int i = 3; i <= n; i++) {
	            int next = first + second;
	            System.out.print(next + " ");

	            first = second;
	            second = next;
	        }

	}

}
