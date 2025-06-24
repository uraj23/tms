package com.lightpharma.tms.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.lightpharma.tms.dao.TaskDao;
import com.lightpharma.tms.dao.UserDao;
import com.lightpharma.tms.entity.Task;
import com.lightpharma.tms.entity.User;

@Service
public class TaskService {

	@Autowired
	private TaskDao dao;

	@Autowired
	private UserDao userDao;

	public ResponseEntity<?> saveTask(int id, Task task) {

		User user = userDao.findById(id).orElseThrow(() -> new RuntimeException("Invalid UserId"));

		task.setUser(user);

		Task savedTask = dao.saveTask(task);

		return ResponseEntity.ok().body(savedTask);
	}


	public ResponseEntity<?> findAllTasksByUserId(int id) {
		return ResponseEntity.ok().body(dao.findAllTasksByUserId(id));
	}

}
