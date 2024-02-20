package com.rps.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rps.model.User;

@RestController
@RequestMapping("/api/v1")
public class UserController {

	@PostMapping("/users")
	public User addUser(@RequestBody User user) {
		return new User(1,"Rakesh Srivastaw",50);
	}
}
