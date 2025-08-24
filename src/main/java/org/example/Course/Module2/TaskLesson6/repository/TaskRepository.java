package org.example.Course.Module2.TaskLesson6.repository;

import org.example.Course.Module2.TaskLesson6.exception.TaskNotFoundException;
import org.example.Course.Module2.TaskLesson6.model.Task;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class TaskRepository<T extends Task> {

    private final List<T> tasks = new ArrayList<>();

    public void save(T task) {
        tasks.add(task);
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

    public List<T> findAll() {
        return new ArrayList<>(tasks);
    }
}
