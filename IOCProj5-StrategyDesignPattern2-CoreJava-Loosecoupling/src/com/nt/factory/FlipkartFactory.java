package com.nt.factory;

import java.io.FileInputStream;
import java.io.InputStream;
import java.util.Properties;

import com.nt.comp.Courier;
import com.nt.comp.Flipkart;

public class FlipkartFactory {
	private static Properties prop;
	static {
		InputStream fs = null;
		try {
		    fs = new FileInputStream("src/com/nt/commons/info.properties");
			prop = new Properties();
			prop.load(fs);
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}
	public static Flipkart getInstance() throws Exception {
		Flipkart fk = null;
		Courier c =null;
		//create dependent class obj by using properties 
		//c = (Courier) Class.forName(prop.getProperty("sdp.dependent")).newInstance();
		 c=(Courier) Class.forName(prop.getProperty("sdp.dependent")).newInstance();
		//create target class obj
		fk = new Flipkart();
		//assigning courier to target class obj
		fk.setCourier(c);
		//return target class obj
		return fk;
		
	}

}
