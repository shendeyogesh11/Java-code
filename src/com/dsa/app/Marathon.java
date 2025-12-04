package com.dsa.app;

import java.util.Scanner;

public class Marathon {
	public static void main(String[] args) {
		
		int age;
		double height;
		int weight;
		int nepo;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter your age: ");
		age = sc.nextInt();	
	
	    System.out.println("Enter your Height in feet: ");
	    height = sc.nextDouble();
	    
	    System.out.println("Enter your weight: ");
	    weight = sc.nextInt();
	    
	    System.out.println(" is your parent model : 1. yes , 0. no");
	    nepo = sc.nextInt();
	    
	    
	    if((age <=23 && height >=6.1 && weight<=70) || (nepo == 1) ) {
	    	
	    	System.out.println("Eligible for marathon");
	    } else {
	    	System.out.println("Not Eligible for marathon");
	    }
	}

}
