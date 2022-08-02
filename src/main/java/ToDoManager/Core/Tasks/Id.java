package ToDoManager.Core.Tasks;

import java.util.Objects;
import java.util.Random;

public class Id { // TODO: 02/08/2022 Не сработало подумать почему? ну или забросить :) 
    private int id;

    public Id() {
        Random r = new Random();
        this.id = r.nextInt(100000);
        getId();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Id id1 = (Id) o;
        return id == id1.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    public int getId() {
        return id;
    }

    @Override
    public String toString() {
        return "Id{" +
                "id=" + id +
                '}';
    }
}
