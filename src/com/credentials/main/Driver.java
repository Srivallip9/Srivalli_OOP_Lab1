package com.credentials.main;

import java.util.Scanner;
import com.credentials.model.Employee;
import com.credential.services.CredentialService;

public class Driver {

	public static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		
		Employee employee = new Employee("srivalli","pathi");
		
		displayMenu();

		int option = sc.nextInt();
		
		CredentialService credentialService = new CredentialService();
		
		String[] departments = {"tech","admin","hr","legal"}; 
		
		String emailAddress = credentialService.generateEmailAddress(employee, departments[option-1]);
	
		String password = credentialService.generatePassword();
		
		employee.setEmail(emailAddress);
		employee.setPassword(password);
		
		credentialService.showCredentials(employee);
	}

	private static void displayMenu() {
		System.out.println("Please enter the department from the following");
		System.out.println("1. Technical");
		System.out.println("2. Admin");
		System.out.println("3. Human Resource");
		System.out.println("4. Legal");
		
	}

}
