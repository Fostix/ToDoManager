package ToDoManager.Core.Tasks;

import java.util.ArrayList;
import java.util.List;

public class TasksDividedByStatus {
    private String priority;
    private List<TasksDividedByPriority> tasksDividedByPriority = new ArrayList<>();

    // TODO: 01/08/2022 Так кажется я запутался?!?!?
    /** Задания распределённые по приоритетам.
     * @param priority Приоритеты.
     * @param priorityTasks Список заданий распределённые по приоритетам.*/
    public TasksDividedByStatus(String priority, List<TasksDividedByPriority> priorityTasks) {
        this.priority = priority;// TODO: 01/08/2022 Приоритеты изменить! 
        this.tasksDividedByPriority = priorityTasks;
    }

    public TasksDividedByStatus(String priority) {
        this.priority = priority;
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

    public void append(TasksDividedByPriority tasksDividedByPriority) {
        this.tasksDividedByPriority.add(tasksDividedByPriority);
    }

    @Override
    public String toString() {
        return "Priority{" +
                "priority='" + priority + '\'' +
                ", tasksDividedByPriority=" + tasksDividedByPriority +
                '}';
    }
}
