package com.scp.java.config;

import java.util.HashMap;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class MainApp {
	
	public static void main(String[] args) {
		
		Product p1 = new Product(1112,"ABC7D","XX61",23834.34,"FLipkart");
		System.out.println(p1.hashCode());
		System.exit(0);
		SessionFactory sfactoryM = new Configuration().configure("mysql-hibernate.cfg.xml").buildSessionFactory();
		System.out.println("-----------------------------------------------------------------------\n");
		SessionFactory sfactoryH = new Configuration().configure("hsql-hibernate.cfg.xml").buildSessionFactory();
		
		
		
//		Product p1 = new Product(1112,"ABC7D","XX61",23834.34,"FLipkart");
		Product p2 = new Product(11142,"A4BCD","5XX1",62834.34,"FLipkart");
		Product p3 = new Product(1134,"ABCD","XX41",28734.34,"FLipkart");
		Product p4 = new Product(11512,"AB5CD","X2X1",28384.34,"FLipkart");
		Product p5 = new Product(16112,"AB6CD","X1X1",29834.34,"FLipkart");
		
		
		/*
		System.out.println("HSql Insertation....!");
		Session sessionH = sfactoryH.openSession();
		Transaction trH = sessionH.beginTransaction();
		sessionH.save(p1);sessionH.save(p2);sessionH.save(p3);
		sessionH.save(p4);sessionH.save(p5);
		sessionH.flush();
		trH.commit();
		
		
		System.out.println("MSQL Insertation....!");
		Session sessionM = sfactoryM.openSession();
		Transaction trM = sessionM.beginTransaction();
		sessionM.save(p1);sessionM.save(p2);sessionM.save(p3);
		sessionM.save(p4);sessionM.save(p5);
		sessionM.flush();
		trM.commit();
		
		*/
		
		
		System.out.println("CRUD Operations");
	
		System.out.println("Single Fetch");
		Session s1 = sfactoryM.openSession();
		Product product11512 = s1.get(Product.class,11512);
		System.out.println("Single Fetch" +product11512);
		
		System.out.println("--------------------------------------------");
		
		System.out.println("Update");
		Product latest = new Product(11142,"XXXXX","TTTTT",2834.34,"FLipkart");
		s1.clear();
		Transaction tr1 = s1.beginTransaction();
		s1.update(latest);
		s1.flush();
		tr1.commit();
		
		System.out.println("--------------------------------------------");
		System.out.println("ALL Fetch");
		List<Product> products = s1.createCriteria(Product.class).list();
		System.out.println(products);
		
		System.out.println("Delete");
		s1 = sfactoryM.openSession();
		tr1 = s1.beginTransaction();
		s1.delete(p1);
		s1.flush();
		tr1.commit();
		
		System.out.println("--------------------------------------------");
		System.out.println("ALL Fetch");
		products = s1.createCriteria(Product.class).list();
		System.out.println(products);
		
	}
}
