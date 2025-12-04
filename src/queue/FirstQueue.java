package queue;

import java.util.Scanner;

public class FirstQueue {
	
	static int[] queue = new int[5];
	static int rear = -1;
	static int front = 0;
	static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		int choise;
		
		do {
			
			System.out.println("********** QUEUE OPERATIONS ************");
			System.out.println("1. INSERT");
			System.out.println("2. DELETE");
			System.out.println("3. DISPLAY");
			System.out.println("4. EXIT");
			System.out.println("ENTER YOUR CHOISE: ");
			
			choise = sc.nextInt();
			
			switch(choise) {
			case 1 : insert(); break;
			case 2 : mydelete(); break;
			case 3 : display(); break;
			case 4 : System.exit(choise);; break;
			}
			
			
		} 
		while(choise != 4);
		
		
	}

	private static void display() {
		
		for(int i = front; i<= rear; i++) {
			
			System.out.println(queue[i]);
		}
		
	}

	private static void mydelete() {
		if(front > rear) {
			System.out.println("Queue is Empty, Nothing to delete here ");
		}
		else {
			front++;
			System.out.println("element is Deleted from Queue ");
		}
		
	}

	private static void insert() {
		if(rear == queue.length - 1) {
			System.out.println("Queue is full: ");
		}else {
			int data;
			System.out.println("Enter your Data to Insert: ");
			data = sc.nextInt();
			rear++;
			queue[rear] = data;	
			System.out.println(data+ " Inserted into queue ");
			
		}
		
	}

}
