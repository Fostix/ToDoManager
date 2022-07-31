package ToDoManager.Core.Tasks;

import java.util.List;

public class EverythingTasks {
    private String statusTask;
    private List<TasksDividedByStatus> tasksDividedByStatus;

    public EverythingTasks(String status, List<TasksDividedByStatus> tasksDividedByStatus) {
        this.statusTask = status;
        this.tasksDividedByStatus = tasksDividedByStatus;
    }

    public EverythingTasks() {
    }

    public String getStatus() {
        return statusTask;
    }

    public List<TasksDividedByStatus> tasksDividedByStatus() {
        return tasksDividedByStatus;
    }

    public void setStatus(String status) {
        this.statusTask = status;
    }

    public void setPriority(List<TasksDividedByStatus> priority) {
        this.tasksDividedByStatus = tasksDividedByStatus;
    }

    @Override
    public String toString() {
        return "StatusTasks{" +
                "statusTask='" + statusTask + '\'' +
                ", tasksDividedByStatus=" + tasksDividedByStatus +
                '}';
    }
}
