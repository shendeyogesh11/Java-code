package com.dsa.app.functions;

public class PrimeUsingArray {
	
	public static void main(String[] args) {
		
		int[] arr = {3,4,5,7,45,88};
		
		checkPrime(arr);
		
		
	}
	
	
	static void checkPrime(int[] arr) {
		int count =0;
		
		for(int i=0; i<arr.length; i++) {
			
			if(arr[i]%i==0) {
				
				count++;
			}
			
			if(count == 2) {
				System.out.println(arr[i] + " is a prime number");
			}
			else {
				System.out.println(arr[i] + " is not a prime number");
			}
		}
		
		
		
		
	}

}
