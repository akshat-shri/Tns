package com.arya.autoboxing;

public class AutoBoxingDemo {
	
	public static void main( String [] args) {
		String msg = "10";
		Integer number1 = new Integer (10);
		
		//SCP/SLP
		Integer number2 = 10;
		
		// autoboxing 
		int value = 10;
		Integer number3 =value;
		
		System.out.println(number3);
		
		//autoUnboxing
		int Value1 = number3;
		
		System.out.println(number3);
	}

}
