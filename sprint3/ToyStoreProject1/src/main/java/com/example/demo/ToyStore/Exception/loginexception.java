package com.example.demo.ToyStore.Exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value = HttpStatus.ACCEPTED)
public class loginexception extends RuntimeException {

	public loginexception() {
		super("Invalid credentials");
		
	}

	
	
}

