package com.arya.synchronization;

import com.arya.synchronization.printmessage.PrintMessage;

public class Synchronization {
	
	public static void main(String[] args) {
		PrintMessage print = new PrintMessage();
		
		Thread thread1 = new Thread(print,"Thread1");
		Thread thread2 = new Thread(print,"Thread2");
		Thread thread3 = new Thread(print,"Thread3");
		
		thread1.start();
		thread2.start();
		thread3.start();
	}

}
