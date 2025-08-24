package org.example.Course.Module2.TaskLesson6.model;

import org.example.Course.Module2.TaskLesson6.exception.TaskNotFoundException;
import org.example.Course.Module2.TaskLesson6.interfaces.TaskService;

import java.util.List;
import java.util.Optional;

public class TaskServiceImpl implements TaskService {

    TaskRepository taskRepository = new TaskRepository();

    public TaskServiceImpl() {}

    @Override
    public void addTask(Task task) {
        taskRepository.save(task);
    }

    @Override
    public void removeTask(int id) {
        try {
            taskRepository.deleteById(id);
        }
        catch (TaskNotFoundException e) {
            System.out.println(e.getMessage());
        }
    }

    @Override
    public Task findTaskById(int id) throws TaskNotFoundException {
        return (Task) taskRepository.findById(id).orElseThrow();
    }

    @Override
    public List<Task> listAllTasks() {
        return taskRepository.findAll();
    }
}
