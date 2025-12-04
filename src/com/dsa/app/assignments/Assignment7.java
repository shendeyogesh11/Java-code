package com.dsa.app.assignments;

public class Assignment7 {
	
    public static long factorial(int n) {
        long fact = 1;
        for (int i = 1; i <= n; i++) {
            fact *= i;
        }
        return fact;
    }

    public static void main(String[] args) {
        int[] testNumbers = {5, 7, 4};

        for (int num : testNumbers) {
            System.out.println(num + "! = " + factorial(num));
        }
    }

}
