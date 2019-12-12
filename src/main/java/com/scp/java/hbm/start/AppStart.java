package com.scp.java.hbm.start;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class AppStart {

	/**
	 * 	
	
	mappings
		---cfg.xml -- mappings+configurations
		
				Configuration chya object
		
						sessionfactory -- channel --
								session			-- ack/communication channel
									tr
										session.save(cust1)
										
									tr.commit()
								
		
		configuration			sessionfactory		session
		trascantion				criteria			query
		
no need to have sql knowledge IN DEPTH..		
		cfg--mapping..
		configuration* --- class
				sessionfactory --
					session --- java objects -- class --mapping--
						tr
						criteria
						query
						
	 * 
	 * 
	 * @param args
	 */
	
		public static void main(String[] args) {
			
		/*
		 * Configuration conf = new Configuration(); conf.configure();//search
		 * hibernate.cfg.xml -- inside classpath--src/main/java SessionFactory sfactry =
		 * conf.buildSessionFactory();
		 */
		
			
			Customer customer1 = new Customer(1151,"tAAAA",53,"Pune",68833.4);
			Customer customer2 = new Customer(1141,"ArAAA",33,"Pune",8833.4);
			Customer customer3 = new Customer(1311,"xAAxAA",23,"Pune",68833.4);
			Customer customer4 = new Customer(1121,"AAAA",26,"Pune",28433.4);
			Customer customer5 = new Customer(1116,"yA3xAAA",53,"Pune",80833.4);
			
			SessionFactory sfacotry = new Configuration().configure().buildSessionFactory();
			System.out.println(sfacotry.hashCode());

			Session session = sfacotry.openSession();
			Transaction tr = session.beginTransaction();
			session.save(customer1);
			session.save(customer2);
			session.save(customer3);
			session.save(customer4);
			session.save(customer5);
			session.flush();
			tr.commit();
			
			
			
		}
}


/**
	
	2 files -- atleast-- one database 
	
			cfg.xml -- database configuration-- 5 mandatory
				n-mapping -- which class-- which table
								which fields --which columns --type---java--dialect--databasetypes
							
			
			
create table cust_info 
(cust_id integer not null, 
cust_name varchar(255), 
cust_age integer, 
cust_adr varchar(255), 
cust_bal double precision, 
primary key (cust_id))



create		--- drop --- create 
create-drop  --drop  -- create

update     --if tables -- use kara -- if not-- create 

validate
--

<?xml version = "1.0" encoding = "utf-8"?>
<!DOCTYPE hibernate-mapping PUBLIC 
"-//Hibernate/Hibernate Mapping DTD//EN"
"http://www.hibernate.org/dtd/hibernate-mapping-3.0.dtd"> 

<hibernate-mapping>
   <class name = "Employee" table = "EMPLOYEE">
      
      <meta attribute = "class-description">
         This class contains the employee detail. 
      </meta>
      
      <id name = "id" type = "int" column = "id">
         <generator class="native"/>
      </id>
      
      <property name = "firstName" column = "first_name" type = "string"/>
      <property name = "lastName" column = "last_name" type = "string"/>
      <property name = "salary" column = "salary" type = "int"/>
      
   </class>
</hibernate-mapping>



cfg..configuration --- database configuration	
	
	<hibernate-configuration>
			<sessionfactory>
				
				<property name="hibrenate.url">mysqlurl</property>
				<property name="hibrenate.driveclass">drivercalss</property>
				<property name="hibrenate.username"></property>
				<property name="hibrenate.password"></property>
				<property name="hibrenate.dialect">diact</property>
				
			<sessionfactory>
	</hibernate-configuration>
	
	
	
	
<hibernate-mapping>
   <class name = "com.scp.java.hbm.start.Customer" table = "cust_info">
      <id name = "custId" type = "int" column = "cust_id"></id>
      <property name = "custName" column = "cust_name" type = "string"/>
      <property name = "custAge" column = "cust_age" type = "int"/>
      <property name = "custAddress" column = "cust_adr" type = "string"/>
      <property name = "custBalance" column = "cust_bal" type = "double"/>
   </class>
   

</hibernate-mapping>
	
	
		
	
	JDBC --
	
			sql knowledge is must-- query...
			who creates the table-- developer
			mapping -- developer
			object--- realtional -- developer
			in case -- app -- mysql -- database change-- rewrite
			
			
			jdbc doesnt oop--
					performance -- caching--- jdbc doesnt support..
					
					
		
		orm fra
			
			



*/