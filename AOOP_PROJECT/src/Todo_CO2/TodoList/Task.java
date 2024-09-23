package TodoList;

import java.util.*;

public class Task implements Comparable<Task> {
    private static int A = 1;

    private int id;
    private String description;
    private int priority;  
    private boolean isCompleted;

    public Task(String description, int priority) {
        this.id = A++;
        this.description = description;
        this.priority = priority;
        this.isCompleted = false;
    }

    public int getId() {
        return id;
    }

    public String getDescription() {
        return description;
    }

    public int getPriority() {
        return priority;
    }

    public boolean isCompleted() {
        return isCompleted;
    }

    public void markAsCompleted() {
        this.isCompleted = true;
    }

    @Override
    public int compareTo(Task other) {
        return Integer.compare(this.priority, other.priority);
    }

    @Override
    public String toString() {
        return String.format("ID: %d | Description: %s | Priority: %d | Completed: %s",
                id, description, priority, isCompleted ? "Yes" : "No");
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Task task = (Task) o;
        return id == task.id; 
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
