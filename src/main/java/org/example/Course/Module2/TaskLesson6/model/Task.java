package org.example.Course.Module2.TaskLesson6.model;

import org.example.Course.Module2.TaskLesson6.emums.TaskStatus;

import java.time.LocalDateTime;
import java.util.*;

public class Task {
    private Integer id;
    private String title;
    private String description;
    private LocalDateTime creationAt;
    private boolean isComplete;
    private TaskStatus status;
    private List<ImmutableUser> users;
    private final UUID uuid = UUID.randomUUID();


    public Task(String title, String description, boolean isComplete, TaskStatus status) {
        this.id =  uuid.toString().hashCode();
        this.title = title;
        this.description = description;
        LocalDateTime now = LocalDateTime.now();
        this.creationAt = now;
        this.isComplete = isComplete;
        this.status = status;
    }

    public Task() {}
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
   public void setUsers(List<ImmutableUser> users) {
        this.users = users;

   }

   public List<ImmutableUser> getUsers() {
        return users;
   }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public LocalDateTime getCreationAt() {
        return creationAt;
    }

    public void setCreationAt(LocalDateTime creationAt) {
        this.creationAt = creationAt;
    }

    public boolean isComplete() {
        return isComplete;
    }

    public void setComplete(boolean complete) {
        isComplete = complete;
    }

    public TaskStatus getStatus() {
        return status;
    }

    public void setStatus(TaskStatus status) {
        this.status = status;
    }

    public void addUser(ImmutableUser user) {
        users.add(user);
    }

    public void removeUser(ImmutableUser user) {
        users.remove(user);
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Task task = (Task) o;
        return isComplete == task.isComplete && Objects.equals(id, task.id) && Objects.equals(title, task.title) && Objects.equals(description, task.description) && Objects.equals(creationAt, task.creationAt) && status == task.status;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, title, description, creationAt, isComplete, status);
    }
}
