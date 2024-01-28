package com.arya.main;

import com.arya.pojos.Stduent;

public class MainStudent {
	
	public static void main(String[] args) {
		Stduent student = new Stduent(); // Default Constructor
		
		Stduent student1= new Stduent(1, "Akshat", (byte) 21 );
		
		Stduent student2= new Stduent(10);
		
		new Stduent();
		
		student.printProperties();
		student1.printProperties();
		student2.printProperties();
	}

}
