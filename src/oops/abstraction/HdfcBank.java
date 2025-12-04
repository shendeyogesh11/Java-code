package oops.abstraction;

public class HdfcBank implements BankingServices {
	
	double balance;
	
	public HdfcBank() {
		
	}
	public HdfcBank(double balance) {
		this.balance = balance;
	}
	
	
	public double showBalance() {
		return balance;
	}
	
	
	public void addDeposite(double amount) {
		
		if(amount >=0) {
			balance = balance +amount;
		}else {
			System.out.println("invalid deposite");
		}
		
	}
	public double withdraw(double amount) {
		
		if(amount <= balance && amount > 0) {
			balance =balance- amount;
		}else {
			System.out.println("low balance");
			System.out.println("current balance : " + balance);
		}
	       
	     
	     return balance;
	
	}
	
	

}
