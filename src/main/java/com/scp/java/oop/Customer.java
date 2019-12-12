package com.scp.java.oop;

import java.util.Arrays;

public class Customer {
	private int custId;
	private String custName;
	private Address address[];
	private int custAge;
	private Account account;
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
	public Address[] getAddress() {
		return address;
	}
	public void setAddress(Address[] address) {
		this.address = address;
	}
	public int getCustAge() {
		return custAge;
	}
	public void setCustAge(int custAge) {
		this.custAge = custAge;
	}
	public Account getAccount() {
		return account;
	}
	public void setAccount(Account account) {
		this.account = account;
	}
	@Override
	public String toString() {
		return "\n [custId=" + custId + ", custName=" + custName + ", address=" + Arrays.toString(address)
				+ ", custAge=" + custAge + ", account=" + account + "]";
	}
	public Customer(int custId, String custName, Address[] address, int custAge, Account account) {
		super();
		this.custId = custId;
		this.custName = custName;
		this.address = address;
		this.custAge = custAge;
		this.account = account;
	}
	public Customer() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
}

class Account{
	private int accNo;
	private String accType;
	private double accBalance;
	public Account() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Account(int accNo, String accType, double accBalance) {
		super();
		this.accNo = accNo;
		this.accType = accType;
		this.accBalance = accBalance;
	}
	@Override
	public String toString() {
		return "\n\t [accNo=" + accNo + ", accType=" + accType + ", accBalance=" + accBalance + "]";
	}
	public int getAccNo() {
		return accNo;
	}
	public void setAccNo(int accNo) {
		this.accNo = accNo;
	}
	public String getAccType() {
		return accType;
	}
	public void setAccType(String accType) {
		this.accType = accType;
	}
	public double getAccBalance() {
		return accBalance;
	}
	public void setAccBalance(double accBalance) {
		this.accBalance = accBalance;
	}
	
	
	
}

class Address{
	private int addressId;
	private String city;
	private String state;
	private int pincode;
	public Address(int addressId, String city, String state, int pincode) {
		super();
		this.addressId = addressId;
		this.city = city;
		this.state = state;
		this.pincode = pincode;
	}
	public Address() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "\n\t [addressId=" + addressId + ", city=" + city + ", state=" + state + ", pincode=" + pincode + "]";
	}
	public int getAddressId() {
		return addressId;
	}
	public void setAddressId(int addressId) {
		this.addressId = addressId;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public int getPincode() {
		return pincode;
	}
	public void setPincode(int pincode) {
		this.pincode = pincode;
	}
	
	
}
