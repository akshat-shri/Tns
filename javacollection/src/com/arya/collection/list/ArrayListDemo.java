package com.arya.collection.list;

import java.util.ArrayList;
import java.util.List;



public class ArrayListDemo {
	public static void main(String[] args) {
		List objectlist = new ArrayList<>();
		// Hetrogenous data
		objectList.add(1);
		objectList.add("ABC");
		objectList.add(new Student(1,"ABC"));
		
		System.out.println(objectList);
		
		Student student1= (Student)objectList.get();
		System.out.println(student);
		
	}

}
