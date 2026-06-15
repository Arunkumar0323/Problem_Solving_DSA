package com.CSE2027.day1;
import java.util.*;

public class ArrayS {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the size of the array:");
		int n = input.nextInt();
		int [] array = new int[n];
		System.out.println("Enter the array elements:");
		for(int i =0;i<n;i++) {
			 array[i] = input.nextInt();			
		}
		
		int sum = 0;
		for(int j=0;j<n;j++) {
			sum=sum+array[j];
			
		}
		System.out.println("The sum of array elements is :" +sum);
		int average = sum/n;
		System.out.println("The average of array elements is :" +average);
		
		Arrays.sort(array);
		System.out.println("The min element is :" +array[0]);
		System.out.println("The max element is :" +array[n-1]);
		
		
		/*int max=0;
		for(int i=0;i<n;i++) {
			if(array[i]>max) {
				max=array[i];
			}
		}
		System.out.println("The max element in array:" +max);
		
		int min=array[0];
		for(int i=0;i<n;i++) {
			if(min>array[i]) {
				min=array[i];
			}
		}
		System.out.println("The min element in array:" +min);*/
		
		
	}

}
