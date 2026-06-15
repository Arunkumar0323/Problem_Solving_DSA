package com.CSE2027.day1;
import java.util.*;

public class DSADay2 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.println("Enter String1:");
		String s1 = input.nextLine().toLowerCase();
		System.out.println("Enter String2:");
		String s2 = input.nextLine().toLowerCase();
		HashMap<Character,Integer> map1 = new HashMap<>();
		if(s1.length()!=s2.length()){
			System.out.println("Not Anagram");
			return;
		}
		
		for(Character ch : s1.toCharArray()) {
			
			if(map1.containsKey(ch)) {
				map1.put(ch,map1.get(ch)+1);
			}else {
				map1.put(ch,1);
			}
		}
		
		System.out.println(map1);
		
		for(Character ch : s2.toCharArray()) {
			if(!map1.containsKey(ch)) {
				System.out.println("Not Anagram");
				return;
			}else {
				map1.put(ch, map1.get(ch)-1);
				if(map1.get(ch)==0) {
					map1.remove(ch);
					
				}
			}
		}
		
		System.out.println(map1);
		
		if(map1.isEmpty()) {
			System.out.println("Anagram");
		}
		else {
			System.out.println("Not Anagram");
		}
		
		
		

	}

}
