package ToDoManager.Core.Tasks;

public class Author {
    private String surname;
    private String name;
    private String patronymic;

    /** Авторы и так понятно что к чему */
    public Author(String surname, String name, String patronymic) {
        this.surname = surname;// TODO: 01/08/2022 Подумать может сделать отдельный класс человек
        this.name = name;
        this.patronymic = patronymic;
    }

    public Author() {
    }

    public String getSurname() {
        return surname;
    }

    public String getName() {
        return name;
    }

    public String getPatronymic() {
        return patronymic;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPatronymic(String patronymic) {
        this.patronymic = patronymic;
    }

    public String getResult() {
        return surname + name + patronymic;
    }

    @Override
    public String toString() {
        return "Author{" +
                "surname='" + surname + '\'' +
                ", name='" + name + '\'' +
                ", patronymic='" + patronymic + '\'' +
                '}';
    }
}
