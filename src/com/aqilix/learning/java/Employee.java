package com.aqilix.learning.java;

public class Employee extends Person {
	private static final long serialVersionUID = 412485023940458203L;
	
	private String id;
	
	public Employee() {
	}
	
	public Employee(String id, String name) {
		this.setId(id);
		this.setName(name);
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	@Override
	public void displayInfo() {
		super.displayInfo();
		System.out.println("Id: " + this.getId());
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void jump() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public String toString() {
		return this.getId() + ": " + this.getName();
	}
	
	
}
