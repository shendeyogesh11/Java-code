package MultiThreading.bank;

public class BankDriver {
	public static void main(String[] args) {

		Bank bank = new Bank(5000);
		
		Son s1 = new Son(bank);
		Father f1 = new Father(bank);
		
		s1.start();
		f1.start();
	}
}
