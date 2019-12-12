package com.scp.java.oop;

import java.util.Arrays;
import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class StartApp {
	public static void main(String[] args) {
		Customer [] customers = generateDummyCustomerInfo(5);
		
		CustomerServices inmemory =  new DataServiceImpl(10);
		for (Customer cust : customers) {
			System.out.println(inmemory.addCustomer(cust));
		}
		System.out.println(Arrays.toString(inmemory.getAllCustomers()));
		System.out.println(inmemory.getTotalBankBalance());

		System.exit(0);
		
		/*
		 * String result = inmemory.addCustomer(c1); System.out.println(result);
		 * 
		 * String result1 = inmemory.addCustomer(c1); System.out.println(result);
		 */
		System.out.println("All Customers in a list " + Arrays.toString(inmemory.getAllCustomers()));
		
	}

	private static Customer[] generateDummyCustomerInfo(int noOfCustomer) {
		Customer customers[] = new Customer[noOfCustomer];
		
		for(int i=0;i<noOfCustomer;i++) {
			int custId = generateRandomNumber(111, 999);
			String name = generateRandomName();
			int custAge = generateRandomNumber(21, 80);
			Address address[]=generateAddress(generateRandomNumber(1,5));
			String types [] = {"Saving","Current"};
			int accType = generateRandomNumber(111,999);
			if (accType%3==0) {
				accType=0;
			}else {
				accType=1;
			}
			String accountType = types[accType];
			Account account = new Account(generateRandomNumber(112233,555555),accountType,ThreadLocalRandom.current().nextDouble(1000,10000));
			customers[i]=new Customer(custId,name,address,custAge,account);
		}
		
		
		
		/*
		Address ad1 = new Address(12725,"Pune1", "MH1", 687334);
		Address ad2 = new Address(12372,"Pune2", "MH2", 587334);
		Address ad3 = new Address(12742,"Pune3", "MH3",487334);
		Address addresses [] = {ad1,ad2,ad3};
		Account ac1 = new Account(12722,"Saving",82727.34);
		Customer c1 = new Customer(111,"AAAA",addresses,23,ac1);
		 */
		
		return customers;
	}

	private static Address[] generateAddress(int numAdr) {
		Address adres[] = new Address[numAdr];
		for(int i=0;i<numAdr;i++) {
			String city = generateRandomName();
			String state = generateRandomName();
			int pin = generateRandomNumber(11111,999999);
			int adrid = generateRandomNumber(1111,10000);
			Address adr  = new Address(adrid,city,state,pin);
			adres[i]=adr;
		}
		return adres;
	}

	private static int generateRandomNumber(int start,int end) {
		if(start!=0 && end!=0 && end>start) {
			return ThreadLocalRandom.current().nextInt(start,end);
		}
		return 0;
	}
	
	private static String generateRandomName() {
			int max = generateRandomNumber(5,15);//7
			String name="";
			for(int i=0;i<max;i++) {
				if(i==0) {
					Character ch = (char) generateRandomNumber(65,90);
					name+=ch.toString();
				}else {
				Character ch = (char) generateRandomNumber(97, 122);
				name+=ch.toString();
			}
			}
		return name;
	}
}
