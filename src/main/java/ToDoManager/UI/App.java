package ToDoManager.UI;


import ToDoManager.Core.Model.Presenter;

import java.util.Scanner;

public class App {
    public void menu() {
        int enter;
        Scanner scanner = new Scanner(System.in);
        System.out.println("----Система включена----");
        Presenter presenter = new Presenter(new ConsoleView());
        System.out.print("\033[H\033[2J"); // не работает !!
        while (true) {
            try {
                enter = scanner.nextInt();
                switch (enter) {
                    case 0:
                        System.out.println("----Система выключена----");
                        return;
                    case 2:
                        System.out.println("Просмотреть список задач");
                        presenter.readFile();
                        break;
                    case 9:
                        System.out.println("Приготовьтесь, включается режим импорта и экспорта");
                        Thread.sleep(2500);
                        System.out.println("----Включен режим импорт и экспорт 😁----");
                        presenter.importAndExport();
                        break;
                    case 3:
                        System.out.println("Добавить задачу");
                        presenter.addTask();
                        break;
                    default:
                        System.out.println("Смотри внимательнее куда нажимаешь 😡!!");
                }
            } catch (InterruptedException e) {
                System.out.println("Что то пошло не так!!");
                throw new RuntimeException(e);
            }
            System.out.print("\033[H\033[2J"); // не работает !!
        }
    }
}
