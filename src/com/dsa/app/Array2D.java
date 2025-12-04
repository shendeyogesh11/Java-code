package com.dsa.app;

import java.util.Scanner;

public class Array2D {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int arr[][] = new int[3][5];
		
		for(int i=0; i<arr.length; i++) {
			
			for(int j=0; j<arr[i].length; j++) {
				System.out.println("Enter a number: ");
				arr[i][j] = sc.nextInt();
			}
		}
		
		
          for(int i=0; i<arr.length; i++) {
			
			for(int j=0; j<arr[i].length; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
		
		
			int max = Integer.MIN_VALUE;
           for(int i=0; i<arr.length; i++) {
			
			 for(int j=0; j<arr[i].length; j++) {
				
				 if(arr[i][j] > max) {
					 max = arr[i][j];
				 }
			}
		}
           
         System.out.println("Maximun number from array is : " + max); 
         
         
         for(int i=0; i<arr.length; i++) {
        	 int maxfromrow = Integer.MIN_VALUE;
			 for(int j=0; j<arr[i].length; j++) {
				
				 if(arr[i][j] > maxfromrow) {
					 maxfromrow = arr[i][j];
				 }
				 
			}
			 
			 System.out.println("Maximun number from " + i + " row is : " + maxfromrow); 
		}
		
	}

}
