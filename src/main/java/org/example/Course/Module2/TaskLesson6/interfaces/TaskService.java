package org.example.Course.Module2.TaskLesson6.interfaces;

import org.example.Course.Module2.TaskLesson6.model.Task;

import java.util.List;

public interface TaskService {

    void addTask(Task task);

    void removeTask(int id);

    Task findTaskById(int id);

    List<Task> listAllTasks();
}
