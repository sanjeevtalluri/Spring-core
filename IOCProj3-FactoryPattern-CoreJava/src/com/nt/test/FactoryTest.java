package com.nt.test;

import com.nt.comp.Car;
import com.nt.factory.CarFactory;

public class FactoryTest {

	public static void main(String[] args) {
		Car c1 = CarFactory.getInstance("SportsCar");
		c1.drive();
		Car c2 =CarFactory.getInstance("LuxuryCar");
		c2.drive();
		

	}

}
