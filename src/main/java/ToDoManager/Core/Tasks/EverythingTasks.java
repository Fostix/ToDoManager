package ToDoManager.Core.Tasks;

import java.util.ArrayList;
import java.util.List;

public class EverythingTasks {
    private String statusTask;
    private List<TasksDividedByStatus> tasksDividedByStatus = new ArrayList<>();

    /** Конструктор заданий
     * @param statusTask Статус задания (в процессе, завершён или удалён).
     * @param tasksDividedByStatus Конкретный список от выбранного статуса.*/
    public EverythingTasks(String statusTask, List<TasksDividedByStatus> tasksDividedByStatus) {
        this.statusTask = statusTask;
        this.tasksDividedByStatus = tasksDividedByStatus;
    }

    public EverythingTasks(String statusTask) {
        this.statusTask = statusTask;
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

    public void append(TasksDividedByStatus tasksDividedByStatus) {// TODO: 02/08/2022 Ограничеть выбор!!
        this.tasksDividedByStatus.add(tasksDividedByStatus);
    }

    @Override
    public String toString() {
        return "StatusTasks{" +
                "statusTask='" + statusTask + '\'' +
                ", tasksDividedByStatus=" + tasksDividedByStatus +
                '}';
    }
}
