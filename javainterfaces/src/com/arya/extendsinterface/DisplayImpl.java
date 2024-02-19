package com.arya.extendsinterface;

public class DisplayImpl {
	
	public static void main(String[] args) {
		Print print = msg -> System.out.println(msg);
		
		print.print("Hello there...");
		
		Display displayObject = new Display() {
			@Override 
			public void print(String message) {
				System.out.println("print:" + message);
			}
			
			@Override 
			public void display(String message) {
				System.out.println("display:"+ message);
			}
		};
		
		displayObject.print("Hello Akshat...");

		displayObject.print("How are you?");
		
		
		
	}

}
