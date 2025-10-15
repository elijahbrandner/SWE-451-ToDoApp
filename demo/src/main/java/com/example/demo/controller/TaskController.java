package com.example.demo.controller;

import com.example.demo.model.Task;
import com.example.demo.service.TaskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/tasks")
@CrossOrigin
public class TaskController {

    @Autowired
    private TaskService taskService;

    //? Create new Task
    @PostMapping
    public Task createTask(@RequestBody Task task){
        return taskService.createTask(task.getDescription());
    }

    //? Get All tasks
    @GetMapping
    public List<Task> getAllTasks() {
        return taskService.getAllTasks();
    }
}
