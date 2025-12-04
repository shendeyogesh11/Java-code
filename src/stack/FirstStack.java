package stack;

import java.util.Scanner;

public class FirstStack {
	
	static int[] stack = new int[5];
	static int top = -1;
	static Scanner sc = new Scanner(System.in);
	static int choise;
	
	public static void main(String[] args) {
		
		do {
			
			System.out.println("***Stack Menu***");
			System.out.println("1. PUSH");
			System.out.println("2. POP");
			System.out.println("3. DISPLAY");
			System.out.println("0. EXIT");
			System.out.println("Enter your choise:");
			choise = sc.nextInt();
			
			switch(choise) {
			
			case 1: push(); break;
			case 2: pop(); break;
			case 3: display(); break;
			case 0: System.exit(choise); break;
			default: System.out.println("Envalid Input");
			
			
			}
			
			
		} while(choise != 0);
		
	}


	
	private static void push() {
		
		if(top == stack.length-1) {
			System.out.println("stack is full");
		}
		else {
			
			top++;
			System.out.println("Enter the Element to push: ");
			int data = sc.nextInt();
			stack[top] = data;
			System.out.println(data + " is pushed.");
			
		}
			
	}
	
	
	private static void pop() {
		
		if(top == -1) {
			System.out.println("stack is empty! nothing to pop");
		}
		else {
			
			System.out.println(stack[top] + " is popped ");
			top--;
		}
		
		
	}
	
	
	private static void display() {
		
		
		if(top == -1) {
			System.out.println("stack is empty! nothing to display");
		}
		else {
			
			for(int i = top; i>=0; i--) {
				System.out.println(stack[i]);
			}
			
		}
			
		
	}

}
