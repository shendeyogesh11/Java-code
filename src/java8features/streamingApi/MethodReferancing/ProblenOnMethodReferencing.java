package java8features.streamingApi.MethodReferancing;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class ProblenOnMethodReferencing {
	
	public static void main(String[] args) {
		
		List<String> months = new ArrayList<>(Arrays.asList("january", "february", "march", "april", "may", "june", "july", "august", "september", "october", "november", "december"));
		
		                               // Method referencing 
		
//		months.stream().filter( ProblenOnMethodReferencing :: checkLength ).forEach(ProblenOnMethodReferencing::toUpperCase);
		
//		months.stream().filter((month) -> month.length() >= 6).map((month) -> month.toUpperCase()).forEach(System.out :: println);
		
//		months.stream().filter(ProblenOnMethodReferencing :: checkLength).map(ProblenOnMethodReferencing :: toUpperCase).forEach(System.out :: println);
		
		Map<Boolean, List<String>> months1 = months.stream().collect(Collectors.partitioningBy(month -> month.length() >=6));
		
		Map<Boolean, Long> months2 = months.stream().collect(Collectors.partitioningBy(month -> month.length() >=6 ,Collectors.counting()));
		
		Map<Integer, List<String>> months3 = months.stream().collect(Collectors.groupingBy(mon-> mon.length()));
		
		Map<Integer, Long> months4 = months.stream().collect(Collectors.groupingBy(mon-> mon.length(), Collectors.counting()));
			
		
		System.out.println(months4);
		
		
	}
	
	
	
	
	
	public static boolean checkLength (String month){
		
		
//		for(String month: months) {
//			
//			if(){
//				
//				return true;
//			}
//			
//		}
		
		
		return month.length() >= 6;
		
		
		
	}
	
	
	public static String toUpperCase(String month){
		
		
		  return month.toUpperCase();
		
	}
	

}
