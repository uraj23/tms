package com.lightpharma.tms.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.lightpharma.tms.entity.User;
import com.lightpharma.tms.service.UserService;

@RestController
@RequestMapping("/users")
public class UserController {
	@Autowired
	private UserService userService;

	@PostMapping
	public ResponseEntity<?> saveUser(@RequestBody User user) {
		return userService.save(user);
	}

	@GetMapping("/{id}")
	public ResponseEntity<?> fetchUserById(@PathVariable int id) {
		return userService.findUserById(id);
	}

	@PostMapping("/{email}/{password}")
	public ResponseEntity<?> login(@PathVariable String email, @PathVariable String password) {
		return userService.login(email, password);
	}

}
