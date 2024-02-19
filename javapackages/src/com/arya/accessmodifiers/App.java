package com.arya.accessmodifiers;

public class App {
	
	private String message;
	
	public static void main(String[] args) {
		showMessage();
		
	}
	
	private static void showMessage() {
		System.out.println("Message");
	}
	
	static void showMessage(0) {
		System.out.println(message);
	}

}
