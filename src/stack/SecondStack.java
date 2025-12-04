package stack;

import java.util.Scanner;
import java.util.Stack;

public class SecondStack {
	
	static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		Stack <Integer> stack = new Stack<>();
		int[] arr = new int[5];
		
		if(checkPalindrome(arr, stack)) {
			System.out.println(" Palindromic array ");
		}else {
			System.out.println(" Not a palindromic array ");
		}
	}
	
	static boolean checkPalindrome(int[] arr, Stack<Integer> stack) {
		
		for(int i=0; i<arr.length; i++) {
			arr[i] = sc.nextInt(); 
			stack.push(arr[i]);
		}
		
		for(int num: arr) {
			if(num != stack.pop()) {
				return false;
			}
		}
		return true;
		
	}

}


