package com.gl.labsession;

public class Department {
	
	public Department(){
				
	}
		
	public String getDepartment(int option) {
		String dept = "";
		switch (option) {
		case 1: System.out.println("");
				dept = "tech";
			break;
		case 2: System.out.println("");
				dept = "admin";
			break;
		case 3: System.out.println("");
				dept = "hr";
			break;
		case 4:System.out.println("");
				dept = "lg";
			break;

		default:
			break;

		}
		return dept;
	}
}