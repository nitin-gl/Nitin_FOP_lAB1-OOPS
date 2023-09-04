package com.gl.labsession;

import java.util.Scanner;

public class CredentialService {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		System.out.println("Please enter the First Name of Employee: ");
		String firstName =in.next();
		System.out.println("Please enter Last Name of Employee: ");
		String lastName =in.next();
		Employee emp = new Employee(firstName,lastName);
		String empName = emp.getEmployeeName().toLowerCase();
						
		System.out.println("List of department is as follows:");
		System.out.println("1. Technical");
		System.out.println("2. Admin");
		System.out.println("3. Human Resource");
		System.out.println("4. Legal");
		System.out.println("Please select the department:");
		int option = in.nextInt();
		in.close();
		
		Department obj = new Department();
		String dept = obj.getDepartment(option);
		
		System.out.println("Dear "+emp.firstName+" your generate credentials are as follows:");
		System.out.println("Email : "+empName+"@"+dept+".abc.com");
		System.out.println("Password: "+RandomPasswordGeneration.generatePassword(8));
	}

}
