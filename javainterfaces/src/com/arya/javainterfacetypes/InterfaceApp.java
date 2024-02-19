package com.arya.javainterfacetypes;

import com.arya.interfacetypes.normal.PrintData;
import com.arya.interfacetypes.normal.PrintDataImpl;

public class InterfaceApp {
	public static void main(String[] args) {
		
		// cannot intanciate object of interface 
		// PrintData print = new PrintData();
		
		PrintData print = new PrintDataImpl();
		
		print.printHello();
		
		PrintData.printHelloWorld();
		
		print.printInterger(10);
		
		print.printString("I Am from India");
		
	}

}
