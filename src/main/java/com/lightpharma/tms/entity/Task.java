package com.lightpharma.tms.entity;

import java.time.LocalDate;
import java.time.LocalDateTime;

import org.hibernate.annotations.CreationTimestamp;

import com.lightpharma.tms.util.TaskCategory;
import com.lightpharma.tms.util.TaskPriority;
import com.lightpharma.tms.util.TaskStatus;

import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Entity
public class Task {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	private String title;
	@CreationTimestamp
	private LocalDateTime createdOn;

	private LocalDateTime completedOn;

	private LocalDate dueDate;

	@Enumerated(EnumType.STRING)
	private TaskStatus status = TaskStatus.PENDING;

	@Enumerated(EnumType.STRING)
	private TaskPriority priority = TaskPriority.HIGH;

	@Enumerated(EnumType.STRING)
	private TaskCategory category = TaskCategory.WORK;
	
	@ManyToOne
	private User user;
	
}
