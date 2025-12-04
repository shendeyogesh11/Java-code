package oops.constructor;

public class StudentDriver {
	public static void main(String[] args) {
		
		Student s1 = new Student();
		s1.displayStudent();
		
		Student s2 = new Student(18,"virat",36);
		s2.displayStudent();
		
		
		Student s3 = new Student(s2);
		s3.displayStudent();
		
		
	}
	
	
}
