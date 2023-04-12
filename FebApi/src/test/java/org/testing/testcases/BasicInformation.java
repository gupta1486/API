package org.testing.testcases;

public class BasicInformation {

//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//
//	}
	
	private String surname;
	private String name;
	private String batch;
	private String id;
	private AddressInformation Address;
	
	;
	//To generate  getter and setter rightclick on class file -> Source> generate getter and setter
	
	public AddressInformation getAddress() {
		return Address;
	}
	public void setAddress(AddressInformation address) {
		Address = address;
	}
	public String getSurname() {
		return surname;
	}
	public void setSurname(String surname) {
		this.surname = surname;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getBatch() {
		return batch;
	}
	public void setBatch(String batch) {
		this.batch = batch;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	
	

}
