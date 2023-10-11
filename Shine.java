package com.xworkz.nidhi.things;

import java.util.Date;

public class Shine {
	public String username;
	public String password;
	public String email;
	public long contactNumber;
	public String address;
	public Date accCreatedDate;
	public String gender;

	public Shine() {
		this(new Date(), "Male");
		System.out.println();
	}

	public Shine(String username) {

		this.username = username;
		System.out.println("Username           :  " + this.username);
	}

	public Shine(String password, String email) {
		this("himanth");
		this.password = password;
		this.email = email;
		System.out.println("Password           :  " + this.password);
		System.out.println("Email              :  " + this.email);
	}

	public Shine(long contactNumber, String address) {
		this("himanth@07", "himanthkr@gmail.com");
		this.contactNumber = contactNumber;
		this.address = address;
		System.out.println("Contact Number     :  " + this.contactNumber);
		System.out.println("Address            :  " + this.address);
	}

	public Shine(Date accCreatedDate, String gender) {
		this(9108007700l, "Mysore");
		this.accCreatedDate = accCreatedDate;
		this.gender = gender;
		System.out.println("Account created on :  " + accCreatedDate);
		System.out.println("Gender             :  " + gender);
	}
}
