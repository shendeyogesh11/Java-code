package MultiThreading;

public class DemoThreading {
	public static void main(String[] args) {
		
		Alpha a1  = new Alpha();
		Numeric n1 = new Numeric();
		
		Thread t1 = new Thread(a1); // for the implements Runnable
		
		t1.start();
		n1.start();
	}

}
