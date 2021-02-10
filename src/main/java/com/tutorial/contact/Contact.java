package com.tutorial.contact;

import com.fasterxml.jackson.annotation.JsonIgnore;

public class Contact {

	
	String firstName;
	String lastName;
	long phoneNumber;
	String email;

	
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public long getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(long phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public Contact(String firstName, String lastName, long phoneNumber, String email) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.phoneNumber = phoneNumber;
		this.email = email;
	}
	
	@JsonIgnore
	public Boolean isValid() {
		return (firstName != null && !firstName.isEmpty()) && (phoneNumber != 0); 
	}
}
