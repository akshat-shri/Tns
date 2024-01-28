package com.arya.loopstatemnt;

public class LoopStatement {

	public static void main(String[] args) {
	            forloop();
	            whileLoop();
	            dowhileLoop();
	            forEachLoop();
		}
	
	static void forloop() {
		for (int i=0;i<10;i++)
			System.out.println(i);
	}
		
		static void whileLoop() {
			int i=0;
			while (i<10) {
				System.out.println(i++);
			}
		}
			
		static void dowhileLoop() {
			int i =0;
			do 
				System.out.println(i++);
			while(i<10);
				System.out.println(i++);
		}
			
		static void forEachLoop() {
			char[] chArray = {'1','2','3'};
			for(char ch:chArray)
				System.out.println(ch);
			
			boolean [] booleanArray = {true, false , true};
			// boolean booleanVariable ; // loop variable 
			for(boolean booleanVariable:booleanArray)
				System.out.println(booleanVariable);
		}
			
	}
		
	


