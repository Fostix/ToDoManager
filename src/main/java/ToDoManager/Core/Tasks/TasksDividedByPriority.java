package ToDoManager.Core.Tasks;

import java.util.ArrayList;
import java.util.List;

public class TasksDividedByPriority<T extends Task> {
    private int id;
    private List<T> task = new ArrayList<>();

    /** Задания поделенные по приоритетам
     * @param t конкретное задание по идентификатору*/
    public TasksDividedByPriority(int id, List<T> t) {
        this.id = id;// TODO: 01/08/2022 Сделать не ручной ввод!
        this.task = t;
    }

    public TasksDividedByPriority(int id) {
        this.id = id;
    }

    public List<T> getTask() {
        return task;
    }

    public void setTask(List<T> t) {
        this.task = t;
    }

    public void append(T t) {
        this.task.add(t);
    }

    @Override
    public String toString() {
        return "PriorityTasks{" +
                "id=" + id +
                ", task=" + task +
                '}';
    }
}
