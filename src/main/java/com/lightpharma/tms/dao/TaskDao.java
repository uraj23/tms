package com.lightpharma.tms.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.lightpharma.tms.repositories.TaskRepository;

@Repository
public class TaskDao {

	@Autowired
	private TaskRepository repository;
}
