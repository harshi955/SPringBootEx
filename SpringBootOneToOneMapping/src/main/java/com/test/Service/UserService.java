package com.test.Service;

import org.springframework.stereotype.Service;

import com.test.Entity.User;
import com.test.Repository.UserRepository;

@Service
public class UserService {
	private final UserRepository userRepository;

	public UserService(UserRepository userRepository) {
		this.userRepository = userRepository;
	}

	public User createUser(User user) {
		
		return userRepository.save(user);
	}
	
	

}
