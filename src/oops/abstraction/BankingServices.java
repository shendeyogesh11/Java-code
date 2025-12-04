package oops.abstraction;

public interface BankingServices {
	
	double showBalance();
	void   addDeposite( double amount);
	double withdraw(double amount);

}
