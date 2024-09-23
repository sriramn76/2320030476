package TodoList;

import java.util.*;
import java.util.function.Predicate;

public class Main {
    private static TaskManager taskManager = new TaskManager();
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("--- Welcome to the To-Do List Application ---");
        boolean exit = false;

        while (!exit) {
            displayMenu();
            String choice = scanner.nextLine().trim();

            switch (choice) {
                case "1":
                    addTask();
                    break;
                case "2":
                    removeTask();
                    break;
                case "3":
                    listTasks();
                    break;
                case "4":
                    filterTasks();
                    break;
                case "5":
                    markTaskAsCompleted();
                    break;
                case "6":
                    exit = true;
                    System.out.println("Exiting the application. Goodbye!");
                    break;
                default:
                    System.out.println("Invalid choice! Please select a valid option.\n");
            }
        }

        scanner.close();
    }

    private static void displayMenu() {
        System.out.println("\nPlease choose an option:");
        System.out.println("1. Add Task");
        System.out.println("2. Remove Task");
        System.out.println("3. List All Tasks");
        System.out.println("4. Filter Tasks");
        System.out.println("5. Mark Task as Completed");
        System.out.println("6. Exit");
        System.out.print("Enter your choice: ");
    }

    private static void addTask() {
        System.out.print("Enter task description: ");
        String description = scanner.nextLine().trim();

        int priority = 0;
        while (true) {
            System.out.print("Enter task priority (1 = highest priority): ");
            String priorityInput = scanner.nextLine().trim();
            try {
                priority = Integer.parseInt(priorityInput);
                if (priority < 1) {
                    System.out.println("Priority must be a positive integer.");
                } else {
                    break;
                }
            } catch (NumberFormatException e) {
                System.out.println("Invalid input! Please enter a valid integer for priority.");
            }
        }

        Task task = new Task(description, priority);
        taskManager.addTask(task);
        System.out.println("Task added successfully: " + task);
    }

    private static void removeTask() {
        if (isTaskQueueEmpty()) return;

        int id = promptForTaskId("remove");
        if (id == -1) return;

        boolean removed = taskManager.removeTaskById(id);
        if (removed) {
            System.out.println("Task with ID " + id + " removed successfully.");
        } else {
            System.out.println("No task found with ID " + id + ".");
        }
    }

    private static void listTasks() {
        System.out.println("\n=== Listing All Tasks ===");
        taskManager.listTasks();
    }

    private static void filterTasks() {
        if (isTaskQueueEmpty()) return;

        System.out.println("\nFilter Options:");
        System.out.println("1. Show Completed Tasks");
        System.out.println("2. Show High-Priority Tasks (Priority ≤ 2)");
        System.out.print("Enter your choice: ");
        String filterChoice = scanner.nextLine().trim();

        switch (filterChoice) {
            case "1":
                System.out.println("\n=== Completed Tasks ===");
                Predicate<Task> completedPredicate = Task::isCompleted;
                taskManager.filterTasks(completedPredicate);
                break;
            case "2":
                System.out.println("\n=== High-Priority Tasks (Priority ≤ 2) ===");
                Predicate<Task> highPriorityPredicate = task -> task.getPriority() <= 2;
                taskManager.filterTasks(highPriorityPredicate);
                break;
            default:
                System.out.println("Invalid filter choice!");
        }
    }

    private static void markTaskAsCompleted() {
        if (isTaskQueueEmpty()) return;

        int id = promptForTaskId("mark as completed");
        if (id == -1) return;

        boolean marked = taskManager.markTaskAsCompleted(id);
        if (marked) {
            System.out.println("Task with ID " + id + " marked as completed.");
        } else {
            System.out.println("No task found with ID " + id + ".");
        }
    }

    private static int promptForTaskId(String action) {
        int id = -1;
        while (true) {
            System.out.print("Enter the task ID to " + action + " (or type 'cancel' to return): ");
            String input = scanner.nextLine().trim();
            if (input.equalsIgnoreCase("cancel")) {
                System.out.println("Action cancelled.");
                return -1;
            }
            try {
                id = Integer.parseInt(input);
                if (id < 1) {
                    System.out.println("ID must be a positive integer.");
                } else {
                    break;
                }
            } catch (NumberFormatException e) {
                System.out.println("Invalid input! Please enter a valid task ID.");
            }
        }
        return id;
    }

    private static boolean isTaskQueueEmpty() {
        System.out.println("\n ------Current Tasks------");
        taskManager.listTasks();
        return false;
    }
}
