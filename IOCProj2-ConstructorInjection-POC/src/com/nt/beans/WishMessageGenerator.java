package com.nt.beans;

import java.util.Date;

public class WishMessageGenerator {
	private Date date;
	public WishMessageGenerator(Date date) {
		this.date=date;
	}
	public void wishMessage(String user) {
		int hour=date.getHours();
		if(hour>=6 && hour<12) {
			System.out.println("good morning "+user);
		}
		else if(hour>=12 && hour<16) {
			System.out.println("good afternoon "+user);
		}
		else if(hour>=16 && hour <20) {
			System.out.println("good evening "+user);
		}
		else
			System.out.println("good night "+user);
		}
	public void returnDate()
	{
		System.out.println(date.toString());
	}
	}


