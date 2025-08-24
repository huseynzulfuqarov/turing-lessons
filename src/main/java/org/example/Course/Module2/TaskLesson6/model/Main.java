package org.example.Course.Module2.TaskLesson6.model;

import org.example.Course.Module2.TaskLesson6.emums.TaskStatus;
import org.example.Course.Module2.TaskLesson6.ui.UI;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Scanner;

public class Main {
    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {

        LocalDateTime now = LocalDateTime.now();

        LocalDateTime deadline = LocalDateTime.of(2020, 12, 31, 23, 59, 59);

        ImmutableUser user1 = new ImmutableUser("fsdfsd");
        ImmutableUser user2 = new ImmutableUser("fsdfsd");
        ImmutableUser user3 = new ImmutableUser("fsdfsd");
        ImmutableUser user4 = new ImmutableUser("fsdfsd");

        Task task1 = new Task("sadas", "sdas", true, TaskStatus.NEW);
        Task task2 = new Task("sadas", "sdas", true, TaskStatus.COMPLETED);
        Task task3 = new Task("sadas", "sdas", true, TaskStatus.IN_PROGRESS);

        DeadlineTask deadlineTask = new DeadlineTask("rtert", "erter", false, TaskStatus.NEW, deadline);
        DeadlineTask deadlineTask1 = new DeadlineTask("rtert", "erter", false, TaskStatus.NEW, deadline);
        DeadlineTask deadlineTask2 = new DeadlineTask("rtert", "erter", false, TaskStatus.NEW, deadline);


        task1.addUser(user1);
        task1.addUser(user2);
        task1.addUser(user3);

        task2.addUser(user4);
        task2.addUser(user1);

        deadlineTask2.addUser(user1);
        deadlineTask2.addUser(user2);
        deadlineTask2.addUser(user4);

        UI ui = new UI();
        ui.start();
    }
}
