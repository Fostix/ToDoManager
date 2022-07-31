package ToDoManager.Core.Model;

public class Presenter {
    private Model model;
    private View view;

    public Presenter(View view) {
        this.view = view;
        model = new Model();
    }

    public boolean checkFiles() {
        if (model.checkStorageTasks()) {
            view.haveStorageFileTasks();
            return true;
        } else {
            view.doNotHaveStorageFileTasks();
            return false;
        }
    }

    public void importAndExport() {
        if (!model.importAndExport()) {
            view.cannotImportAndExport();
        }
    }

    public void createFileStorage() {
        if (model.createFileStorage()){
            view.goodCreateFileStorageTasks();
        } else
            view.cannotCreateFileStorageTasks();
    }

    public void addTask() {
        String text = view.addTask();
        model.addTask(text);
    }

    public void readFile() {
        model.readFile();
    }
}