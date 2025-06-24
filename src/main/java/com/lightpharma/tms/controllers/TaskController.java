package com.lightpharma.tms.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.lightpharma.tms.entity.Task;
import com.lightpharma.tms.service.TaskService;

@RestController
@RequestMapping("/tasks")
public class TaskController {

	@Autowired
	private TaskService service;

	@PostMapping("/{id}")
	public ResponseEntity<?> saveTask(@PathVariable int id, @RequestBody Task task) {
		return service.saveTask(id, task);
	}

	@GetMapping("/{id}")
	public ResponseEntity<?> findAllTasksByUserId(@PathVariable int id){
		return service.findAllTasksByUserId(id);
	}
	
	
}
