package com.dsa.app;

import java.util.Scanner;

public class Marathon2 {
	
public static void main(String[] args) {
		
		int age;
		double height;
		int weight;
		int nepo;
		char g;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter your age: ");
		age = sc.nextInt();	
	
	    System.out.println("Enter your Height in feet: ");
	    height = sc.nextDouble();
	    
	    System.out.println("Enter your weight: ");
	    weight = sc.nextInt();
	    
	    System.out.println("Enter your Gender: ");
	    g = sc.next().charAt(0);
	    
	    System.out.println(" is your parent model : 1. yes , 0. no");
	    nepo = sc.nextInt();
	    
	    
	    if( ( (g=='m' && age <=23 && height >=6.1 && weight<=70) || (nepo == 0)) ||  ( (g=='f' && age <=19 && height >=5.6 && weight<=55) || (nepo == 0))) {
	    	
	    	System.out.println("Eligible for marathon");
	    } else {
	    	System.out.println("Not Eligible for marathon");
	    }
	}


}
