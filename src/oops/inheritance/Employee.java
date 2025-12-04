package oops.inheritance;

import java.util.Scanner;

public class Employee extends Person {
	
	private long eNo;
	private String Designation;
	private double salary;
	Scanner sc = new Scanner(System.in);
	
	
	
	public Employee() {
		
		super();  // >> refering to the parent class constructor
		this.eNo = 111444;
		this.Designation = "developer";
		this.salary= 44444;
	}
	
	
     public Employee(long a, String b, int c, long eNo, String Designation, double salary) {
		
    	super(a,b,c); // >> refering to the parent class parameterized constructor
		this.eNo = eNo;
		this.Designation = Designation;
		this.salary= salary;	
		
	}

	
	
	public void acceptEmployee() {
		
		System.out.println("Enter your employee no: ");
		eNo = sc.nextLong();
		
		
		System.out.println("Enter your designation : ");
		Designation = sc.next();
		
		System.out.println("Enter your salary : ");
		salary = sc.nextDouble();
		
	}
	
	public void displayEmployee() {
		
		System.out.println("your employee no is : " + eNo);
		
		System.out.println("your designation is : " + Designation);

		System.out.println("your salary is : " + salary);

	}

}
