package ToDoManager.Core.JSON;

import java.awt.*;
import java.io.File;

public class ImportAndExport{
    public boolean importAndExport(File file) {
        Desktop desktop = Desktop.getDesktop();
        File dirToOpen;
        boolean flag = false;
        try {
            dirToOpen = new File(String.valueOf(file));
            desktop.open(dirToOpen);
            flag = true;
        } catch (Exception e) {
            System.out.println("File Not Found");
            throw new RuntimeException(e);
        }
        return flag;
    }
}
