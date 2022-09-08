package ToDoManager.Core.JSON;

import java.io.File;
import java.io.IOException;

public class CreateFileStorage {
    public boolean createFileStorage(File file) {
        try {
            file.createNewFile();
            return true;
        } catch (IOException e) {
            return false;
        }
    }
}
