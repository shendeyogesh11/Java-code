package oops.polymorphism;

public class DriverApp {
	
	public static void main(String[] args) {
		
		
		
		Amitabh og = new Amitabh();
		
		og.car();
		og.car("porsche", 2022, 15000000);
		
		
		
		Abhishek a1 = new Abhishek();
		a1.home();
		System.out.println(a1.education);
		
		
		Amitabh oog = new Abhishek();
		oog.car(); // here method belongs to the object i.e Abhishek 
		System.out.println(oog.education); // here variable belongs to the reference i.e Amitabh
		
		Amitabh b1 = new Amitabh();
		
		System.out.println(b1.education);
		
		
		// reference 
		
		final FinalKeyword n1 = new FinalKeyword(18,"virat",78.9);
		System.out.println(n1.roll);
		n1.setRoll(19);
		System.out.println(n1.roll);
		
		// The final local variable n1 cannot be assigned
//		n1 = new FinalKeyword(45,"rohit",87.9);
//		System.out.println(n1.roll);
//		n1.setRoll(46);
//		System.out.println(n1.roll);
		
		
//		System.out.println(n1.num1);
//		n1.num1 = 20;
//		System.out.println(n1.num1);
		
		
	}

}
