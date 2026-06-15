package com.CSE2027.day1;
import java.util.*;
public class Subarray {
      public static void main(String[] args) {
           Scanner input = new Scanner(System.in);
           int n = input.nextInt();
           int[] array = new int[n];
           for(int i=0;i<n;i++) {                                //array 1 2 3 4 5
        	                                                     //index 0 1 2 3 4  n=5
        	   array[i]=input.nextInt();
        	   
           }
           
           for(int i=0;i<n;i++) {
        	   
        	   for(int j=i;j<n;j++) {
        		   
        		   for(int k=i;k<=j;k++) {
        			   System.out.print(array[k]+" ");
        		   }
        		   System.out.println();

        	   }
           }
           
           
      }
}
