package com.nt.factory;

import com.nt.comp.ApolloTyre;
import com.nt.comp.BudgetCar;
import com.nt.comp.Car;
import com.nt.comp.CeatTyre;
import com.nt.comp.LuxuryCar;
import com.nt.comp.MRFTyre;
import com.nt.comp.SportsCar;
import com.nt.comp.Tyre;

public class CarFactory {
	public static Car getInstance(String cartype) {
		Car car =null;
		Tyre tyre =null;
		if(cartype.equalsIgnoreCase("SportsCar")) {
			tyre = new MRFTyre();
			car = new SportsCar(tyre);
		}
		else if(cartype.equalsIgnoreCase("LuxuryCar")) {
			tyre = new ApolloTyre();
			car = new LuxuryCar(tyre);
		}
		else if(cartype.equalsIgnoreCase("BudgetCar")) {
			tyre = new CeatTyre();
			car = new BudgetCar(tyre);
		}
		return car;
		

	}

}
