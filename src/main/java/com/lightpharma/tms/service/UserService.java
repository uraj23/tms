package com.lightpharma.tms.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.lightpharma.tms.dao.UserDao;
import com.lightpharma.tms.entity.User;
import com.lightpharma.tms.repositories.UserRepository;

@Service
public class UserService {

	@Autowired
	private UserDao dao;

	public ResponseEntity<?> save(User user) {
		return ResponseEntity.ok().body(dao.save(user));

	}

	public ResponseEntity<?> findUserById(int id) {
		Optional<User> optional = dao.findById(id);
		User user = optional.orElseThrow(() -> new RuntimeException("Invalid UserId"));
		return ResponseEntity.ok().body(user);
	}

	public ResponseEntity<?> login(String email, String password) {
		Optional<User> optional = dao.findByEmailAndPassword(email, password);
		User user = optional.orElseThrow(() -> new RuntimeException("Invalid Credentials"));
		return ResponseEntity.ok().body(user);
	}

}