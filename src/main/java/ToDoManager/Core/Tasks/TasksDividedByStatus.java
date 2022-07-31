package ToDoManager.Core.Tasks;

import java.util.List;

public class TasksDividedByStatus {
    private String priority;
    private List<TasksDividedByPriority> tasksDividedByPriority;

    public TasksDividedByStatus(String priority, List<TasksDividedByPriority> priorityTasks) {
        this.priority = priority;
        this.tasksDividedByPriority = priorityTasks;
    }

    public TasksDividedByStatus() {
    }

    public String getPriority() {
        return priority;
    }

    public List<TasksDividedByPriority> getTasksDividedByPriority() {
        return tasksDividedByPriority;
    }

    public void setPriority(String priority) {
        this.priority = priority;
    }

    public void setTasksDividedByPriority(List<TasksDividedByPriority> tasksDividedByPriority) {
        this.tasksDividedByPriority = tasksDividedByPriority;
    }

    @Override
    public String toString() {
        return "Priority{" +
                "priority='" + priority + '\'' +
                ", tasksDividedByPriority=" + tasksDividedByPriority +
                '}';
    }
}
