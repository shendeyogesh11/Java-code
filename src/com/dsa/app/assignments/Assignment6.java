package com.dsa.app.assignments;

import java.util.Scanner;

public class Assignment6 {
	
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter n (number of terms): ");
        int n = sc.nextInt();

        int first = 0, second = 1;
        int sumEven = 0;

        System.out.print("Fibonacci sequence: ");

        for (int i = 1; i <= n; i++) {
            System.out.print(first + " ");

            if (first % 2 == 0) {
                sumEven += first;
            }

            int next = first + second;
            first = second;
            second = next;
        }

        System.out.println("\nSum of even Fibonacci numbers = " + sumEven);
    }

}
