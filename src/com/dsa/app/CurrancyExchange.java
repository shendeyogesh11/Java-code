package com.dsa.app;

import java.util.Scanner;

public class CurrancyExchange {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the count of denomnations for the notes in your country?: ");
		
		int notesCount = sc.nextInt();
		int[] currency = new int[notesCount];
		
         System.out.println("Enter the" + notesCount + " denomnations in any random order: ");
		
         for(int i=0; i<currency.length; i++) {
        	 
        	 currency[i] = sc.nextInt();
         }
         
         sorting.InsertionSort.insertionsortDesc(currency);
         
         
         System.out.println("Enter the amount to be exchanged: ");
         
         int exchangeAmount = sc.nextInt();
         
         int[] notes = new int[notesCount];
         
         for(int i=0; i<currency.length; i++) {
        	 
        	 if(exchangeAmount > 0) {
        		 
        		 notes[i] = exchangeAmount / currency[i];
        		 exchangeAmount =  exchangeAmount % currency[i];
        	 }
         }
         int totalNotes = 0;
         
         for(int i=0; i<notes.length; i++) {
        	 
        	 if(notes[i] != 0) {
        		 System.out.println(currency[i]+ " * " + notes[i]);
        		 totalNotes += notes[i];
        	 }
         }
         
         System.out.println("Total notes given: " + totalNotes ); 
         
         if (exchangeAmount > 0) {
             System.out.println(exchangeAmount + " Amount that be exchanged in coins : ");
         }
		
		
		
	}

}
