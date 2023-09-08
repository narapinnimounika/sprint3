package com.example.demo.ToyStore.Controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.ToyStore.Service.productService;
import com.example.demo.ToyStore.entity.product;


@RestController
public class productController {

	@Autowired
	productService productService;
	
	/*@GetMapping("/login")
	public  product productname(@RequestHeader String email ,
			@RequestHeader String password) {
		
		return productService.product(productname, productdetails); 
	}*/
	
	@PostMapping("/post")
	public product addproduct(@RequestBody product productdetails) {
		
		return productService.addproduct (productdetails);
	}
	
	@PutMapping("/update")
	public product updateproduct(@RequestHeader String productname , @RequestBody product  productdetails ) {
		
		
		return productService.updateproduct( productname,  productdetails);
	}
	@DeleteMapping("/delete")
	public String delete(@RequestHeader String productname) {
		productService.Delete(productname);
		return "data deleted";
	}
	
	
}
