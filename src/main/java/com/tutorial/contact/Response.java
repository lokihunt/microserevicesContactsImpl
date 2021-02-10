package com.tutorial.contact;

import java.util.List;

public class Response {

	
	List<Contact> data;
	Status status;
	String details;
	public List<Contact> getData() {
		return data;
	}
	public void setData(List<Contact> data) {
		this.data = data;
	}
	public Status getStatus() {
		return status;
	}
	public void setStatus(Status status) {
		this.status = status;
	}
	public String getDetails() {
		return details;
	}
	public void setDetails(String details) {
		this.details = details;
	}
	public Response(List<Contact> data, Status status, String details) {
		super();
		this.data = data;
		this.status = status;
		this.details = details;
	}
	
}
