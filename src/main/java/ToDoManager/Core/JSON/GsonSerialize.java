package ToDoManager.Core.JSON;

import ToDoManager.Core.Tasks.Root;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class GsonSerialize<R extends Root> {
    /** @param r Root корень сообщения*/
    public Root serialize(R r) {
        try(BufferedWriter writer = new BufferedWriter(new FileWriter((FileWayStorage.WAY_TO_DO.toString())))) {
            Gson gson = new GsonBuilder().setPrettyPrinting().create();
            gson.toJson(r, writer);
        } catch (IOException e) {
            System.out.println("Serialize error" + e.toString());
            throw new RuntimeException(e);
        }
        return null;
    }
}
