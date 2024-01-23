package PojoClassForParsing;

public class EmployeeDetails {


	//1.)declare the variables globally	
	String eName;
	String eId;
	String address;
	int phoneNo;
	String email;
	Object SpouceDetails;
	
	//2.)create constructor for initialisaton
	public EmployeeDetails(String eName, String eId, String address, int phoneNo, String email) {
		super();
		this.eName = eName;
		this.eId = eId;
		this.address = address;
		this.phoneNo = phoneNo;
		this.email = email;
	}
	
	public EmployeeDetails() {
		
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

	public int getPhoneNo() {
		return phoneNo;
	}

	public void setPhoneNo(int phoneNo) {
		this.phoneNo = phoneNo;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}



}
