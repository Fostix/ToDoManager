package ToDoManager.Core.Tasks;

import java.util.ArrayList;
import java.util.List;

public class Task {
    private String toDo;
    private String startDateAndTime;
    private String finishDateAndTime;
    private List<Author> author = new ArrayList<>();

    /** Добавить задание
     * @param toDo Какое задание?
     * @param startDateAndTime Время добавления
     * @param finishDateAndTime Время окончания*/
    public Task(String toDo, String startDateAndTime, String finishDateAndTime, List<Author> author) {
        this.toDo = toDo;
        this.startDateAndTime = startDateAndTime;
        this.finishDateAndTime = finishDateAndTime;
        this.author = author;
    }

    public Task(String toDo, String startDateAndTime, String finishDateAndTime) {
        this.toDo = toDo;
        this.startDateAndTime = startDateAndTime;
        this.finishDateAndTime = finishDateAndTime;
    }

    public Task() {
    }

    public String getToDo() {
        return toDo;
    }

    public String getStartDateAndTime() {
        return startDateAndTime;
    }

    public String getFinishDateAndTime() {
        return finishDateAndTime;
    }

    public List<Author> getAuthor() {
        return author;
    }

    public void setToDo(String toDo) {
        this.toDo = toDo;
    }

    public void setStartDateAndTime(String startDateAndTime) {
        this.startDateAndTime = startDateAndTime;
    }

    public void setFinishDateAndTime(String finishDateAndTime) {
        this.finishDateAndTime = finishDateAndTime;
    }

    public void setAuthor(List<Author> author) {
        this.author = author;
    }

    public void append(Author author) {
        this.author.add(author);
    }

    @Override
    public String toString() {
        return "Task{" +
                "toDo='" + toDo + '\'' +
                ", startDateAndTime='" + startDateAndTime + '\'' +
                ", finishDateAndTime='" + finishDateAndTime + '\'' +
                ", author=" + author +
                '}';
    }
}
