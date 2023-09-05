package lab.EmployeeCred.methordsInterfaces;

import lab.EmployeeCred.employeeSkelton.EmployeeSkelton;

public interface employeeCredMethords {
	
	// methord to generate email adress of employee
	// 1---> Takes first name, last name , and department as inputs of employee object
	// to create a unique email adress and returns the same 
	public String generateEmailAdress(String firstName, String lastName, String department);
	
	// methord to create password for the employee 
	// dosent need any inputs just creates a unique password and returns the same
	public String generatePassword();
	
	
	// methord to display generated email adress and pasword
	// takes the employee type object as input to show unique credentials 
	// to show the generated credentilas for that employee
	public void showCredentials(EmployeeSkelton employeeObject);
	
	
	
	

}
