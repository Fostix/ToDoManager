package ToDoManager.Core.JSON;

import java.io.File;

public class CheckFile {
    public boolean checkFile(File file) {
        return file.isFile();
    }
}
