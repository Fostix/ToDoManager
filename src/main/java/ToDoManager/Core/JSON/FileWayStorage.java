package ToDoManager.Core.JSON;

import java.io.File;

public interface FileWayStorage {
    File WAY_TO_DO = new File("src/main/java/ToDoManager/Storage/tasks.json");
    File FOLDER_STORAGE = new File("src/main/java/ToDoManager/Storage");
}
