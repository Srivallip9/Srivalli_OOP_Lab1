package com.credentials.interfaces;

import com.credentials.model.Employee;

public interface ICredentials {
	
	public String generateEmailAddress(Employee employee, String department);
	public String generatePassword();
	public void showCredentials(Employee employee);

}
