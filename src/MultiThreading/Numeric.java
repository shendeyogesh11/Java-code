package MultiThreading;

public class Numeric extends Thread {
	

    public void run() {
	
    	for(int i=0; i<26; i++) {
    		
    		System.out.println(i);
    		
            try {
				
				Thread.sleep(3000);
				
			}catch(InterruptedException e1) {
				
				e1.getMessage();
			}
    	}
   }
}
