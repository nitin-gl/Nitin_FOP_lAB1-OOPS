package com.gl.labsession;

public class Employee {
	String firstName;
	String lastName;
	
	public Employee(String a, String b) {
		firstName = a;
		lastName = b;
	}

	public String getEmployeeName() {
		// TODO Auto-generated constructor stub
		
		return firstName+lastName;
	}
}