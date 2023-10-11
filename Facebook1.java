package com.xworkz.nidhi.things;

import java.util.Date;

public class Facebook1 {
	public String username;
	public String password;
	public String email;
	public long contactNumber;
	public String address;
	public Date accCreatedDate;
	public String gender;
	
	public Facebook1() {
		this(new Date(), "Female");
		System.out.println();
	}
	
	public Facebook1(String username) {
		this.username = username;
		System.out.println("Username           :  "+ this.username);
	}
	
	public Facebook1(String password,String email ) {
		this("nidhishekarappa");
		this.password = password;
		this.email = email;
		System.out.println("Password           :  " + this.password);
		System.out.println("Email              :  " + this.email);
	}
	
	public Facebook1(long contactNumber , String address) {
		this("Nidhi@12" , "nidhipaari2001@gmail.com");
		this.contactNumber = contactNumber;
		this.address = address;
		System.out.println("Contact Number     :  "+ this.contactNumber);
		System.out.println("Address            :  " + this.address);
	}
	
	public Facebook1(Date accCreatedDate , String gender) {
		this(7483289610l , "Hassan");
		this.accCreatedDate = accCreatedDate;
		this.gender = gender;
		System.out.println("Account created on :  " + accCreatedDate);
		System.out.println("Gender             : " + gender);
	}
	
}
