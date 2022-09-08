package ToDoManager.Core.Tasks;

import java.util.ArrayList;
import java.util.List;

public class Root<E extends EverythingTasks>{
    private String storageAllTasks;
    private List<E> everythingTasks = new ArrayList<>();

    /** Корень
     * @param storageAllTasks Начало
     * @param e Список всех заданий*/
    public Root(String storageAllTasks, List<E> e) {
        this.storageAllTasks = storageAllTasks;// TODO: 01/08/2022 Подумать как изменить 
        this.everythingTasks = e;
    }

    public Root(String storageAllTasks) {
        this.storageAllTasks = storageAllTasks;
    }

    public Root() {
    }

    public String getStorageAllTasks() {
        return storageAllTasks;
    }

    public void setStorageAllTasks(String storageAllTasks) {
        this.storageAllTasks = storageAllTasks;
    }

    public List<E> getEverythingTasks() {
        return everythingTasks;
    }

    public void setEverythingTasks(List<E> e) {
        this.everythingTasks = e;
    }

    public void append(E e) {
        this.everythingTasks.add(e);
    }

    @Override
    public String toString() {
        return "Root{" +
                "storageAllTasks='" + storageAllTasks + '\'' +
                ", everythingTasks=" + everythingTasks +
                '}';
    }
}
