package com.arya.exception;

import java.util.Scanner;

public class FinallyDemo {
	
	public static void main(String[] args) {
//		try {
//			System.out.println(10/0);
//		}finally {
//			System.out.println("Finally Block");
//			try {
//			
//		}catch(Exception e){
//			 // TODO: handle exception
//			}
////		} catch(ArithmeticException e) {
////			}
			
			try(Scanner scanner = new Scanner(System.in)){
				int number = scanner.nextInt();
			}catch(NumberFormatException numberFormatException) {
				System.out.println(numberFormatException.getMessage());
			}
    }
  
}
 
