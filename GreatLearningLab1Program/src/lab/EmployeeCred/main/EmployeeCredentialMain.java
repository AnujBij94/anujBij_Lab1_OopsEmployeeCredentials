package lab.EmployeeCred.main;

import java.util.Scanner;

import lab.EmployeeCred.employeeSkelton.EmployeeSkelton;
import lab.EmployeeCred.methordsInterfacesImplementation.CredMethordImplementation;

public class EmployeeCredentialMain {
	
	public static int ValidInput=0;
	public static void main(String[] args) {
		
		String email;
		String pass;
		
		
		// input the user name with help of employee object creation and then using parameterised constructor
		EmployeeSkelton employee1 = new EmployeeSkelton("Anuj","Bij");
		
		// ask user to input his her department from the displayed list
		System.out.println(employee1.getFirstName()+employee1.getLastName());
		displayListOfDepatments();
		
		
		// take input from the employee by using scanner type object
		Scanner userInput= new Scanner(System.in);
		int userSelectedDepartmentIndex=userInput.nextInt();
		
		
		// according to the user selected department index kindly pass the department to the user database
		departmentIndexToDepartmentName(userSelectedDepartmentIndex, employee1);
		userInput.close();
		if(ValidInput==1) {
		
		// generate email id for the user according to above received information
		CredMethordImplementation credObject = new CredMethordImplementation();
		email=credObject.generateEmailAdress(employee1.getFirstName(), employee1.getLastName(), employee1.getDepartment());
		
		// generate password for the user according to above received information
		pass=credObject.generatePassword();
		
		// set the above generated credentials to the user
		employee1.setEmailAdress(email);
		employee1.setPassword(pass);
		
	
		// show the generated credentilas of the user
		credObject.showCredentials(employee1);
		}
		else
		{
			
		}
		
	}
	
	public static void departmentIndexToDepartmentName(int index, EmployeeSkelton emp) {
		
		switch(index) {
		
		case 1:{
			emp.setDepartment("tech");
			ValidInput=1;
			break;
		}
		
		case 2:{
			emp.setDepartment("admin");
			ValidInput=1;
			break;
		}
		
		case 3:{
			emp.setDepartment("hr");
			ValidInput=1;
			break;
		}
		
		case 4:{
			emp.setDepartment("legal");
			ValidInput=1;
			break;
		}
		
		default :{
			System.out.println("Kindly select a valid input");
			ValidInput=0;
		}
		}
		
		
	}
	
	
	
	public static void displayListOfDepatments() {
		
		System.out.println("Please input any one S.NO matching to your department");
		System.out.println();
		System.out.println("S.No"+ "    "+"Department Name");
		System.out.println("1-->"+ "    "+"Technichal");
		System.out.println("2-->"+ "    "+"Admin");
		System.out.println("3-->"+ "    "+"Human Resource");
		System.out.println("4-->"+ "    "+"Legal");
	
	}
	
	
	
	
	
	

}
