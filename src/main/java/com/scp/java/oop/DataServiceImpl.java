package com.scp.java.oop;

import java.util.Arrays;

public class DataServiceImpl implements CustomerServices{

	private static Customer customerDatabase[] = null;
	int index=0;
	public DataServiceImpl(int num) {
		if(num<=0) {
			System.out.println("Invalid number...shud be atleast...1 or more..!");
			return;
		}
		
		customerDatabase = new Customer[num];
	}
	
	public String addCustomer(Customer customer) {
		String returnval = "";
		if(customer==null)
			returnval="Invalid customer";
		else if(index<customerDatabase.length) {
			customerDatabase[index++]=customer;
			returnval= "Customer Added Successfully";
		}else {
			returnval= "Capacity Exceed";
		}
		return returnval;
	}

	public String deleteCustomer(int custId) {
		return null;
	}

	public Customer updateCustomer(Customer customer) {
		return null;
	}

	public Customer getCustomer(int custId) {
		return null;
	}

	public Customer[] getAllCustomers() {
		//return customerDatabase;
		return Arrays.copyOf(customerDatabase,index);
	}

	public Customer[] getAllCustomerOfSpecificAddress(String city) {
		return null;
	}

	public double getTotalBankBalance() {
		double totalbalance = 0.0;
		for (Customer cust : customerDatabase) {
			if(cust!=null) {
				totalbalance+=cust.getAccount().getAccBalance();
			}
		}
		return totalbalance;
	}

}
