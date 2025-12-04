package exceptionHandling;

import java.util.Scanner;

public class Wholesale {
		public static void main(String[] args) {
			
			Scanner sc = new Scanner(System.in);
			boolean valid = false;
			
			while(!valid) {
			
			System.out.println("Enter the quantity you want: ");
			int quantity = sc.nextInt();
			
			try {
			if(quantity >= 500) {
				System.out.println("ok! you can proceed with your order!");
			}else {
				throw new LowQuantityException("please Enter the quantity >= 500");
			}
			
			valid = true;
			
			} catch(LowQuantityException e1){
				
				System.out.println(e1.getMessage());
				sc.nextLine();
				
			}
			
			}
			
			
			
		}

}
