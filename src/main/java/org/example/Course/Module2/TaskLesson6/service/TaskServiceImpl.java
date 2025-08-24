package org.example.Course.Module2.TaskLesson6.service;

import org.example.Course.Module2.TaskLesson6.exception.TaskNotFoundException;
import org.example.Course.Module2.TaskLesson6.interfaces.TaskService;
import org.example.Course.Module2.TaskLesson6.model.Task;
import org.example.Course.Module2.TaskLesson6.repository.TaskRepository;

import java.util.List;

public class TaskServiceImpl implements TaskService {

    private final TaskRepository<Task> taskRepository = new TaskRepository<>();

    @Override
    public void addTask(Task task) {
        taskRepository.save(task);
    }

    @Override
    public Task findTaskById(int id) throws TaskNotFoundException {
        return taskRepository.findById(id).orElseThrow(() -> new TaskNotFoundException("Task with id " + id + " not found!"));
    }

    @Override
    public void removeTask(int id) throws TaskNotFoundException {
        taskRepository.deleteById(id);
    }

    @Override
    public List<Task> listAllTasks() {
        return taskRepository.findAll();
    }
}
