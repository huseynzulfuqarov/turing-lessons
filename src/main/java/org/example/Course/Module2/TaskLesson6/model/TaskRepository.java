package org.example.Course.Module2.TaskLesson6.model;

import org.example.Course.Module2.TaskLesson6.exception.TaskNotFoundException;

import java.util.List;
import java.util.Optional;

public class TaskRepository<T extends Task> {

    private List<T> tasks;

    public TaskRepository(List<T> tasks) {
        this.tasks = tasks;
    }

    public TaskRepository() {
    }

    public List<T> getTasks() {
        return tasks;
    }

    public void setTasks(List<T> tasks) {
        this.tasks = tasks;
    }

    public void save(T task) {
        tasks.add(task);
    }

    public void deleteById(int id) throws TaskNotFoundException {
        boolean found = false;
        for (int i = 0; i < tasks.size(); i++) {
            if (tasks.get(i).getId() == id) {
                tasks.remove(i);
                found = true;
                break;
            }
        }
        if (!found) {
            throw new TaskNotFoundException("Task with id " + id + " not found");
        }
    }

    public Optional<T> findById(int id) {
        boolean found = false;
        for (int i = 0; i < tasks.size(); i++) {
            if (tasks.get(i).getId() == id) {
                return Optional.of(tasks.get(i));
            }
        }
        return Optional.empty();
    }

    public List<T> findAll() {
        return tasks;
    }

}
