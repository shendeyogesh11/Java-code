package oops.polymorphism;

// final > class, varable, reference variable, method
 final public class FinalKeyword {
	 
	 int num1 = 10;
	 int roll;
	 String name;
	 double per;
	 
	
	final static int a;   // 1. varable
//	final int b;
	static {
		a=10;
	}
	
	public FinalKeyword() {
		
//		b=10;
//		b=30; // cannot reassign to a final variable
	}
	
	public FinalKeyword(int a,String g,double c) {
		
		this.roll = a;
		this.name = g;
		this.per = c;
//		this.b = 0;
			
	}
	
	
	public int getNum1() {
		return num1;
	}


	public void setNum1(int num1) {
		this.num1 = num1;
	}


	public static int getA() {
		return a;
	}


	public int getRoll() {
		return roll;
	}

	public void setRoll(int roll) {
		this.roll = roll;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getPer() {
		return per;
	}

	public void setPer(double per) {
		this.per = per;
	}

//	public int getB() {
//		return b;
//	}


	final public void add() {
		
		System.out.println("hello from final add ");
	}

	


//	public static void main(String[] args) {
//		int a;
//		
//		System.out.println(a);
//	}

}
