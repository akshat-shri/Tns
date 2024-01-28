package com.arya.arithmatic;

import com.arya.utility.ArithmaticUtility;

public class Arithmatic {
	
	public static void main(String[] args) {
		ArithmaticUtility operation = new ArithmaticUtility(10,20);
		
		int choice;
		//System.out.println(choice);
		
		do {
			
			choice = operation.printMenu();
			
			switch(choice) {
			case 0 -> System.out.println("Exit");
			case 1 -> operation.addition();
			case 2 -> operation.substraction();
			case 3 -> operation.multiplication();
			case 4-> operation.Division();
			case 5 -> operation.Modulo();
			default -> System.out.println("Invalid input");
			
			}
		} while(choice!=0);

   }
}
