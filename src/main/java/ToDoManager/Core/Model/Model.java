package ToDoManager.Core.Model;

import ToDoManager.Core.JSON.*;
import ToDoManager.Core.Tasks.StatusTasks;

public class Model {
    CheckFile checkStorageTasks = new CheckFile();
    ImportAndExport importAndExport = new ImportAndExport();
    CreateFileStorage createFileStorage = new CreateFileStorage();
    WriteInFile addTask = new WriteInFile();

    public boolean checkStorageTasks() {
        return checkStorageTasks.checkFile(FileWayStorage.WAY_TO_DO);
    }

    public boolean importAndExport() {
        return importAndExport.importAndExport(FileWayStorage.FOLDER_STORAGE);
    }

    public boolean createFileStorage() {
        return createFileStorage.createFileStorage(FileWayStorage.WAY_TO_DO);
    }

    public boolean addTask(String text) {
        return addTask.addTask(FileWayStorage.WAY_TO_DO, text);
    }

    public void readFile() {
        GsonParse parse = new GsonParse();
        StatusTasks statusTasks = parse.parse();

        System.out.println("Status_tasks" + statusTasks.toString());
    }
}
