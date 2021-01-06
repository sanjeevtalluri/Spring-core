package com.nt.test;

import com.nt.comp.Flipkart;
import com.nt.factory.FlipkartFactory;

public class StrategyDPTest {

	public static void main(String[] args) {
		Flipkart f = null;
		try{
			f= FlipkartFactory.getInstance();
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		System.out.println(f.shopping(new String[] {"hat","coat","umbrella"},new float[] {50,500,200}));

	}

}
