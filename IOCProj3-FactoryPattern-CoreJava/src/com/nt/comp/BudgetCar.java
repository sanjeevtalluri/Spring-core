package com.nt.comp;

public class BudgetCar implements Car {

	
	private Tyre tyre;
	public BudgetCar(Tyre tyre) {
		this.tyre = tyre;
	}
	public void drive() {
		System.out.println("this is Budget car  having "+tyre.tyreGrip());

	}

}
