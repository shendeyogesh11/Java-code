package studentfeemanagemantsystem;

abstract public class Student implements FeeOperations {
	
	protected String name;
	protected int roll;
	protected String course;
	protected double fees;
	
	public Student() {}

	public Student(String name, int roll, String course, double fees) {
		super();
		this.name = name;
		this.roll = roll;
		this.course = course;
		this.fees = fees;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getRoll() {
		return roll;
	}

	public void setRoll(int roll) {
		this.roll = roll;
	}

	public String getCourse() {
		return course;
	}

	public void setCourse(String course) {
		this.course = course;
	}

	public double getFees() {
		return fees;
	}

	public void setFees(double fees) {
		this.fees = fees;
	}
	
	
	public void displayStudentDetails() {
		
		System.out.println(String.format("%s","                  Fee Receipt               "));
		System.out.println(String.format("%s","--------------------------------------------"));
		System.out.println(String.format("%-37s %-7d","Rno :",this.roll));
		System.out.println(String.format("%-37s %-15s","Student Name :",this.name));
		System.out.println(String.format("%-37s %-15s","Student Course :",this.course));
	}
	
	
	public double applyDiscount(double percentageDiscount) 
	{
		return (calculateFees()*(percentageDiscount/100));
	}
	
	public double applyDiscount(double flatAmount, boolean flat) {
		
		return (flatAmount);
	}
	
	
}
