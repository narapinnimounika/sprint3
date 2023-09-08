
package com.example.demo.ToyStore.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.ToyStore.Service.LoginService;
import com.example.demo.ToyStore.entity.Login;


@RestController
public class LoginController {

	@Autowired
   LoginService loginService;
	
	@GetMapping("/login")
	public Login login(@RequestHeader String email ,
			@RequestHeader String password) {
		
		return loginService.login(email, password); 
	}
	
	/*@PostMapping("/post")
	public Login addlogin(@RequestBody Login login1) {
		
		return loginService.addlogin(login1);
	}
	
	@PutMapping("/update")
	public Login updatelogin(@RequestHeader String email , @RequestBody Login student ) {
		
		return loginService.updatelogin(email,student);
	}
	@DeleteMapping("/delete")
	public String delete(@RequestHeader String email) {
		loginService.Delete(email);
		return "data deleted";*/
	}
	
	

