package ToDoManager.Core.Model;

import ToDoManager.Core.JSON.*;
import ToDoManager.Core.Tasks.Root;
import com.google.gson.Gson;

public class Model {
    CheckFile checkStorageTasks = new CheckFile();
    ImportAndExport importAndExport = new ImportAndExport();
    CreateFileStorage createFileStorage = new CreateFileStorage();


    public boolean checkStorageTasks() {
        return checkStorageTasks.checkFile(FileWayStorage.WAY_TO_DO);
    }

    public boolean importAndExport() {
        return importAndExport.importAndExport(FileWayStorage.FOLDER_STORAGE);
    }

    public boolean createFileStorage() {
        return createFileStorage.createFileStorage(FileWayStorage.WAY_TO_DO);
    }

    /** Выводит список заданий*/
    public Root readFile() {
        return new GsonParse().parse();
    }

    /** Записывает задание в Storage*/
    public void createTask(String text) {
        System.out.println(text);
        GsonSerialize serialize = new GsonSerialize();
        Root root = new Root();
        System.out.println(serialize.serialize(root));
        //serialize.serialize();
    }
}
