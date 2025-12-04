package hashMaps;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ReverseOrder {
	
	public static void main(String[] args) {
		
		List<String> list = new ArrayList<>(Arrays.asList("kunal", "shivam", "vivian", "jd", "satya", "martin"));
		
		displayReverse(list);
	}

	private static void displayReverse(List<String> list) {
		
		int f=0;
		int l=list.size()-1;
		
		while(f <=l) {
			
		 String first = list.get(f);
		 String last = list.get(l);
			
			String temp = first;
			first = last;
			last = temp;
			
			f++;
			l--;
		}
		
		System.out.println(list);
		
	}

}
