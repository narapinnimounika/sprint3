package com.example.demo.ToyStore.ServiceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.ToyStore.Exception.loginexception;
import com.example.demo.ToyStore.Service.productService;
import com.example.demo.ToyStore.entity.product;
import com.example.demo.ToyStore.repository.productrepository;
@Service
public class productServiceImpl implements productService{

@Autowired
productrepository prorepository;
	@Override
	public product addproduct(product productdetails) {

		return prorepository.save(productdetails);
	}
	
	

	@Override
	public product updateproduct(String productname, product productdetails) {
product p1 = prorepository.findByproductname(productname);
		
		if(p1!=null) {
			//p1.setProductName(productdetails.getProductName());   // old to new set
			p1.setProducturl(productdetails.getProducturl());
			p1.setProductdescription(productdetails.getProductdescription());
		return prorepository.save(productdetails);
		} 
		else 
		{
			throw new loginexception();
		} 
	}	
	@Override
	public void Delete(String productname) {
		
		product p2= prorepository.findByproductname(productname);
		if(p2!=null) {
			prorepository.delete(p2);
		}
		else
		{
			throw new loginexception();
		}
	}
	}

