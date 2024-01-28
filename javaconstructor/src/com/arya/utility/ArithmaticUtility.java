package com.arya.utility;

import java.util.Scanner;

public class ArithmaticUtility {
	
     int operand1;
     int operand2;
     
     Scanner scanner;
     
     // Default Constructor
     public ArithmaticUtility() {
    	scanner = new Scanner(System.in);
     }
     
     
     //parameterized Constructor
     public ArithmaticUtility(int operand1, int operand2) {
    	 this.operand1=operand1;
    	 this.operand2=operand2;
    	 scanner = new Scanner (System.in);
    	 }
     
     public int printMenu() {
    	 System.out.println("1. For Addition");
    	 System.out.println("2. For Substraction");
    	 System.out.println("3. For Multiplication");
    	 System.out.println("4. For Division");
    	 System.out.println("5. For Modulo");
    	 System.out.println("0. For Exit");
    	 
    	  return scanner.nextInt();
    	 }
     
     public void addition() {
    	 System.out.println(operand1+operand2);
     }
     public void substraction() {
    	 System.out.println(operand1-operand2);
     }
     
     public void multiplication() {
    	 System.out.println(operand1*operand2);
     }
     public void Division() {
    	 System.out.println(operand1/operand2);
     }
     public void Modulo() {
    	 System.out.println(operand1%operand2);
     }
     
}
