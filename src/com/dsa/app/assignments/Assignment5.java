package com.dsa.app.assignments;

public class Assignment5 {
	
	public static void main(String[] args) {
        int[][] arr1 = {
            {10, 20},
            {30, 40, 50},
            {60}
        };

        int[][] arr2 = {
            {101, 102},
            {103, 104, 105},
            {106}
        };

        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr1[i].length; j++) {
                int sum = arr1[i][j] + arr2[i][j];
                System.out.println(arr1[i][j] + " + " + arr2[i][j] + " = " + sum);
            }
        }
    }

}
