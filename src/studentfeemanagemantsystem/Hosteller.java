package studentfeemanagemantsystem;

public class Hosteller extends Student {
	
	double foodCharges;

	public Hosteller(String name, int roll, String course, double fees,double foodCharges) {
		super(name, roll, course, fees);
		this.foodCharges = foodCharges;
	}

	@Override
	public void printFeeReceipt() {
		
		super.displayStudentDetails();
		System.out.println("Base Fees for Day Scholar Student "+this.fees);
		System.out.println("Food Charges "+this.foodCharges);
		System.out.println("Total Fees "+this.calculateFees());
			
	}

	@Override
	public double calculateFees() {
		
		return this.foodCharges+this.fees;
	}
	

}
