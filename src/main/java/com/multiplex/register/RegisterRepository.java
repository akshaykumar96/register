package com.multiplex.register;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RegisterRepository extends MongoRepository<User, Integer>{

	public User findByUserName(String userName);

	
	
}