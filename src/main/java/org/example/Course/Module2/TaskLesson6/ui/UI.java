package org.example.Course.Module2.TaskLesson6.ui;

import org.example.Course.Module2.TaskLesson6.emums.TaskStatus;
import org.example.Course.Module2.TaskLesson6.exception.TaskNotFoundException;
import org.example.Course.Module2.TaskLesson6.model.*;
import org.example.Course.Module2.TaskLesson6.service.TaskServiceImpl;
import org.example.Course.Module2.TaskLesson6.service.UserServiceImpl;

import java.util.List;
import java.util.Optional;
import java.util.Scanner;

public class UI {

    private final TaskServiceImpl taskService = new TaskServiceImpl();
    private final UserServiceImpl userService = new UserServiceImpl();
    private static final Scanner scanner = new Scanner(System.in);

    public UI() {
        ImmutableUser user1 = new ImmutableUser("XX YY");
        ImmutableUser user2 = new ImmutableUser("AA BB");
        userService.addUser(user1);
        userService.addUser(user2);
    }

    public void start() {
        while (true) {
            showMenu();
            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    createTask();
                    break;
                case 2:
                    addUserToTask();
                    break;
                case 3:
                    findTaskById();
                    break;
                case 4:
                    listAllTasks();
                    break;
                case 5:
                    deleteTaskById();
                    break;
                case 6:
                    listAllUsers();
                    break;
                case 0:
                    System.out.println("Exiting program...");
                    return;
                default:
                    System.out.println("Invalid choice! Please try again.");
            }
        }
    }

    private void showMenu() {
        System.out.println("\n--- TASK MANAGEMENT SYSTEM ---");
        System.out.println("1. Create a new task");
        System.out.println("2. Assign a user to a task");
        System.out.println("3. Find a task by ID");
        System.out.println("4. List all tasks");
        System.out.println("5. Delete a task by ID");
        System.out.println("6. List all users");
        System.out.println("0. Exit");
        System.out.print("Enter your choice: ");
    }

    private void createTask() {
        System.out.print("Enter task title: ");
        String title = scanner.nextLine();
        System.out.print("Enter task description: ");
        String description = scanner.nextLine();
        Task task = new Task(title, description, false, TaskStatus.NEW);
        taskService.addTask(task);
        System.out.println("Task created successfully! ID: " + task.getId());
    }

    private void addUserToTask() {
        System.out.print("Enter the task ID to add a user to: ");
        int taskId = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Enter the user ID to assign: ");
        int userId = scanner.nextInt();
        scanner.nextLine();

        try {
            Task task = taskService.findTaskById(taskId);
            Optional<ImmutableUser> userOpt = userService.findUserById(userId);

            if (userOpt.isPresent()) {
                ImmutableUser user = userOpt.get();
                task.addUser(user);
                System.out.println("User '" + user.getName() + "' assigned to task '" + task.getTitle() + "'.");
            } else {
                System.out.println("ERROR: User with id " + userId + " not found!");
            }
        } catch (TaskNotFoundException e) {
            System.out.println("ERROR: " + e.getMessage());
        }
    }

    private void findTaskById() {
        System.out.print("Enter task ID to find: ");
        int id = scanner.nextInt();
        scanner.nextLine();
        try {
            Task task = taskService.findTaskById(id);
            System.out.println("Found Task: " + task);
        } catch (TaskNotFoundException e) {
            System.out.println(e.getMessage());
        }
    }

    private void listAllTasks() {
        List<Task> tasks = taskService.listAllTasks();
        if (tasks.isEmpty()) {
            System.out.println("No tasks found in the system.");
        } else {
            System.out.println("--- All Tasks ---");
            for (Task task : tasks) {
                System.out.println(task);
            }
        }
    }

    private void deleteTaskById() {
        System.out.print("Enter task ID to delete: ");
        int id = scanner.nextInt();
        scanner.nextLine();
        taskService.removeTask(id);
    }

    private void listAllUsers() {
        List<ImmutableUser> users = userService.listAllUsers();
        if (users.isEmpty()) {
            System.out.println("No users found in the system.");
        } else {
            System.out.println("--- All Users ---");
            for (ImmutableUser user : users) {
                System.out.println("ID: " + user.getId() + ", Name: " + user.getName());
            }
        }
    }
}