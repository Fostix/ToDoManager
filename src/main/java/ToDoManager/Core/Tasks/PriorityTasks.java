package ToDoManager.Core.Tasks;


import java.util.List;

public class PriorityTasks {
    private int id;
    private List<Task> task;

    public PriorityTasks(int id, List<Task> task) {
        this.id = id;
        this.task = task;
    }

    public PriorityTasks() {
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
                "Id=" + id +
                ", task=" + task +
                '}';
    }
}
