package com.scp.java.hbm.start;

import java.util.List;

public interface CustomerService{
	public String addCustomer(Customer cust);
	public Customer getCustomer(int custId);
	public List<Customer> getAllCustomer();
	public String deleteCustomer(int custId);
	public Customer updateCustomer(Customer cust);
}