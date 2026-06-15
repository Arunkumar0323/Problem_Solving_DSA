package com.CSE2027.day1;

public class LinearSec {

    public static int linearSearch(String str, int target) {

        int n = str.length();

        for(int i = 0; i < n; i++) {

            if(str.charAt(i) == target) {
                return i;
            }
        }

        return -1;
    }

    public static void main(String[] args) {

       // int[] arr = {10, 30, 30, 40, 50};
    	String str = "Arun";

        char target = 'A';

        int result = linearSearch(str, target);

        if(result != -1) {
            System.out.println("Element found at index: " + result);
        }
        else {
            System.out.println("Element not found");
        }
    }
}