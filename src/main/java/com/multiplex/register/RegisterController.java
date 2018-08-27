package com.multiplex.register;

import javax.ws.rs.Consumes;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin(origins="http://localhost:4200")
@RestController
public class RegisterController {
	
	@Autowired
	private RegisterService service;
	
	@PostMapping("/")
	@Consumes({MediaType.APPLICATION_JSON})
	@Produces({MediaType.APPLICATION_JSON})
	public User registerUser(@RequestBody User user) {
		
		
		service.create(user.getUserName(), user.getFullName(), user.getEmail(), user.getPhone(), user.getPassword());
		
		return user;
	}
	
	@PostMapping("/login")
	@Consumes({MediaType.APPLICATION_JSON})
	@Produces({MediaType.APPLICATION_JSON})
	public Boolean get(@RequestBody Login login) {
		
		return service.validateLogin(login.getUserName(),login.getPassword());
	}

}
