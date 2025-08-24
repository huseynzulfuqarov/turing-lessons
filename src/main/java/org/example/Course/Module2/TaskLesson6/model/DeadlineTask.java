package org.example.Course.Module2.TaskLesson6.model;

import org.example.Course.Module2.TaskLesson6.emums.TaskStatus;

import java.time.LocalDateTime;
import java.util.Objects;

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
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        DeadlineTask that = (DeadlineTask) o;
        return Objects.equals(deadline, that.deadline);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), deadline);
    }

    @Override
    public String toString() {
        return "DeadlineTask{" +
                "deadline=" + deadline +
                super.toString() +
                '}';
    }
}
