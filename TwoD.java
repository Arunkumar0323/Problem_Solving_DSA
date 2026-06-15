package com.CSE2027.day1;

public class TwoD {

	public static void main(String[] args) {
        int[][] arr = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
            };

            int target = 8;
            boolean found = false;

            for(int j = 0; j < arr[0].length; j++) {

                for(int i = 0; i < arr.length; i++) {

                    if(arr[i][j] == target) {

                        System.out.println(
                            "Found at Row " + i +
                            " Column " + j
                        );

                        found = true;
                        break;
                    }
                }

                if(found) {
                    break;
                }
            }

		

	}

}
