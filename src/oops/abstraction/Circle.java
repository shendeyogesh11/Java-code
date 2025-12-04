package oops.abstraction;

public class Circle implements Shape {
	
	public void area() {
		double result = Math.PI * 5*5;
		System.out.println(result);
	}
	
	
	public void perimeter() {
		
		double result = 2*Math.PI*5;
		System.out.println(result);
	}

}
