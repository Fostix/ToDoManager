package ToDoManager.Core.JSON;

import java.awt.*;
import java.io.File;
import java.io.IOException;

public class ImportAndExport{
    public boolean importAndExport(File file) {
        Desktop desktop = Desktop.getDesktop();
        File dirToOpen;
        boolean flag = false;
        try {
            dirToOpen = new File(String.valueOf(file));
            desktop.open(dirToOpen);
            flag = true;
        } catch (IllegalArgumentException iae) {
            System.out.println("File Not Found");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return flag;
    }
}
