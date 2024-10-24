package com.bmerliniDev;

import com.bmerliniDev.models.Task;
import com.bmerliniDev.utils.FileUtils;

import java.util.List;
import java.util.Optional;
import java.util.Scanner;


public class TaskTracker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Task> tasks = FileUtils.readTasksFromFile();

        while (true) {
            System.out.print("Ingrese un comando: ");
            String input = scanner.nextLine().trim();
            String[] commandParts = input.split(" ", 2);

            if (commandParts.length < 1) {
                System.out.println("Por favor, proporcione un comando.");
                continue;
            }

            String command = commandParts[0].toLowerCase(); // Asegura que el comando sea en minúsculas
            String arguments = commandParts.length > 1 ? commandParts[1] : "";

            switch (command) {
                case "add":
                    if (arguments.isEmpty()) {
                        System.out.println("Por favor, proporcione una descripción de la tarea.");
                    } else {
                        addTask(tasks, arguments);  // Solo se pasa la descripción
                    }
                    break;
                case "update":
                    handleUpdateTask(tasks, arguments);
                    break;
                case "delete":
                    handleDeleteTask(tasks, arguments);
                    break;
                case "mark-in-progress":
                    handleMarkTask(tasks, arguments, "in-progress");
                    break;
                case "mark-done":
                    handleMarkTask(tasks, arguments, "done");
                    break;
                case "list":
                    listTasks(tasks, arguments.isEmpty() ? "all" : arguments.toLowerCase());
                    break;
                case "exit":
                    System.out.println("Saliendo...");
                    return;
                default:
                    System.out.println("Comando desconocido.");
            }

            FileUtils.writeTasksToFile(tasks);
        }
    }

    private static void addTask(List<Task> tasks, String description) {
        // Generación automática del ID
        int newId = tasks.isEmpty() ? 1 : tasks.get(tasks.size() - 1).getId() + 1; // Asegura un nuevo ID único
        Task newTask = new Task(newId, description);
        tasks.add(newTask);
        System.out.println("Tarea añadida con éxito (ID: " + newId + ")");
    }

    private static void handleUpdateTask(List<Task> tasks, String arguments) {
        String[] parts = arguments.split(" ", 2);
        if (parts.length < 2) {
            System.out.println("Por favor, proporcione el ID de la tarea y la nueva descripción.");
            return;
        }

        try {
            int id = Integer.parseInt(parts[0]);
            String newDescription = parts[1];
            updateTask(tasks, id, newDescription);
        } catch (NumberFormatException e) {
            System.out.println("ID de tarea inválido. Por favor, ingrese un número.");
        }
    }

    private static void updateTask(List<Task> tasks, int id, String newDescription) {
        Optional<Task> taskOpt = tasks.stream().filter(task -> task.getId() == id).findFirst();
        if (taskOpt.isPresent()) {
            taskOpt.get().setDescription(newDescription);
            System.out.println("Tarea actualizada con éxito.");
        } else {
            System.out.println("Tarea no encontrada.");
        }
    }

    private static void handleDeleteTask(List<Task> tasks, String arguments) {
        try {
            int id = Integer.parseInt(arguments);
            deleteTask(tasks, id);
        } catch (NumberFormatException e) {
            System.out.println("ID de tarea inválido. Por favor, ingrese un número.");
        }
    }

    private static void deleteTask(List<Task> tasks, int id) {
        boolean removed = tasks.removeIf(task -> task.getId() == id);
        if (removed) {
            System.out.println("Tarea eliminada con éxito.");
        } else {
            System.out.println("Tarea no encontrada.");
        }
    }

    private static void handleMarkTask(List<Task> tasks, String arguments, String status) {
        try {
            int id = Integer.parseInt(arguments);
            markTaskStatus(tasks, id, status);
        } catch (NumberFormatException e) {
            System.out.println("ID de tarea inválido. Por favor, ingrese un número.");
        }
    }

    private static void markTaskStatus(List<Task> tasks, int id, String status) {
        Optional<Task> taskOpt = tasks.stream().filter(task -> task.getId() == id).findFirst();
        if (taskOpt.isPresent()) {
            taskOpt.get().setStatus(status);
            System.out.println("Tarea marcada como " + status + ".");
        } else {
            System.out.println("Tarea no encontrada.");
        }
    }

    private static void listTasks(List<Task> tasks, String filter) {
        tasks.stream()
                .filter(task -> filter.equals("all") || task.getStatus().equalsIgnoreCase(filter))
                .forEach(System.out::println);
    }
}


