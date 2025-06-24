package com.lightpharma.tms.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.lightpharma.tms.entity.Task;

public interface TaskRepository extends JpaRepository<Task, Integer> {

	@Query("select t from Task t where t.user = ?1")
	List<Task> findAllTasksByUserId(int id);

}
