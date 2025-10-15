package com.example.demo.service;

import com.example.demo.model.Task;
import com.example.demo.repository.TaskRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TaskService {
    @Autowired
    private TaskRepository taskRepository;

    public Task createTask(String description) {
        return taskRepository.save(new Task(null, description));
    }

    public List<Task> getAllTasks() {
        return taskRepository.findAll();
    }
}
