package com.credential.services;

import java.util.Random;

import com.credentials.interfaces.ICredentials;
import com.credentials.model.Employee;

public class CredentialService implements ICredentials{

	@Override
	public String generateEmailAddress(Employee employee, String department) {
		return employee.getFirstName()+employee.getLastName()+"@"+department+".abc.com";
	}

	@Override
	public String generatePassword() {
		String capitalLetters = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		String smallLetters = "abcdefghijklmnopqrstuvwxyz";
		String numbers = "0123456789";
		String specialCharacters = "!@#$%^&*_=+-/.?<>";
		String values = capitalLetters+smallLetters+numbers+specialCharacters;
		
		Random random = new Random();
		String password = "";
		
		String capitalChar = String.valueOf(capitalLetters.charAt(random.nextInt(capitalLetters.length())));
		String smallchar = String.valueOf(smallLetters.charAt(random.nextInt(smallLetters.length())));
		String numberchar = String.valueOf(numbers.charAt(random.nextInt(numbers.length())));
		String specialchar = String.valueOf(specialCharacters.charAt(random.nextInt(specialCharacters.length())));
		
		for(int i=0; i < 4; i++)
		{
			password += String.valueOf(values.charAt(random.nextInt(values.length())));
		}
		
		return password+capitalChar+smallchar+numberchar+specialchar;
	}

	@Override
	public void showCredentials(Employee employee) {
		System.out.println(" ");
		System.out.println("Dear"+" "+employee.getFirstName()+" your generated credentials are as follows");
		System.out.println("Email --> " + employee.getEmail());
		System.out.println("Password --> " + employee.getPassword());
	}
	

}
