package ToDoManager.Core.JSON;

import ToDoManager.Core.Tasks.StatusTasks;
import com.google.gson.Gson;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class GsonParse {
    public StatusTasks parse() {
        Gson gson = new Gson();

        try (FileReader reader = new FileReader(FileWayStorage.WAY_TO_DO)){
            StatusTasks statusTasks = gson.fromJson(reader, StatusTasks.class);
            return statusTasks;
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
