package ToDoManager.Core.Tasks;

import java.util.ArrayList;
import java.util.List;

public class TasksDividedByStatus<T extends TasksDividedByPriority> {
    private String priority;
    private List<T> tasksDividedByPriority = new ArrayList<>();

    // TODO: 01/08/2022 Так кажется я запутался?!?!?
    /** Задания распределённые по приоритетам.
     * @param priority Приоритеты.
     * @param t Список заданий распределённые по приоритетам.*/
    public TasksDividedByStatus(String priority, List<T> t) {
        this.priority = priority;// TODO: 01/08/2022 Приоритеты изменить! 
        this.tasksDividedByPriority = t;
    }

    public TasksDividedByStatus(String priority) {
        this.priority = priority;
    }

    public TasksDividedByStatus() {
    }

    public String getPriority() {
        return priority;
    }

    public List<T> getTasksDividedByPriority() {
        return tasksDividedByPriority;
    }

    public void setPriority(String priority) {
        this.priority = priority;
    }

    public void setTasksDividedByPriority(List<T> t) {
        this.tasksDividedByPriority = t;
    }

    public void append(T t) {
        this.tasksDividedByPriority.add(t);
    }

    @Override
    public String toString() {
        return "Priority{" +
                "priority='" + priority + '\'' +
                ", tasksDividedByPriority=" + tasksDividedByPriority +
                '}';
    }
}
