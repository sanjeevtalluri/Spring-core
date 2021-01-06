package com.nt.comp;

import java.util.Arrays;
import java.util.Random;

public class Flipkart {
	private Courier courier;
	public void setCourier(Courier courier) {
		this.courier = courier;
	}
	public String shopping(String[] items,float[] prices) {
		float sum = 0.0f;
		//calculate total billing price
		for(float p : prices) {		
			sum+=p;
		}
		//assign random orderid value to courier and get the message
		String s = courier.delivery(new Random().nextInt(1000));
		// final status of the order
		return(Arrays.toString(items)+" total billing is : "+sum+"RS "+s);
	}

}
