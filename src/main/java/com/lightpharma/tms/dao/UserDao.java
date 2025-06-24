package com.lightpharma.tms.dao;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.lightpharma.tms.entity.User;
import com.lightpharma.tms.repositories.UserRepository;

@Repository
public class UserDao {
	@Autowired
	private UserRepository repository;

	public User save(User user) {
		return repository.save(user);
	}

	public Optional<User> findById(int id) {
		return repository.findById(id);
	}

	public Optional<User> findByEmailAndPassword(String email, String password) {
		return repository.findByEmailAndPassword(email, password);
	}

}
