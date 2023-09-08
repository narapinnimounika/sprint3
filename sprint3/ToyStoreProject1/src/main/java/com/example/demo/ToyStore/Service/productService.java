package com.example.demo.ToyStore.Service;

import com.example.demo.ToyStore.entity.product;

public interface productService { 
	
	//product login(String email ,String password);

	product addproduct(product productdetails);

	product  updateproduct(String productname, product productdetails);

	
	void Delete(String productname);


}
