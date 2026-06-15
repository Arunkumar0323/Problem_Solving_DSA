package com.CSE2027.day1;

public class LongestSubstringWithoutRepeating {

    public static void main(String[] args) {

        String s = "abcabcbb";

        int maxLength = 0;

        for (int i = 0; i < s.length(); i++) {

            String temp = "";

            for (int j = i; j < s.length(); j++) {

                char ch = s.charAt(j);

                if (temp.indexOf(ch) != -1) {
                    break;
                }

                temp = temp + ch;

                if (temp.length() > maxLength) {
                    maxLength = temp.length();
                }
            }
        }

        System.out.println(maxLength);
    }
}