package com.arya.sacnner.util;

import java.util.Scanner;

public class ScannerUtility {
	
	public void acceptNumbers() {
		try (Scanner scanner = new Scanner (System.in)){
		System.out.println("Enter an integer number:");
		System.out.println("Number is = " +scanner.nextInt());
		
		System.out.println("Enter an Floating Number");
		System.out.println("Number is ="+ scanner.nextFloat());
	}
 }
	public void acceptCharacters() {
		try(Scanner scanner = new Scanner (System.in)) {
			System.out.println("Enter a Character : ");
			System.out.println(scanner.next().charAt(0));
			
			System.out.println("Enter a Name:");
			System.out.println(scanner.next());
			
			System.out.println("Enter a Address :");
			scanner.nextLine();
			System.out.println(scanner.nextLine());
		}
	}


}
