package ToDoManager.Core.Users;

import java.util.Random;

public class Id {
    private final int number;
    public Id() {
        Random r = new Random();
        this.number = r.nextInt(100);
        getId();
        System.out.println(getId());
    }

    public int getId() {
        return this.number;
    }

    @Override
    public String toString() {
        return String.valueOf(getId());
    }
}
