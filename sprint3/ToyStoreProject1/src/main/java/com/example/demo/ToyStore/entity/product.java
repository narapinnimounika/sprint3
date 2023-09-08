package com.example.demo.ToyStore.entity;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
@Entity
public class product {
	@Id
	private String productName;
	
	private String producturl;
	
	private String productdescription;
	
	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public String getProducturl() {
		return producturl;
	}

	public void setProducturl(String producturl) {
		this.producturl = producturl;
	}

	public String getProductdescription() {
		return productdescription;
	}

	public void setProductdescription(String productdescription) {
		this.productdescription = productdescription;
	}

	public Object producturl() {
		// TODO Auto-generated method stub
		return null;
	}
	
	
	
}



