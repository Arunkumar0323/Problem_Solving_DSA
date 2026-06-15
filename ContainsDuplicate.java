package com.CSE2027.day1;

import java.util.*;

public class ContainsDuplicate {

    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 1};

        Arrays.sort(arr);

        for (int i = 0; i < arr.length - 1; i++) {

            if (arr[i] == arr[i + 1]) {
                System.out.println("true");
                return;
            }
        }

        System.out.println("false");
    }
}