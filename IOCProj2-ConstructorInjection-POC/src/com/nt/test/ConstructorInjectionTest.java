package com.nt.test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.FileSystemResource;
import org.springframework.core.io.Resource;

import com.nt.beans.WishMessageGenerator;

public class ConstructorInjectionTest {

	public static void main(String[] args) {
		Resource res=null;
	    BeanFactory fact = null;
	    WishMessageGenerator generator = null;
		//locate the application context
		res = new ClassPathResource("com/nt/cfg/applicationContext.xml");
		//create bean factory
		fact = new XmlBeanFactory(res);
		//get target bean class object
		generator = fact.getBean("wmg",WishMessageGenerator.class);
		//invoke b.logic
		generator.wishMessage("sanjeev");
		generator.returnDate();
		
		


	}

	

}
