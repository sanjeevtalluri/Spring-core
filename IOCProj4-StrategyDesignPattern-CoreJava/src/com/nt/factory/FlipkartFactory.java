package com.nt.factory;

import java.io.FileInputStream;
import java.io.InputStream;
import java.util.Properties;

import com.nt.comp.Courier;
import com.nt.comp.DTDC;
import com.nt.comp.Delhivery;
import com.nt.comp.FirstFlight;
import com.nt.comp.Flipkart;

public class FlipkartFactory {
	
	public static Flipkart getInstance(String courier)  {
		Flipkart fk = null;
		Courier c =null;
		//create dependent class obj 
		if(courier.equalsIgnoreCase("DTDC")){
			c =new DTDC();
		}
		else if(courier.equalsIgnoreCase("Delhivery")){
			c =new Delhivery();
		}
		else if(courier.equalsIgnoreCase("FirstFlight")){
			c =new FirstFlight();
		}
		else throw new IllegalArgumentException("give valid delivery options");
		
		//create target class obj
		fk = new Flipkart();
		//assigning courier to target class obj
		fk.setCourier(c);
		//return target class obj
		return fk;
		
	}

}
