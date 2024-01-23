package PojoClassForParsing;

public class EmployeeDetails2 {
	//1.)declare the variables globally	
	String eName;
	String eId;
	String address;
	int salary;
	int[] phoneNo;
	String email;
	
	//2.)create constructor for initialisaton
	public EmployeeDetails2(String eName, String eId, String address, int salary, int[] phoneNo, String email) {

		this.eName = eName;
		this.eId = eId;
		this.address = address;
		this.salary = salary;
		this.phoneNo = phoneNo;
		this.email = email;
	}
	
	public EmployeeDetails2() {
		
	}
	
	//3.)create a getters and setters
	public String geteName() {
		return eName;
	}

	public void seteName(String eName) {
		this.eName = eName;
	}

	public String geteId() {
		return eId;
	}

	public void seteId(String eId) {
		this.eId = eId;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	public int[] getPhoneNo() {
		return phoneNo;
	}

	public void setPhoneNo(int[] phoneNo) {
		this.phoneNo = phoneNo;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
	
	
	
	
	
	
}
