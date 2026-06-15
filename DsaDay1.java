package com.CSE2027.day1;
import java.util.*;

public class DsaDay1 {

	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<>();
		list.add(10);
		list.add(20);
		list.add(17);
		list.add(46);
		list.add(50);
		list.add(10);
		list.add(76);
		list.add(10);
		list.add(10);
		for(int i=list.size()-1;i>=0;i--) {
			System.out.println (list.get(i));//normal for loop 
		}
		
		for(int num:list) {
			System.out.println (num);//for each loop to reduce the code here where can store the value from list to create one temp variable with datatype 
		}
		
		ArrayList<Integer> result = new ArrayList<>();
		
		for(int num1:list) {
			if(!result.contains(num1)) {
				result.add(num1);
			}
			
			
		}
		int max_element=list.get(0);
		
		for(int num3:list) {
			if(num3>max_element) {
				max_element=num3;
			}
		}
		
		int min_element=list.get(0);
		for(int num3:list) {
			if(num3<min_element) {
				min_element=num3;
			}
		}
		
		ArrayList<Integer> list1 = new ArrayList<>();
		list.add(10);
		list.add(20);
		list.add(17);
		list.add(46);
		list.add(50);
		list.add(10);
		list.add(76);
		list.add(10);
		list.add(10);
		ArrayList<Integer> merged = new ArrayList<>();
		for(int num5:list) {
			
			merged.add(num5);
			}
          for(int num6:list1) {
			
			merged.add(num6);
			}
        

          System.out.println("The merged array :");
          System.out.println(merged);
		System.out.println("The Maxelement is:");
		
		System.out.println(max_element);
		
        System.out.println("The Minelement is:");
		
		System.out.println(min_element);
		
		
		System.out.println("Without repeating:");
		
		System.out.println(result);
		
	}

}
