package lab.EmployeeCred.employeeSkelton;


public class EmployeeSkelton {
	
	private String firstName;
	private String lastName;
	private String department;
	private String emailAdress;
	private String password;
	
	
	public EmployeeSkelton(String userFirstName, String userLastName ) {
	
		firstName=userFirstName;
		lastName=userLastName;
	}
	
	
	
	
	
	public String getFirstName() {
		return firstName;
		
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
		
	}
	public String getLastName() {
		return lastName;
		
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
		
	}
	public String getDepartment() {
		return department;
		
	}
	public void setDepartment(String department) {
		this.department = department;
		
	}
	public String getEmailAdress() {
		return emailAdress;
	}
	public void setEmailAdress(String emailAdress) {
		this.emailAdress = emailAdress;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	
	
	
	
	

}
