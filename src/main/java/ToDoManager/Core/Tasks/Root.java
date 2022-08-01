package ToDoManager.Core.Tasks;

import java.util.ArrayList;
import java.util.List;

public class Root {
    private String storageAllTasks;
    private List<EverythingTasks> everythingTasks = new ArrayList<>();

    public Root(String storageAllTasks, List<EverythingTasks> everythingTasks) {
        this.storageAllTasks = storageAllTasks;
        this.everythingTasks = everythingTasks;
    }

    public Root() {
    }

    public String getStorageAllTasks() {
        return storageAllTasks;
    }

    public void setStorageAllTasks(String storageAllTasks) {
        this.storageAllTasks = storageAllTasks;
    }

    public List<EverythingTasks> getEverythingTasks() {
        return everythingTasks;
    }

    public void setEverythingTasks(List<EverythingTasks> everythingTasks) {
        this.everythingTasks = everythingTasks;
    }

    public void append(EverythingTasks everythingTasks) {
        this.everythingTasks.add(everythingTasks);
    }

    @Override
    public String toString() {
        return "Root{" +
                "storageAllTasks='" + storageAllTasks + '\'' +
                ", everythingTasks=" + everythingTasks +
                '}';
    }
}
