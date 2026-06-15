package com.CSE2027.day1;
import java.util.*;

public class Second_large {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        int n = input.nextInt();
        int[] array = new int[n];
        
        for(int i = 0; i < n; i++) {
            array[i] = input.nextInt();
        }
        
        int Largest = array[0];
        int second = array[0];
        for(int j =0;j<n;j++) {
        	int num = array[j];
        	 
        	if(num>Largest) {
        		second = Largest;
        		Largest = num;
        	}else if(num > second) {
                second = num;
        		
        }
        

       // Arrays.sort(array);   
        
        //int second_largest = array[n - 2];
        
        //System.out.println(second);
        }
        System.out.println(second);
    }
}


//Manual Method:

