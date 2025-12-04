package com.dsa.app;

public class OddEvenCount {
	public static void main(String[] args) {
		
		int[] arr = {1,2,3,4,5,6,7,8,9};
		
		int evenCount=0,oddCount=0;
		for(int i: arr) {
			if(i % 2 == 0) {
				evenCount++;
			}else {
				oddCount++;
			}
		}
		
		System.out.println("EvenCount : " + evenCount + " OddCount : " + oddCount);
}
}
