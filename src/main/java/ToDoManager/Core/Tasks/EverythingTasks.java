package ToDoManager.Core.Tasks;

import java.util.ArrayList;
import java.util.List;

public class EverythingTasks<T extends TasksDividedByStatus> {
    private String statusTask;
    private List<T> tasksDividedByStatus = new ArrayList<>();

    /** Конструктор заданий
     * @param statusTask Статус задания (в процессе, завершён или удалён).
     * @param t Конкретный список от выбранного статуса.*/
    public EverythingTasks(String statusTask, List<T> t) {
        this.statusTask = statusTask;
        this.tasksDividedByStatus = t;
    }

    public EverythingTasks(String statusTask) {
        this.statusTask = statusTask;
    }

    public EverythingTasks() {
    }

    public String getStatus() {
        return statusTask;
    }

    public List<T> tasksDividedByStatus() {
        return tasksDividedByStatus;
    }

    public void setStatus(String status) {
        this.statusTask = status;
    }

    public void setPriority(List<T> priority) {
        this.tasksDividedByStatus = tasksDividedByStatus;
    }

    public void append(T t) {// TODO: 02/08/2022 Ограничить выбор!!
        this.tasksDividedByStatus.add(t);
    }

    @Override
    public String toString() {
        return "StatusTasks{" +
                "statusTask='" + statusTask + '\'' +
                ", tasksDividedByStatus=" + tasksDividedByStatus +
                '}';
    }
}
