package ToDoManager.Core.Tasks;

import java.util.List;

public class TasksDividedByPriority {
    private int id;
    private List<Task> task;

    public TasksDividedByPriority(int id, List<Task> task) {
        this.id = id;
        this.task = task;
    }

    public TasksDividedByPriority() {
    }

    public int getId() {
        return id;
    }

    public List<Task> getTask() {
        return task;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setTask(List<Task> task) {
        this.task = task;
    }

    @Override
    public String toString() {
        return "PriorityTasks{" +
                "id=" + id +
                ", task=" + task +
                '}';
    }
}
