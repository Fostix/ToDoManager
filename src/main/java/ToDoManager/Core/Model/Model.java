package ToDoManager.Core.Model;

import ToDoManager.Core.JSON.*;
import ToDoManager.Core.Tasks.*;
import com.google.gson.Gson;

import java.util.List;
import java.util.Scanner;

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
        Scanner scanner = new Scanner(System.in);
        String testText = scanner.next();// TODO: 01/08/2022 Попробовать обобщит что бы не приводить к конкретному типу!
        //Root root = new Root();
        //root.append(new EverythingTasks());
        //serialize.serialize(root);
        //root.append((List<EverythingTasks>) new EverythingTasks("Делаю", (List<TasksDividedByStatus>) new TasksDividedByStatus("Важно ну прям очень", (List<TasksDividedByPriority>) new TasksDividedByPriority(12, (List<Task>) new Task("А нука сделаю кое что", "сегодня", "завтра", (List<Author>)new Author("Бармалей", "Пармалеев", "Ыкаевкачин"))))));
//        serialize.serialize(new Root("everythingTasks", (List<EverythingTasks>)
//                new EverythingTasks("Делаю",
//                        (List<TasksDividedByStatus>)
//                                new TasksDividedByStatus(
//                                        "Важно ну прям очень",
//                                        (List<TasksDividedByPriority>)
//                                                new TasksDividedByPriority
//                                                        (12, (List<Task>)
//                                                                new Task
//                                                                        ("А нука сделаю кое что",
//                                                                                "сегодня",
//                                                                                "завтра",
//                                                                                (List<Author>)new Author(
//                                                                                        "Бармалей",
//                                                                                        "Пармалеев",
//                                                                                        "Ыкаевкачин"
//                                                                                )))))));
        //Author author = new Author("Бармалей", "Пармалеев", "Ыкаевкачин");
        EverythingTasks everythingTasks = new EverythingTasks("Мурчаль");
        TasksDividedByStatus tasksDividedByStatus = new TasksDividedByStatus("Важно");
        TasksDividedByPriority tasksDividedByPriority = new TasksDividedByPriority(1);
        Author author = new Author("sd", "df", "fd");
        Task task = new Task("ва", "выа", "ва");


//        testRoot.append(
//        everythingTasks.append(
//                tasksDividedByStatus.append(
//                tasksDividedByPriority.append(
//                        task.append(
//                        author
//                )))));

        task.append(author);
        tasksDividedByPriority.append(task);
        tasksDividedByStatus.append(tasksDividedByPriority);
        everythingTasks.append(tasksDividedByStatus);
        testRoot.append(everythingTasks);

        serialize.serialize(testRoot);
        //System.out.println(serialize.serialize(root));
        //serialize.serialize();
    }
}
