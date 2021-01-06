package com.nt.test;

import com.nt.comp.Flipkart;
import com.nt.factory.FlipkartFactory;

public class StrategyDPTest {

	public static void main(String[] args) {
		Flipkart f = null;
		//get target object
		f= FlipkartFactory.getInstance("DTDC");
		//invoke b.logic
	    System.out.println(f.shopping(new String[] {"hat","coat","umbrella"},new float[] {50,500,200}));

	}

}
