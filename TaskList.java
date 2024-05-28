import java.util.ArrayList;
import java.util.Scanner;

public class TaskList {
    private static ArrayList<String> tasks = new ArrayList<>();
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        boolean running = true;
        while (running) {
            System.out.println("Task List Application");
            System.out.println("1. Add Task");
            System.out.println("2. Remove Task");
            System.out.println("3. List Tasks");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline character

            switch (choice) {
                case 1:
                    addTask();
                    break;
                case 2:
                    removeTask();
                    break;
                case 3:
                    listTasks();
                    break;
                case 4:
                    running = false;
                    break;
                default:
                    System.out.println("Invalid choice. Please enter a number between 1 and 4.");
            }
        }
        System.out.println("Exiting Task List Application. Goodbye!");
    }

    private static void addTask() {
        System.out.print("Enter the task to add: ");
        String task = scanner.nextLine();
        tasks.add(task);
        System.out.println("Task added successfully.");
    }

    private static void removeTask() {
        if (tasks.isEmpty()) {
            System.out.println("Task list is empty. Nothing to remove.");
            return;
        }
        System.out.println("Current Tasks:");
        listTasks();
        System.out.print("Enter the index of the task to remove: ");
        int index = scanner.nextInt();
        scanner.nextLine(); // Consume newline character
        if (index >= 0 && index < tasks.size()) {
            String removedTask = tasks.remove(index);
            System.out.println("Task \"" + removedTask + "\" removed successfully.");
        } else {
            System.out.println("Invalid index. Please enter a valid index.");
        }
    }

    private static void listTasks() {
        if (tasks.isEmpty()) {
            System.out.println("Task list is empty.");
        } else {
            System.out.println("Current Tasks:");
            for (int i = 0; i < tasks.size(); i++) {
                System.out.println(i + ". " + tasks.get(i));
            }
        }
    }
}




