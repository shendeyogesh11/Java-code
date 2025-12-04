package collectionFramework;

import java.util.ArrayList;
import java.util.List;

public class DemoStudent {
	
	public static void main(String[] args) {
		
		Student s1 = new Student(18,"virat", 78.8);
		Student s2 = new Student(45,"rohit", 87.8);
		Student s3 = new Student(33,"hardik", 72.8);
		Student s4 = new Student(1,"rahul", 92.8);
		
		List<Student> players = new ArrayList<>();
		players.add(s1);
		players.add(s2);
		players.add(s3);
		players.add(s4);
		double sum=0;
		
		for(Student s: players) {
			sum += s.getPer();
		}
		
		double avg= sum / players.size();
		System.out.println("Average percentage is : " + avg );
		
	}

}
