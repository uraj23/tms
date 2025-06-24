package com.lightpharma.tms.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lightpharma.tms.dao.TaskDao;

@Service
public class TaskService {
	
	@Autowired
	private TaskDao dao;

}
