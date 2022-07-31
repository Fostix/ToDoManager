package ToDoManager.Core.Tasks;

import java.util.List;

public class ListTasks<T extends StatusTasks> {
    private List<StatusTasks> tasks;

    public ListTasks(StatusTasks tasks) {
        this.tasks.add(tasks);
    }

    public List<StatusTasks> getTasks() {
        return tasks;
    }

    public void setTasks(List<StatusTasks> tasks) {
        this.tasks = tasks;
    }

    @Override
    public String toString() {
        return "ListTasks{" +
                "tasks=" + tasks +
                '}';
    }
}
