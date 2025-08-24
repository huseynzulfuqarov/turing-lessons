package org.example.Course.Module2.TaskLesson6.model;

import org.example.Course.Module2.TaskLesson6.emums.TaskStatus;

import java.time.LocalDateTime;
import java.util.List;
import java.util.UUID;
import java.util.ArrayList;
import java.util.Objects;

public class Task {
    private final Integer id;
    private String title;
    private String description;
    private LocalDateTime creationAt;
    private boolean isComplete;
    private TaskStatus status;
    private final List<ImmutableUser> users;
    private final UUID uuid = UUID.randomUUID();

    public Task(String title, String description, boolean isComplete, TaskStatus status) {
        this.id = uuid.toString().hashCode();
        this.title = title;
        this.description = description;
        this.creationAt = LocalDateTime.now();
        this.isComplete = isComplete;
        this.status = status;
        this.users = new ArrayList<>();
    }

    public Integer getId() {
        return id;
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

    public List<ImmutableUser> getUsers() {
        return new ArrayList<>(users);
    }

    public UUID getUuid() {
        return uuid;
    }

    public void addUser(ImmutableUser user) {
        if (!users.contains(user)) {
            users.add(user);
        }
    }

    public void removeUser(ImmutableUser user) {
        users.remove(user);
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Task task = (Task) o;
        return isComplete == task.isComplete && Objects.equals(title, task.title) && Objects.equals(description, task.description) && Objects.equals(creationAt, task.creationAt) && status == task.status && Objects.equals(users, task.users);
    }

    @Override
    public int hashCode() {
        return Objects.hash(title, description, creationAt, isComplete, status, users);
    }

    @Override
    public String toString() {
        return "Task{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", description='" + description + '\'' +
                ", creationAt=" + creationAt +
                ", isComplete=" + isComplete +
                ", status=" + status +
                ", users=" + users +
                '}';
    }
}
