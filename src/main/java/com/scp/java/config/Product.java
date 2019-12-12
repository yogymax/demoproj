package com.scp.java.config;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


/**
 * 
 * 
 * class A  -- POJO/BEAN
 * 	addCustomer()
 * 
 * 
 * class B impl A
 * 
 * POJO --plain old java object
 * BEAN --pojo
 * ENTITY -- any java class which we are going to persist..hibernate annotated class
 * POJI -- plain old java Interface
 * 
 * 								parent
 *         child		class  aclass	interface
 * 		class		e[1]		e[1]		im[m]
 * 	    aclass		e[1]		e[1]		im[m]
 * 		inteface	NA		NA		ex[m]
 * 
 * 
 * 		
 * @author Yogesh
 *
 */


@Entity
@Table(name = "PRODUCT_INFO")
public class Product {
	
	@Id
	@Column(name = "P_ID")
	private int prodId;
	
	@Column(name = "P_NAME")
	private String prodName;
	
	@Column(name = "P_LABEL",unique = true)
	private String prodLabel;
	
	@Column(name = "P_PRICE")
	private double prodPrice;
	
	@Column(name = "P_VEN")
	private String prodVendor;
	
	@Override
	public String toString() {
		return "\n [prodId=" + prodId + ", prodName=" + prodName + ", prodLabel=" + prodLabel + ", prodPrice="
				+ prodPrice + ", prodVendor=" + prodVendor + "]";
	}
	public Product(int prodId, String prodName, String prodLabel, double prodPrice, String prodVendor) {
		super();
		this.prodId = prodId;
		this.prodName = prodName;
		this.prodLabel = prodLabel;
		this.prodPrice = prodPrice;
		this.prodVendor = prodVendor;
	}
	public Product() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getProdId() {
		return prodId;
	}
	public void setProdId(int prodId) {
		this.prodId = prodId;
	}
	public String getProdName() {
		return prodName;
	}
	public void setProdName(String prodName) {
		this.prodName = prodName;
	}
	public String getProdLabel() {
		return prodLabel;
	}
	public void setProdLabel(String prodLabel) {
		this.prodLabel = prodLabel;
	}
	public double getProdPrice() {
		return prodPrice;
	}
	public void setProdPrice(double prodPrice) {
		this.prodPrice = prodPrice;
	}
	public String getProdVendor() {
		return prodVendor;
	}
	public void setProdVendor(String prodVendor) {
		this.prodVendor = prodVendor;
	}
	
	
	
	

}
