package com.example.demo.ToyStore.Service;

import com.example.demo.ToyStore.entity.Login;

public interface LoginService { 
	
	Login login(String email ,String password);
}
