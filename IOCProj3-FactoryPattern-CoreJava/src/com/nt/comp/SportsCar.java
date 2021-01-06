package com.nt.comp;

public class SportsCar implements Car {

	
	private Tyre tyre;
	public SportsCar(Tyre tyre) {
		this.tyre = tyre;
	}
	public void drive() {
		System.out.println("this is sports car  having "+tyre.tyreGrip());

	}

}
