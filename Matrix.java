package com.CSE2027.day1;
import java.util.*;

public class Matrix {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		char[] arra = new char[n];
		int count = 1;
		
		for(int i = 0;i<n;i++) {
			arra[i]=input.next().charAt(0);
			}
		for(int j=0;j<n;j++) {
			if(j<n-1&&arra[j]==arra[j+1]) {
				count++;
			}else {
				System.out.print(arra[j]+ ""+count);
				count=1;
			}
		}

	}
	
	}

