package org.edu.model;

public class Acccount {

	private String acctNo;
	private String name;
	private String address;
	
	public Acccount() {
		// TODO Auto-generated constructor stub
	}

	public Acccount(String acctNo, String name, String address) {
		super();
		this.acctNo = acctNo;
		this.name = name;
		this.address = address;
	}

	public String getAcctNo() {
		return acctNo;
	}

	public void setAcctNo(String acctNo) {
		this.acctNo = acctNo;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}
	
	
}
