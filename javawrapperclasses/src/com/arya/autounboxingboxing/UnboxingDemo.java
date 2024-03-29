package com.arya.autounboxingboxing;

import java.util.ArrayList;
import java.util.List;

public class UnboxingDemo {
	public static void main(String[] args) {
		Integer number1 = 10;
		int number2  = number1; // autounboxing
		
		System.out.println(number1);
		
		
		String binaryRepresentation = Integer.toBinaryString(number2);
		
		System.out.println(binaryRepresentation);
		
		System.out.println("number2");
		
		float floatVariable = number1.floatValue();
		System.out.println(floatVariable);
		
		Double doubleVariable = number1.doubleValue();
		System.out.println(doubleVariable);
		
		Double doubleVariable1= Double.valueOf("123.123");
		
		
		// 
		List<Integer>integerList = new ArrayList<Integer>();
		integerList.add(1);
		integerList.add(2);
		integerList.add(3);
		integerList.add(4);
		
		for(int number:integerList)
			System.out.println(number);
	}

}
