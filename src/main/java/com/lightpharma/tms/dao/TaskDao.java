package com.lightpharma.tms.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Repository;

import com.lightpharma.tms.entity.Task;
import com.lightpharma.tms.repositories.TaskRepository;

@Repository
public class TaskDao {

	@Autowired
	private TaskRepository repository;

	public Task saveTask(Task task) {
		return repository.save(task);
	}


	public List<Task> findAllTasksByUserId(int id) {
		return repository.findAllTasksByUserId(id);
	}

}
