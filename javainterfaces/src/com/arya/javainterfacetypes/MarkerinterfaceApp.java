package com.arya.javainterfacetypes;

import com.arya.interfacetypes.marker.Registrable;
import com.arya.interfacetypes.marker.RegistrableImpl;

import com.arya.interfacetypes.marker.Student;

public class MarkerinterfaceApp {
	
	public static void main(String[] args) {
		
		Registrable student1= new Student();
		RegistrableImpl registraction = RegistrableImpl.getinstance(student1);
		registraction.registerStudent();
	}

}
