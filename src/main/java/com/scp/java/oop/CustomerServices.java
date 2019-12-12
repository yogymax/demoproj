package com.scp.java.oop;

public interface CustomerServices {
	public String addCustomer(Customer customer);
	public String deleteCustomer(int custId);
	public Customer updateCustomer(Customer customer);
	public Customer getCustomer(int custId);
	public Customer[] getAllCustomers();
	public Customer[] getAllCustomerOfSpecificAddress(String city);
	public double getTotalBankBalance();
}
