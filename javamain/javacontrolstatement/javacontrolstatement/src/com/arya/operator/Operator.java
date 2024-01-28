package com.arya.operator;

public class Operator {

	public static void main(String[] args) {
		unaryOperator();
		bitwiseOperator();
   }
	
	static void unaryOperator() {
		int number1=10;
		int number2=20;
		int number3=30;
		int result;
		
		result = (number1++ + number2-- + number3++);
		System.out.println(result);
		System.out.println(number1);
		System.out.println(number2);
		System.out.println(number3);
		unaryOperatorwithArugment(number3++);
	}
	
	static void unaryOperatorwithArugment(int number) {
		System.out.println(number);
	}
	
	static void bitwiseOperator() {
		int number =-10;
		System.out.println(Integer.toBinaryString(number));
		int result = -10>>>1; //  left shift
		System.out.println(Integer.toBinaryString(result));
		System.out.println(result);
	}

}
