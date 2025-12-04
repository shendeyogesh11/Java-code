package com.dsa.app.assignments;

public class Assignment4 {
	public static void main(String[] args) {
        int[][] arr = {
            {10, 20},
            {10, 20, 30},
            {50, 70}
        };

        long sum = 0;
        long product = 1;

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                sum += arr[i][j];        
                product *= arr[i][j];  
            }
        }

        System.out.println("Sum of all elements = " + sum);
        System.out.println("Product of all elements = " + product);
    }

}
