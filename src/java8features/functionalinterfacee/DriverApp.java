package java8features.functionalinterfacee;

public class DriverApp {
	public static void main(String[] args) {
		
//		Demo demo=  ()-> System.out.println("Welcome to FSD Java React");
//		demo.greet();
		
		
//		Demo1 demo1 = (name) -> System.out.println("hello " + name + " from demo1");
//		demo1.greet("vivian");
		
		
//		Demo1 demo2 = (name) -> "Welcome " + name;
//		String result = demo2.greet("vivian");
//		System.out.println(result);
		
		
//		Demo1 demo2 = name -> "Welcome " + name;
//		String result = demo2.greet("vivian");
//		System.out.println(result);
		
		
//		Demo1 demo2 = (name, city) -> "Welcome " + name + " from " + city;
//		String result = demo2.greet("vivian" , "pune");
//		System.out.println(result);
		
		
		Demo1 demo2 = (name, city) ->  {
			System.out.println("welcome " + name); 
			System.out.println("welcome " + name); 
			return "from " + city;
		};
		
		String result = demo2.greet("vivian" , "pune");
		System.out.println(result);
					
		
	}
	
	
}
