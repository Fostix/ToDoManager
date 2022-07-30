package ToDoManager.Core.JSON;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class WriteInFile {
    public boolean addTask(File file, String text) {
        try {
            FileWriter d = new FileWriter(file);
            d.write(text);
            //d.append(text);
            d.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return false;
    }
}
