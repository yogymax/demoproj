package com.scp.java.hbm.start;

public class Customer {
	private int custId;
	private String custName;
	private int custAge;
	private String custAddress;
	private double custBalance;

	
	public Customer(int custId, String custName, int custAge, String custAddress, double custBalance) {
		super();
		this.custId = custId;
		this.custName = custName;
		this.custAge = custAge;
		this.custAddress = custAddress;
		this.custBalance = custBalance;
	}
	public Customer() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getCustId() {
		return custId;
	}
	public void setCustId(int custId) {
		this.custId = custId;
	}
	public String getCustName() {
		return custName;
	}
	public void setCustName(String custName) {
		this.custName = custName;
	}
	public int getCustAge() {
		return custAge;
	}
	public void setCustAge(int custAge) {
		this.custAge = custAge;
	}
	public String getCustAddress() {
		return custAddress;
	}
	public void setCustAddress(String custAddress) {
		this.custAddress = custAddress;
	}
	public double getCustBalance() {
		return custBalance;
	}
	public void setCustBalance(double custBalance) {
		this.custBalance = custBalance;
	}
	
	
	
	
}
