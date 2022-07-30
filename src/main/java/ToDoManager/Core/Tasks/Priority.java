package ToDoManager.Core.Tasks;

import java.util.List;

public class Priority {
    private String priority;
    private List<PriorityTasks> priorityTasks;

    public Priority(String priority, List<PriorityTasks> priorityTasks) {
        this.priority = priority;
        this.priorityTasks = priorityTasks;
    }

    public Priority() {
    }

    public String getPriority() {
        return priority;
    }

    public List<PriorityTasks> getPriorityTasks() {
        return priorityTasks;
    }

    public void setPriority(String priority) {
        this.priority = priority;
    }

    public void setPriorityTasks(List<PriorityTasks> priorityTasks) {
        this.priorityTasks = priorityTasks;
    }

    @Override
    public String toString() {
        return "Priority{" +
                "priority='" + priority + '\'' +
                ", priorityTasks=" + priorityTasks +
                '}';
    }
}
