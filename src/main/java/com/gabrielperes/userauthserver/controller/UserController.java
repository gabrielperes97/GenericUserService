package com.gabrielperes.userauthserver.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.gabrielperes.userauthserver.model.User;
import com.gabrielperes.userauthserver.repository.UserRepository;

@RestController
@RequestMapping("user")
public class UserController {
	
	@Autowired
	private UserRepository userRepository;
	
	@PostMapping()
	private User createNewUser(User user) {
		return userRepository.save(user);
	}

}
