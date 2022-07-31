package ToDoManager.Core.JSON;

import ToDoManager.Core.Tasks.StatusTasks;
import com.google.gson.Gson;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

public class GsonParse {
    public StatusTasks parse() {
        Gson gson = new Gson();

        try (FileReader reader = new FileReader(FileWayStorage.WAY_TO_DO)) {
            StatusTasks statusTasks = gson.fromJson(reader, StatusTasks.class);
            List list = new ArrayList<>();
            list.add(gson.fromJson(reader, StatusTasks.class));
            System.out.println(list);
            System.out.println(statusTasks);
            return statusTasks;
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
