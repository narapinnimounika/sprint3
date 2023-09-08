
package com.example.demo.ToyStore.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.example.demo.ToyStore.entity.Login;

//import com.example.ToyStore.entity.Login;

public interface Loginrepository extends JpaRepository<Login, String> {

	@Query(value =  "select * from Login where email =?" , nativeQuery = true)
	Login findByEmail(String email);

	
//	@Query(value = "delete from Student where email =?" , nativeQuery = true)
//	void deleteById(String email);

	
	
	
}

