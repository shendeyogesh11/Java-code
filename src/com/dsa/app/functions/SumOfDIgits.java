package com.dsa.app.functions;

public class SumOfDIgits {
	public static void main(String[] args) {
//			int num = 12345;
//			
//			
//			System.out.println("Sum of Digits is: " + digitsSum(num));
//		}
//		
		int[] arr = new int[5];
		for(int i=0; i<5; i++) {
			int[] arr = 
		}

		 = { 1, 24, 34, 4, 5 };
		sumOfDigitFromArray(arr);

	}

	static void sumOfDigitFromArray(int[] arr) {

		for (int i = 0; i < arr.length; i++) {

			int sum = digitsSum(arr[i]);
			System.out.println("Sum of Digits of " + (i + 1) + "st Number in array is: " + sum);

		}

	}

	static int digitsSum(int n) {

		int sum = 0;
		while (n > 0) {
			int r = n % 10;
			sum = sum + r;
			n = n / 10;
		}
		return sum;
	}

}
