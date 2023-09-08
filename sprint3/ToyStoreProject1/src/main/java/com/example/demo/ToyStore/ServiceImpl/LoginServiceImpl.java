package com.example.demo.ToyStore.ServiceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.ToyStore.Exception.loginexception;
import com.example.demo.ToyStore.Service.LoginService;
import com.example.demo.ToyStore.entity.Login;
import com.example.demo.ToyStore.repository.Loginrepository;
@Service
public class LoginServiceImpl implements LoginService{

@Autowired
Loginrepository loginrepository;
	@Override
	public Login login(String email, String password) {
	 Login l = loginrepository.findByEmail(email);
	 
	 if(l!=null) {
		 if(l.getPassword().equals(password)) {
			 return l;
		 }else {
			throw new loginexception();
		}
	 }else {
		 throw new loginexception();
	 }
	}
	}

	
	
	

