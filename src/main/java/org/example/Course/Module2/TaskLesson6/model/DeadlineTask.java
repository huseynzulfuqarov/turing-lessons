package org.example.Course.Module2.TaskLesson6.model;

import org.example.Course.Module2.TaskLesson6.emums.TaskStatus;

import java.time.LocalDateTime;

public class DeadlineTask extends Task {
    private LocalDateTime deadline;

    public DeadlineTask(String title, String description, boolean isComplete, TaskStatus status, LocalDateTime deadline) {
        super(title, description, isComplete, status);
        this.deadline = deadline;
    }

    public void setDeadline(LocalDateTime deadline) {
        this.deadline = deadline;
    }

    public LocalDateTime getDeadline() {
        return deadline;
    }

    @Override
    public String toString() {
        return "DeadlineTask{" +
                "deadline=" + deadline +
                super.toString() +
                '}';
    }
}
