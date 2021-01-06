package com.nt.comp;

public class LuxuryCar implements Car {

	
	private Tyre tyre;
	public LuxuryCar(Tyre tyre) {
		this.tyre = tyre;
	}
	public void drive() {
		System.out.println("this is luxury car  having "+tyre.tyreGrip());

	}

}
