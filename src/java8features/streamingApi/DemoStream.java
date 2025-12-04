package java8features.streamingApi;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DemoStream {
	
	public static void main(String[] args) {
		
		List<Integer> list = new ArrayList<>(Arrays.asList(1,2,3,4,5));
		
		
//		list.stream().map((num) -> num*num).forEach((num) -> System.out.println(num));
		
//		list.stream().map((num) -> num*num).filter(num -> num > 10).forEach((num) -> System.out.println(num));
		
		List<Integer> squareNumbers = list.stream().map((num) -> num*num).filter(num -> num > 10).toList();
		System.out.println(squareNumbers);
		
		
//		So before .get(), if the list becomes empty after filtering, .get() will cause: NoSuchElementException
		
//		int num1 = list.stream().map(num -> num*num).filter(num -> num>=9).reduce((acc,curr)-> acc+curr).get();
		
		// this is the safest , mention initial value to reduce to avoid optional integer . get > may give error
		
		int num1 = list.stream().map(num -> num*num).filter(num -> num>=9).reduce(0,(curr,acc)-> curr+acc);
		
		System.out.println(num1);
		
	}

}
