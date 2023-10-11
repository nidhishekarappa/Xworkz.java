package com.xworkz.nidhi.things;
import java.util.Date;
public class Instagram {
		public String username;
		public String password;
		public String email;
		public long contactNumber;
		public String address;
		public Date accCreatedDate;
		public String gender;
		
		public Instagram() {
			this(new Date(), "Male");
			System.out.println();
		}
		
		public Instagram(String username) {
		
			this.username = username;
			System.out.println("Username           :  "+ this.username);
		}
		
		public Instagram(String password,String email ) {
			this("Charan");
			this.password = password;
			this.email = email;
			System.out.println("Password           :  " + this.password);
			System.out.println("Email              :  " + this.email);
		}
		
		public Instagram(long contactNumber , String address) {
			this("Charankg@12" , "charankg@gmail.com");
			this.contactNumber = contactNumber;
			this.address = address;
			System.out.println("Contact Number     :  "+ this.contactNumber);
			System.out.println("Address            :  " + this.address);
		}
		
		public Instagram(Date accCreatedDate , String gender) {
			this(8197465834l , "Belagaum");
			this.accCreatedDate = accCreatedDate;
			this.gender = gender;
			System.out.println("Account created on :  " + accCreatedDate);
			System.out.println("Gender             :  " + gender);
		}

	}
