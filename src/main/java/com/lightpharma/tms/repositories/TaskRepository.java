package com.lightpharma.tms.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.lightpharma.tms.entity.Task;

public interface TaskRepository extends JpaRepository<Task, Integer> {

}
