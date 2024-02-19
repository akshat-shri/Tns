package com.arya.interfacetypes.marker;

public class RegistrableImpl {
	
	public static Registrable getinstance(Student student ) {
		if(student instanceof Registrable)
			return new RegistrableImpl();
		else 
			return null;
		
	}
	public void registerStudent() {
		
	}

}
