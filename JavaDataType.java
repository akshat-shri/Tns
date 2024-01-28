package com.arya.javadata;

public class JavaDataType {

	public static void main(String[] args) {
		byteDataType();
		shortDataType();
		IntegerDataType();
		longDataType();
		floatDataType();
		doubleDataType();
		charDataType();
		booleanDataType();
		

	}
	
	public static void byteDataType() {
		byte byteMaxVariable = Byte.MAX_VALUE;
		byte byteMinVariable = Byte.MIN_VALUE;
		System.out.println("Byte Max:"
				+ byteMaxVariable
				+ " Min:"
				+ byteMinVariable
				);
		
	}
	public static void shortDataType() {
		short shortMaxVariable = Short.MAX_VALUE;
		short shortMinVariable = Short.MIN_VALUE;
		System.out.println("Short Max:"
				+ shortMaxVariable
				+ " Min:"
				+ shortMinVariable
				);
		
	}
	public static void IntegerDataType() {
		int intMaxVariable = Integer.MAX_VALUE;
		int intMinVariable = Integer.MIN_VALUE;
		System.out.println("Int Max:"
				+ intMaxVariable
				+ " Min:"
				+ intMinVariable
				);
		
	}
	public static void longDataType() {
		long longMaxVariable = Long.MAX_VALUE;
		long longMinVariable = Long.MIN_VALUE;
		System.out.println("Long Max:"
				+ longMaxVariable
				+ " Min:"
				+ longMinVariable
				);
		
	}
	public static void floatDataType() {
		float floatMaxVariable = Float.MAX_VALUE;
		float floatMinVariable = Float.MIN_VALUE;
		System.out.println("Float Max:"
				+ floatMaxVariable
				+ " Min:"
				+ floatMinVariable
				);
		
	}
	public static void doubleDataType() {
	double doubleMaxVariable = Double.MAX_VALUE;
	double doubleMinVariable = Double.MIN_VALUE;
		System.out.println("double Max:"
				+ doubleMaxVariable
				+ " Min:"
				+ doubleMinVariable
				);
		
	}
	public static void charDataType() {
		char ch = 'A';
		System.out.println(ch);
		
		ch = '\uAAAA';
		System.out.println(ch);
		
		ch = 65;
		System.out.println(ch);
		
	}
	public static void booleanDataType() {
		boolean isValid =true;
		if(isValid)
			System.out.println("True");
		}

}
