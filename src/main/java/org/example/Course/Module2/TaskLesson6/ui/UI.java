package org.example.Course.Module2.TaskLesson6.ui;

import org.example.Course.Module2.TaskLesson6.interfaces.TaskService;
import org.example.Course.Module2.TaskLesson6.model.ImmutableUser;
import org.example.Course.Module2.TaskLesson6.model.Task;
import org.example.Course.Module2.TaskLesson6.model.TaskServiceImpl;

import java.util.Scanner;

public class UI {

    TaskServiceImpl taskService = new TaskServiceImpl();
    ImmutableUser immutableUser= new ImmutableUser();
    Task task = new Task();
    static Scanner scanner = new Scanner(System.in);

    public void console(){
        while (true) {
            System.out.println("""
                    1. add exist task to exist user with id
                    2. create Task
                    3. Find task by id
                    4. List all tasks
                    5. delete task by id
                    6. get task status by id""");
        }
    }

    public void start() {
        console();

        int choice;
        choice = scanner.nextInt();
        switch (choice) {
            case 1:{
                System.out.println("Enter task id:");
                int id = scanner.nextInt();
                System.out.println("Enter user id: ");

                int userId = scanner.nextInt();
                Task task = taskService.findTaskById(id);
                ImmutableUser user =

                task.addUser(userId);

            }
        }
    }


}
