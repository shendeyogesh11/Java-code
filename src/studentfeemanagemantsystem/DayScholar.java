package studentfeemanagemantsystem;

public class DayScholar extends Student {
	
	double busFare;

	public DayScholar(String name, int roll, String course, double fees, double busFare) {
		super(name, roll, course, fees);
		this.busFare = busFare;
	}

	@Override
	public double calculateFees() {
		
		return this.fees+this.busFare;
	}

	@Override
	public void printFeeReceipt() {
		
		super.displayStudentDetails();
		System.out.println("Base Fees for Day Scholar Student "+this.fees);
		System.out.println("Bus Fare "+this.busFare);
		System.out.println("Total Fees "+this.calculateFees());
		
	}

	
	

}
