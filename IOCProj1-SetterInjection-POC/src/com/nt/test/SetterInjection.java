package com.nt.test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.FileSystemResource;
import org.springframework.core.io.Resource;

import com.nt.beans.WishMessageGenerator;

public class SetterInjection {

	public static void main(String[] args) {
		Resource res = null;
		BeanFactory bef = null;
		WishMessageGenerator wmgobj = null;
	    res = new FileSystemResource("src/com/nt/cfgs/applicationContext.xml");
		bef= new XmlBeanFactory(res);
		Object obj = bef.getBean("wmg");
		wmgobj =(WishMessageGenerator)obj;
		wmgobj.wishMessage("sanjeev");
	}

}
