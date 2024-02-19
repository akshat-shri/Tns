package com.arya.interfacetypes.normal;

public interface PrintData {
	
	// public abstract void printInterger(int number);
	//abstract method
	
	void printInterger(int number);
	void printString(String message);
	// void printFloat(float number);
	
	// version 1.8
	default void printHello(){
		System.out.println("Hello");
		printHi();
		
	}
	// version 1.8
	static void printHelloWorld() {
		System.out.println("HelloWorld!");
	}
	// version 1.9
	private void printHi() {
		System.out.println("Hi");
	}

}
