package stack;

import java.util.Scanner;
import java.util.Stack;

public class ThirdStack {
	
	static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		String str = sc.nextLine().replaceAll("[^A-Za-z]", "").toLowerCase();
		
		
		if(checkPalindrome(str)) {
			System.out.println(" Palindromic String array ");
		}else {
			System.out.println(" Not a palindromic String array ");
		}
	}
	static boolean checkPalindrome(String str) {
		Stack <Character> stack1 = new Stack<>();
		
		for(int i=0; i<str.length(); i++) {
			stack1.push(str.charAt(i));
		}
		
		for(int i=0; i<str.length(); i++) {
			if(str.charAt(i) != stack1.pop()) {
				return false;
			}
		}
		return true;
		
	}

}


