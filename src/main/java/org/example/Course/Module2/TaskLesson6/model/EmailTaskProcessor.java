package org.example.Course.Module2.TaskLesson6.model;

public class EmailTaskProcessor extends AbstractTaskProcessor {
    @Override
    void processTask(Task task) {
        System.out.println("Email Task Processor for" + task.getTitle());
    }
}
