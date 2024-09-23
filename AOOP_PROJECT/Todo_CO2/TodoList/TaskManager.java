package TodoList;

import java.util.PriorityQueue;
import java.util.function.Predicate;

public class TaskManager {
    private PriorityQueue<Task> taskQueue;

    public TaskManager() {
        taskQueue = new PriorityQueue<>();
    }


    public void addTask(Task task) {
        taskQueue.offer(task);
    }


    public boolean removeTaskById(int id) {
        return taskQueue.removeIf(task -> task.getId() == id);
    }


    public boolean markTaskAsCompleted(int id) {
        for (Task task : taskQueue) {
            if (task.getId() == id) {
                task.markAsCompleted();
                return true;
            }
        }
        return false;
    }


    public void listTasks() {
        if (taskQueue.isEmpty()) {
            System.out.println("No tasks available.");
            return;
        }


        PriorityQueue<Task> sortedQueue = new PriorityQueue<>(taskQueue);
        while (!sortedQueue.isEmpty()) {
            System.out.println(sortedQueue.poll());
        }
    }

    public void filterTasks(Predicate<Task> predicate) {
        boolean found = false;
        for (Task task : taskQueue) {
            if (predicate.test(task)) {
                System.out.println(task);
                found = true;
            }
        }
        if (!found) {
            System.out.println("No tasks match the filter criteria.");
        }
    }
}
