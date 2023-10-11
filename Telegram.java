package com.xworkz.nidhi.things;

import java.util.Date;

public class Telegram {
	public String username;
	public String password;
	public String email;
	public long contactNumber;
	public String address;
	public Date accCreatedDate;
	public String gender;
	
	public Telegram() {
		this(new Date(), "Female");
		System.out.println();
	}
	
	public Telegram(String username) {
	
		this.username = username;
		System.out.println("Username           :  "+ this.username);
	}
	
	public Telegram(String password,String email ) {
		this("hemakr");
		this.password = password;
		this.email = email;
		System.out.println("Password           :  " + this.password);
		System.out.println("Email              :  " + this.email);
	}
	
	public Telegram(long contactNumber , String address) {
		this("Hema@22" , "hema22@gmail.com");
		this.contactNumber = contactNumber;
		this.address = address;
		System.out.println("Contact Number     :  "+ this.contactNumber);
		System.out.println("Address            :  " + this.address);
	}
	
	public Telegram(Date accCreatedDate , String gender) {
		this(7019189179l , "Banglore");
		this.accCreatedDate = accCreatedDate;
		this.gender = gender;
		System.out.println("Account created on :  " + accCreatedDate);
		System.out.println("Gender             :  " + gender);
	}

}
