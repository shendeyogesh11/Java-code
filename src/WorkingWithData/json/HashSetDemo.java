package WorkingWithData.json;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class HashSetDemo {
	
	public static void main(String[] args) {
		
		Student s1 = new Student(1, "Rahul", 87.5);
		Student s2 = new Student(18, "virat", 78.5);
		Student s3 = new Student(45, "Rohit", 76.5);
		
		
		List<String> list = new ArrayList<>(Arrays.asList("rohit", "virat", "rahul", "hardik", "virat" ,null, null));
		// duplicates allowed , maintains order, multiple null values are allowed
		System.out.println(list);
		
		Set<String> set = new HashSet<>(Arrays.asList("rohit", "virat", "rahul", "hardik", "virat" ,null, null));
		// no duplicates allowed , does not maintains order, single null value allowed

		System.out.println(set);
		
		
		// if you want combination of both then use treeSet
		
		Set<String> lSet = new LinkedHashSet<>(Arrays.asList("rohit", "virat", "rahul", "hardik", "virat" ,null, null));
		
		System.out.println(lSet);
		
		
		Set<Integer> tree = new TreeSet<>(Arrays.asList(5,3,1,9,6,8,4)); 
		// compare and arrange in ascending order
		
		System.out.println(tree);
		
		
		Set<Student> sortedStudents = new TreeSet<>(new NameComparator());
		
		sortedStudents.add(s1); 
		sortedStudents.add(s2);
		sortedStudents.add(s3);
		
		
		System.out.println(sortedStudents);
		
		
	}

}
