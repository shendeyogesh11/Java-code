package oops.inheritance;

import java.util.Scanner;

public class Person { 
	protected long adharNo;
	protected String name;
	protected int age;
	Scanner sc = new Scanner(System.in);
	
	
	
	
	
	
	public Person() {
		
		this.adharNo = 111222;
		this.name = "vivian";
		this.age = 23;
	}
	
	
	public Person(long a, String b, int c) {
		
		this.adharNo=a;
		this.name=b;
		this.age=c;
		
	}
	
	
	public void acceptPerson() {
	
		System.out.println("Enter your adhar no: ");
		adharNo = sc.nextLong();
		
		
		System.out.println("Enter your name : ");
		name = sc.next();
		
		System.out.println("Enter your age : ");
		age = sc.nextInt();
		
	}
	
	public void displayPerson() {
		
		System.out.println("your adharNo is : " + adharNo );
		
		System.out.println("your name is : " + name );

		System.out.println("your age is : " + age );

	}

}
