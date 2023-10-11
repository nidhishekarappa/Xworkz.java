package com.xworkz.nidhi.things;

import java.util.Date;

public class Indeed {
	public String username;
	public String password;
	public String email;
	public long contactNumber;
	public String address;
	public Date accCreatedDate;
	public String gender;

	public Indeed() {
		this(new Date(), "Female");
		System.out.println();
	}

	public Indeed(String username) {

		this.username = username;
		System.out.println("Username           :  " + this.username);
	}

	public Indeed(String password, String email) {
		this("nikhithapuppanna");
		this.password = password;
		this.email = email;
		System.out.println("Password           :  " + this.password);
		System.out.println("Email              :  " + this.email);
	}

	public Indeed(long contactNumber, String address) {
		this("Neethu@25", "neethu25@gmail.com");
		this.contactNumber = contactNumber;
		this.address = address;
		System.out.println("Contact Number     :  " + this.contactNumber);
		System.out.println("Address            :  " + this.address);
	}

	public Indeed(Date accCreatedDate, String gender) {
		this(6361844211l, "Chikkamagaluru");
		this.accCreatedDate = accCreatedDate;
		this.gender = gender;
		System.out.println("Account created on :  " + accCreatedDate);
		System.out.println("Gender             :  " + gender);
	}

}
