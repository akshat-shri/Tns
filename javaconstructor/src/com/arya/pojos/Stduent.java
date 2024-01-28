package com.arya.pojos;

public class Stduent {
         
	int rollNo;
	String name;
	byte age;
	
	//access modifier return method (args);
	
	public Stduent() {}
	
	
	// variable shadowing
	public Stduent (int rollNo, String name , byte age) {
		this.rollNo =rollNo; // instance rollNo =0; local rollNo=1
		this.name=name;
		this.age=age;
	}
	
	public Stduent (int rollNo) {
		this.rollNo=rollNo;
	}
	public void printProperties() {
		System.out.println("RollNo:" + rollNo + "Name:" + name + "age:" +age);
		
	}

}
