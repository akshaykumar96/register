package com.multiplex.register;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RegisterService {
	
	@Autowired
	private RegisterRepository repo;
	
	public User create(String fName, String uName, String email, String phone, String password) {
		
		return repo.save(new User(fName,uName,email,phone,password));
		
	}

	public Boolean validateLogin(String userName, String password) {


		try {
		
		User user= repo.findByUserName(userName);
		
		System.out.println(user);
		
		String userPassword= user.getPassword();
		
		if((!userPassword.equals(password))) {
			return false;
		}

		else {
			return true;
		}
		}
		catch(NullPointerException e) {
			return false;
		}
		
	
		
		
	}

}
