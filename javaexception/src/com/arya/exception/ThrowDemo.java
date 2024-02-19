package com.arya.exception;

public class ThrowDemo {
 public static void main(String[] args)  {
	int age = 20;
	try {
		checkAge(age);
	} catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
 }
  static void checkAge(int age) throws Exception {
	if(age>18) {
		System.out.println("Illegible for voting");
	}
	else 
		throw new UnderAgeExcetion("Hello");
	    System.out.println("After throw statement");
     }
 }
