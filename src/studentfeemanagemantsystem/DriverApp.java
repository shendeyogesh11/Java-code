package studentfeemanagemantsystem;

public class DriverApp {
	
	public static void main(String[] args) {
		
		Student s1 = new DayScholar("Alice", 101, "BTech", 80000.0, 15000.0);
		
		Student s2 =new Hosteller("Ben", 102, "BCA", 60000.0, 25000.0);
		
		double discount;
		
		s1.printFeeReceipt();
		
		discount =s1.applyDiscount(10);
		
		System.out.println("10% Discount Applied : " +discount);
		System.out.println("Total Payable : " +(s1.calculateFees()-discount));
		
		
		System.out.println("\n===================================\n");
		
		s2.printFeeReceipt();
		discount=s2.applyDiscount(5000,true);
		System.out.println("Flat 5000 Rs Discount Applied : " +discount);
		System.out.println("Total Payable : " +(s2.calculateFees()-discount));
		
	}
	
	
}
