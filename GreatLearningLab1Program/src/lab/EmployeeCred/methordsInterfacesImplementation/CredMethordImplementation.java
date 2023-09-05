package lab.EmployeeCred.methordsInterfacesImplementation;

import java.util.Random;

import lab.EmployeeCred.employeeSkelton.EmployeeSkelton;
import lab.EmployeeCred.methordsInterfaces.employeeCredMethords;

public class CredMethordImplementation implements employeeCredMethords {
	
	

	public String generateEmailAdress(String firstName, String lastName, String department) {
		
		firstName= firstName.toLowerCase();
		lastName=lastName.toLowerCase();
		
		return firstName+lastName+"@"+department+".bijengg.in";
	}
	
	
	public String generatePassword() {
		
		char lowerCaseAlphabets[]= {'a','b','c','d','e','f','g','h','i','j'};
		char upperCaseAplhabets[]= {'A','B','C','D','E','F','G','H','I','J'};
		char numbers[]= {'1','2','3','4','5','6','7','8','9','0'};
		char specialCharecters[]= {'!','@','#','$','%','^','&','*','(',')'};
		String password="";
		
		Random randObject= new Random();
		int randValue1;
		int randValue2;
		
		for(int passwordLength=0; passwordLength<=7; passwordLength++) {
			
		randValue1= randObject.nextInt(4);		// generates random values between 0 to 3
		randValue2= randObject.nextInt(10);		// generated random values between 0 to 9
		
		
		switch(randValue1) {
		
		case 0:{
			
			password=password+lowerCaseAlphabets[randValue2];
			break;
		}
		
		case 1:{
			password=password+upperCaseAplhabets[randValue2];
			break;
		}
		
		case 2:{
			password=password+numbers[randValue2];
			break;
			}
		
		case 3:{
			password=password+specialCharecters[randValue2];
			break;
		}
		
		
		}
			
		}
		
		return password;
	}

	public void showCredentials(EmployeeSkelton employeeObject) {
		
		System.out.println("Dear" + employeeObject.getFirstName()+employeeObject.getLastName());
		System.out.println("Your System Generated Credentials are as mentioned below");
		
		System.out.println(employeeObject.getEmailAdress());
		System.out.println(employeeObject.getPassword());
		
		
		
		
	}
	
	
	
	
	
	

}
