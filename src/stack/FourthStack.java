package stack;

import java.util.Scanner;

public class FourthStack {
	
	public static void main(String[] args) {
		Scanner sc =  new Scanner(System.in);
		
		String input = sc.nextLine().replaceAll("[^A-Za-z]", "").toLowerCase();
		char inputArray[] = input.toCharArray();
		
		int flag =0;
		for(int i=0; i<inputArray.length; i++) {
			if(inputArray[i] != inputArray[inputArray.length - 1 - i]) {
				
				flag = 1;
				break;
			}
			
		}
		
		if(flag==0)
			System.out.println("Palindrome String");
		else
			System.out.println("Not Palindrome String");
	}

}


//one remaining task 