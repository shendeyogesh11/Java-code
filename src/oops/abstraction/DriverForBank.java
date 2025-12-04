package oops.abstraction;

import java.util.Scanner;

public class DriverForBank {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		HdfcBank h1 = new HdfcBank(0);
		
		
		int amount;
		int choise;
		
		
		
		do {
			
			System.out.println("*********MENU********");
			System.out.println("1. CHECK Balance");
			System.out.println("2. ADD Amount");
			System.out.println("3. WITHDRAW Amount");
			System.out.println("0. EXIT");
			
			System.out.println("Enter your choise: " );
			choise = sc.nextInt();
			
		    switch(choise){
			
			
			case 1:
				System.out.println("balance is : " + h1.showBalance());
				break;
			case 2:
				System.out.println("Enter your amount to add : ");
				amount = sc.nextInt();
				h1.addDeposite(amount);
				
				break;
				
			case 3: 
				System.out.println("Enter your amount to withdraw : ");
				amount = sc.nextInt();
				h1.withdraw(amount);
				break;
				
				
			case 0:
                System.out.println("Exited... Thank you!");
                break;

            default:
                System.out.println("Invalid choice. Please try again.");
		}
		
		} while(choise != 0);

	
	}

}
