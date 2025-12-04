package com.dsa.app;
import java.util.Arrays;

public class LeftShift {
	public static void main(String[] args) {
		int[] arr = {20,40,30,10,50,60};
		int n = arr.length;
		int mid = n / 2;
		
	
		for(int i=0; i<mid; i++) {
			int temp = arr[n-1];
			
			
			for (int j = n - 1; j > 0; j--) {
                arr[j] = arr[j - 1];
            }
			
			arr[0] = temp;
			
		}
		
		System.out.println(Arrays.toString(arr));
	}

}
