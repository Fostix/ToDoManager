package ToDoManager.UI;

import java.util.Scanner;

public class BIOS {
    public void bios() {
        Scanner scanner = new Scanner(System.in);
        //App app = new App();
        OS os = new OS();
        while (true) {
            int enter;
            System.out.println("----Нажмите 1 что бы включить программу----");
            enter = scanner.nextInt();
            if (enter == 1) {
                os.oning();
                //app.menu();
            }
        }
    }
}
