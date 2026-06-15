package com.CSE2027.day1;
import java.util.*;

public class Hashmapex {

    public static void main(String[] args) {

        int[] arr = {1, 3, 4, 5, 5};

        HashMap<Integer, Integer> map = new HashMap<>();

        for (int nums : arr) {
            map.put(nums, map.getOrDefault(nums, 0) + 1);
            }
        for(Map.Entry<Integer, Integer> entry : map.entrySet()) {
        	if(entry.getValue()>1) {
        		System.out.println(entry.getKey());
        	}
        	
        }

        System.out.println(map.entrySet());
        System.out.println(map.keySet());
        System.out.println(map.get(5));
        System.out.println(map.values());
        
    }
}



