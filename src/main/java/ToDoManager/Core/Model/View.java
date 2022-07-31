package ToDoManager.Core.Model;

public interface View {
    void haveStorageFileTasks();
    void doNotHaveStorageFileTasks();
    void cannotImportAndExport();
    void goodCreateFileStorageTasks();
    void cannotCreateFileStorageTasks();
    String addTask();

    void showTask(String text);
}
