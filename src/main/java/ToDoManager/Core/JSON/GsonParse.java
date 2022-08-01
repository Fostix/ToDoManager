package ToDoManager.Core.JSON;

import ToDoManager.Core.Tasks.Root;
import com.google.gson.Gson;

import java.io.BufferedReader;
import java.io.FileReader;

public class GsonParse{
    public Root parse() {
        Gson gson = new Gson();

        try (BufferedReader reader = new BufferedReader(new FileReader(FileWayStorage.WAY_TO_DO.toString()))) {
            Root statusTasks = gson.fromJson(reader, Root.class);
            return statusTasks;
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
