package MultiThreading.bank;

public class Father extends Thread {
	
	 Bank bank;
	 
	 public Father(Bank bank) {
		 this.bank=bank;
	 }
	
	 @Override
	public void run() {
		bank.deposite(10000);
	}

}
