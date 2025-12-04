package MultiThreading.bank;

public class Bank {
	
	private double balance;

	public Bank() {}
	
	public Bank(double balance) {
		this.balance = balance;
	}
	
		
	public synchronized void deposite(double dAmt) {
		
			
		try 
		{
			Thread.sleep(5000);
		} 
		catch (InterruptedException e) 
		{
			System.out.println(e.getMessage());
		}
		
		this.balance += dAmt;
		System.out.println(dAmt + " is Deposited.");
		System.out.println("current balance: " + balance);
		notify();
	}
	
	
	public synchronized void withdraw(double wAmt) {
		
		System.out.println("requested withdral of " + wAmt);
		
		if(wAmt > balance) {
			try {
				System.out.println("InSufficiant Balance");
				System.out.println("current Balance : " + balance);
				wait();
			}
			catch(InterruptedException e1) {
				e1.getMessage();
			}
		}
		
		this.balance -= wAmt;
		System.out.println(wAmt +" withdrawn ");
		System.out.println("current balance is: " + balance);
	}
	
}
