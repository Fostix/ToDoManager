package ToDoManager.Core.Tasks;

import java.util.List;

public class StatusTasks {
    private String statusTask;
    private List<Priority> allInProgressTasks;

    public StatusTasks(String status, List<Priority> priority) {
        this.statusTask = status;
        this.allInProgressTasks = priority;
    }

    public StatusTasks() {
    }

    public String getStatus() {
        return statusTask;
    }

    public List<Priority> getPriority() {
        return allInProgressTasks;
    }

    public void setStatus(String status) {
        this.statusTask = status;
    }

    public void setPriority(List<Priority> priority) {
        this.allInProgressTasks = priority;
    }

    @Override
    public String toString() {
        return "StatusTasks{" +
                "status='" + statusTask + '\'' +
                ", priority=" + allInProgressTasks +
                '}';
    }
}
