package oops.constructor;

import java.util.Scanner;

public class Student {
	
	private int rollNo;
	private String Name;
	private int Age;
	Scanner sc=new Scanner(System.in);
	
	public void acceptStudent()
	{
		
		System.out.println("Please enter Roll No");				
		rollNo =sc.nextInt(); 
		
		System.out.println("Please enter Student Name");        
		Name=sc.next();
		
		System.out.println("Please enter Student Age");  
		Age=sc.nextInt(); 
	}
	
	
	public void displayStudent()  
	{
		System.out.println("Student Roll No is "+ rollNo);
		System.out.println("Student Name is "+Name);
		System.out.println("Student Age is "+ Age);
	}	
	
	
	
	public Student() {
		
		this.Name="yogesh";
		this.rollNo=59;
		this.Age=23;
	}
	
	public Student(int roll, String name, int age) {
		
		Name = name;
		rollNo = roll;
		Age = age;
	}
	
	//copy constructor , deep copy
    public Student(Student temp) {
    	
    	temp.Name = "vivian";
		Name = temp.Name;
		rollNo = temp.rollNo;
		Age = temp.Age;
		
	}
}
