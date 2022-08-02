package ToDoManager.Core.Tasks;

import java.util.ArrayList;
import java.util.List;

public class TasksDividedByPriority {
    private int id;
    private List<Task> task = new ArrayList<>();

    /** Задания поделенные по приоритетам
     * @param id идентификатор
     * @param task конкретное задание по идентификатору*/
    public TasksDividedByPriority(int id, List<Task> task) {
        this.id = id;// TODO: 01/08/2022 Сделать не ручной ввод!
        this.task = task;
    }

    public TasksDividedByPriority(int id) {
        this.id = id;
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

    public void append(Task task) {
        this.task.add(task);
    }

    @Override
    public String toString() {
        return "PriorityTasks{" +
                "id=" + id +
                ", task=" + task +
                '}';
    }
}
