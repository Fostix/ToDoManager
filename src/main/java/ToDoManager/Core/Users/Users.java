package ToDoManager.Core.Users;

public class Users {
    private Id id;
    private String name;
    private String surname;
    private String patronymic;

    public Users(String name, String surname, String patronymic) {
        this.id = new Id();
        this.name = name;
        this.surname = surname;
        this.patronymic = patronymic;
    }

    public Users addUser(String name, String surname, String patronymic) {
        return new Users(name, surname, patronymic);
    }

    /**
     * Need test!!
     */
    @Override
    public boolean equals(Object obj) {
        Users user = (Users) obj;
        return this.id == user.id;
    }

    public int getId() {
        return this.id.getId();
    }

    @Override
    public String toString() {
        return String.format("%d %s %s %s", this.id.getId(), this.name, this.surname, this.patronymic);
    }
}
