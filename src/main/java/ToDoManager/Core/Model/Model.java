package ToDoManager.Core.Model;

import ToDoManager.Core.JSON.*;
import ToDoManager.Core.Tasks.*;

import java.util.Random;

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
        Root testRoot = readFile();
        System.out.println(text);
        GsonSerialize serialize = new GsonSerialize();
        EverythingTasks<TasksDividedByStatus> everythingTasks = new EverythingTasks("Мурчаль");
        TasksDividedByStatus<TasksDividedByPriority> tasksDividedByStatus = new TasksDividedByStatus("Важно");
        TasksDividedByPriority<Task> tasksDividedByPriority = new TasksDividedByPriority(new Random().nextInt(10000));
        Task<Author> task = new Task("впавап", "выывпаавапыа", "ваывапвапва");
        Author author = new Author("sd", "df", "fd");
        task.append(author);
        tasksDividedByPriority.append(task);
        tasksDividedByStatus.append(tasksDividedByPriority);
        everythingTasks.append(tasksDividedByStatus);
        testRoot.append(everythingTasks);
        serialize.serialize(testRoot);
    }
}
