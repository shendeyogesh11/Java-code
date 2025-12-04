package MultiThreading;

public class Alpha implements Runnable {
	
	
	
	
	public void run() {
		
		for(char ch = 'A'; ch<='Z'; ch++) {
			
			System.out.println("\t" + ch);
			
			try {
				
				Thread.sleep(1000);
				
			}catch(InterruptedException e1) {
				
				e1.getMessage();
			}
		}
	}

}
