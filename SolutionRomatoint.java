package com.CSE2027.day1;
import java.util.*;

class SolutionRomatoint {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String s = input.nextLine();

        SolutionRomatoint obj = new SolutionRomatoint();

        int result = obj.romanToInt(s);

        System.out.println(result);
    }

    public int romanToInt(String s) {
        int result = 0;

        for(int i = 0; i < s.length(); i++) {
            int current = values(s.charAt(i));

            if(i < s.length() - 1 && current < values(s.charAt(i + 1))) {
                result -= current;
            } else {
                result += current;
            }
        }

        return result;
    }

    public int values(char ch) {
        if(ch == 'I') return 1;
        if(ch == 'V') return 5;
        if(ch == 'X') return 10;
        if(ch == 'L') return 50;
        if(ch == 'C') return 100;
        if(ch == 'D') return 500;
        if(ch == 'M') return 1000;

        return 0;
    }
}