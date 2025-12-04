package com.dsa.app;

import java.util.Scanner;

public class AdvChocolates {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter no of students in class: ");
        int students = sc.nextInt();
        int sum = 0;
        int target = 50;

        for (int i = 1; i <= students; i++) {
            System.out.print("Roll no " + i + " enter the no of chocolates you bought: ");
            int chocolate = sc.nextInt();

            if (i % 2 == 1) {   
                if (chocolate % 5 != 0 || chocolate < 10) {
                    continue;
                }
            } else {   
                if (chocolate % 7 != 0 || chocolate < 10) {
                    continue;
                }
            }

            sum += chocolate;

            if (sum > target) {  
                break;
            }
        }
        System.out.println("Targrt reached");
        System.out.println("Total chocolates collected by peon is: " + sum);
        System.out.println("Extra chocolates "+ (sum-target));
        
    }
}
