package com.arya.javainterfacetypes;

import com.arya.interfacetypes.funcational.Addition;
import com.arya.interfacetypes.funcational.ArithmaticOperation;
import com.arya.interfacetypes.funcational.Substraction;

public class FuncationalInterfaceApp {
	
	public static void main(String[] args) {
//		ArithmaticOperation addition = new Addition ();
//		int result = addition.operation(10,20);
//		System.out.println(result);
//		
//		// polymorphism
//		//addition = new Substraction();
//		ArithmaticOperation substraction = new Substraction();
//		System.out.println(substraction.operation(20,10));
//		
//		//annonymous class
//		ArithmaticOperation multiplication =  
//				new ArithmaticOperation() {
//			@Override
//			public int operation(int number1, int number2) {
//				return number1*number2;
//			}
//		};
//		
//		System.out.println(multiplication.operation(10,10));
		
		//lambda expression
		ArithmaticOperation division = (int number1, int number2) -> number1/number2;
		ArithmaticOperation addition = (int number1, int number2) -> number1+number2;
		ArithmaticOperation substraction = (int number1, int number2) -> number1-number2;
		ArithmaticOperation multiplication = (int number1, int number2) -> number1*number2;
		
		System.out.println("Addition:" + addition.operation(10,20));
		System.out.println("Substraction:" + substraction.operation(10,20));
		System.out.println("Multiplication:" + multiplication.operation(10,20));
		System.out.println("Division:" + division.operation(10,20));
		}
}
