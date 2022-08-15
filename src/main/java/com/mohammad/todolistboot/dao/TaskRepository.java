package com.mohammad.todolistboot.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mohammad.todolistboot.entity.Task;

public interface TaskRepository extends JpaRepository<Task, Integer> {

}
