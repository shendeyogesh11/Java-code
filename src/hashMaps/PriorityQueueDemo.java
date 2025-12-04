package hashMaps;
import java.util.Collections;
import java.util.Iterator;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Scanner;


public class PriorityQueueDemo {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Queue<Integer> juice = new PriorityQueue<>(Collections.reverseOrder());
		
		System.out.println("Enter apple juices : ");
		int apple = sc.nextInt();
		
		System.out.println("Enter orange juices : ");
		int orange = sc.nextInt();
		
		System.out.println("Enter pineApple juices : ");
		int pineApple = sc.nextInt();
		
		juice.add(apple);
		juice.add(orange);
		juice.add(pineApple);
		
		int seconds = juiceMaker(juice);
		
		System.out.println("Minimum Seconds to Prepare Juices is: " + seconds + " Seconds ");
		
	}

	private static int juiceMaker(Queue<Integer> juice) {
		
		int seconds =0;
		
		Iterator<Integer> itr = juice.iterator();
		
		while(!juice.isEmpty()) {
			
			int m1=0;
			int m2=0;
			
			
			m1= juice.remove();
			
			if(itr.hasNext()) {
				
				m2 = juice.remove();
				
			}
			
			if(m1 > 0 && m2 > 0) {
				seconds++;
				
				m1--;
				m2--;
				
				if (m1 > 0) juice.add(m1);
                if (m2 > 0) juice.add(m2);
			}
			
			
			
			if(m1 > 0 && m2 == 0) {
				
				seconds = seconds + m1;
				break;
			}
			
			
		}
		return seconds;
		
	}

}
