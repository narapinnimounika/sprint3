
package com.example.demo.ToyStore.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.demo.ToyStore.entity.product;

//import com.example.ToyStore.entity.Login;
@Repository
public interface productrepository extends JpaRepository<product, String> {

	@Query(value =  "select * from product where product_name =?" , nativeQuery = true)
	product findByproductname(String productname);

	
//	@Query(value = "delete from Student where email =?" , nativeQuery = true)
//	void deleteById(String email);

	
	
	
}


