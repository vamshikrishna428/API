package PojoClassForParsing;

public class SpouceDetails {
	String eName;
	String eId;
	String address;
	int salary;
	int phoneNo;
	String email;
	
	public SpouceDetails(String eName, String eId, String address, int salary, int phoneNo, String email) {
		this.eName = eName;
		this.eId = eId;
		this.address = address;
		this.salary = salary;
		this.phoneNo = phoneNo;
		this.email = email;
	}
	public void details() {
		
	}
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
	public static void main(String[] args) {
		
	
	SpouceDetails sd=new SpouceDetails("lkg", "tyss-lkg", "sbi-colony", 123456, 949445735, "tyss-lkg@gmail.com");
	System.out.println(sd);
	}

}
