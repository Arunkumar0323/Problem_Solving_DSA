package com.CSE2027.day1;
import java.util.*;
public class Array {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter array size:");
		int n = input.nextInt();
		int [] arr = new int[n];
		System.out.println("Enter a element to Search:");
		int Search = input.nextInt();
		int flag=0;
		for(int i = 0 ; i<n;i++) {
			arr[i]=input.nextInt();
		}
		
		for(int j = 0 ; j<n;j++) {
			if(Search==arr[j]) {
				flag=1;
				break;
			}
			
			}
		if(flag==1) {
			System.out.println("Element found");
		}
		else {
			System.out.println("not Element found");
		}
		

	}

}
