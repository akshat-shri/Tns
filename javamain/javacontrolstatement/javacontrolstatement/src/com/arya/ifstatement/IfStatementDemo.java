package com.arya.ifstatement;

public class IfStatementDemo {

	public static void main(String[] args) {
		 boolean isValid =true;
		 
		 if(isValid);
			  System.out.println("true");
			  
			  isValid= false;
			  if(isValid ) {
				  System.out.println("true");
			  }else {
				  System.out.println("false");
			}
	}
			  int marks = 70;
			  //int marks2= 20;
			 // int nmarks3= 15;
			  
			  if(marks>=90) {
				  System.out.println("A grade");
				  }else if(marks>=80) {
					  System.out.println("B grade");
			  }else if(marks>=70) {
				  System.out.println("C grade");
		  }else {
				  System.out.println("Fail");
		  }
      static void  ifStatment() {
    	  boolean isValid =true;
 		 
 		 if(isValid);
 			  System.out.println("true");
    	  }
      static void  ifElseStatment() {
    	 boolean isValid= false;
		  if(isValid ) {
			  System.out.println("true");
		  }else {
			  System.out.println("false");
		}
      }
      static void elseIfladder() {
    	  int marks = 60;
		  //int marks2= 20;
		 // int nmarks3= 15;
		  
		  if(marks>=90) {
			  System.out.println("A grade");
			  }else if(marks>=80) {
				  System.out.println("B grade");
		  }else if(marks>=70) {
			  System.out.println("C grade");
	  }else {
			  System.out.println("Fail");
	  }
		  
		  static void switchStatement () {
			  char ch='7';
			  switch(ch) {
			  case'1' : System.out.println("Monday");
			  break;
			  case '7' : System.out.println("Sunday");
			  case '8' : System.out.println("Sunday+");
			  break;
			  default : System.out.println("Invalid Input");
			  
			  // after java 8
			  switch(ch) {
			  case'1'-> System.out.println("monday");
			  case'7' -> {
				  System.out.println("this is case 7");
				  System.out.println("Sunday");
				  }
			  default -> System.out.println("Invalid input please give valid input")
			    }
			  }
		  }
			  static void ternaryoperation() {
				  int number1=10;
				  int number2=10;
				  int number3=10;
				  
			//	  int greater =(number1>number2) ? number1:number2;
				//  System.out.println("gretaer number in number1 add number2 is:" +greater);
				  
				  int greater = (number1>number2)?
						  ((number1>number3) ? number1:number3):
							  ((number2>number3)?number2:number3);
				  System.out.println("greater number ");
				  
			  }
		  }
			  
     }
      

    	  

			  

	


