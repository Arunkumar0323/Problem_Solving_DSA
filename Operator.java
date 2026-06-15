package com.CSE2027.day1;
import java.util.*;

public class Operator {

	public static void main(String[] args) {

		
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		int [] arr = new int[n];
		int sum=0;
		
	for(int i=0;i<n;i++) {
		 arr[i]=input.nextInt();
		 //System.out.println(arr[i]);
	}
	
	for(int j=0;j<n;j++) {
	 sum=sum+arr[j];
	 //System.out.println(sum);
	}
	 System.out.println(sum);
	 
	for(int i=0;i<n;i++) {
		if(arr[i]%2==1) {
			System.out.println(arr[i] +  "odd");
		}
		
		else {
			System.out.println(arr[i] +    "even");
			
		}
		
	}  
	
 }
}