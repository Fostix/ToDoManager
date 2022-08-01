package ToDoManager.Core.JSON;

import ToDoManager.Core.Tasks.Root;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class GsonSerialize {
    public Root serialize(Root root) {
        try(BufferedWriter writer = new BufferedWriter(new FileWriter((FileWayStorage.WAY_TO_DO.toString())))) {
            Gson gson = new GsonBuilder().setPrettyPrinting().create();
            gson.toJson(root, writer);
        } catch (IOException e) {
            System.out.println("Serialize error" + e.toString());
            throw new RuntimeException(e);
        }
        return null;
    }
}
