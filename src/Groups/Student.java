package Groups;

public class Student implements Comparable<Student> {
    private int id;
    private String name;
    private String surname;
    private String patronymic;
    private int age;

    public Student(int id, String surname, String name, String patronymic, int age) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.patronymic = patronymic;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public String getPatronymic() {
        return patronymic;
    }

    @Override
    public int compareTo(Student student) {
        if (student.id > this.id) {
            return -1;
        } else if (student.id < this.id) {
            return 1;
        } else {
            return 0;
        }
    }

    @Override
    public String toString() {
        return "Уникальный идентификатор студента: " + id +
                "\nФамилия: " + surname +
                "\nИмя: " + name +
                "\nОтчество: " + patronymic +
                "\nВозраст: " + age +
                "\n";
    }
}
