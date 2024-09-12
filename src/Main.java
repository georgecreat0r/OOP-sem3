import Groups.Controller;
import Groups.Group;
import Groups.GroupStream;
import Groups.Student;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Student s = new Student(001, "Иванов", "Пётр", "Алексеевич", 22);
        Student s1 = new Student(002, "Максимов", "Дмитрий", "Михайлович", 23);
        Student s2 = new Student(003, "Волков", "Сергей", "Викторович", 22);
        Student s3 = new Student(004, "Фёдоров", "Александр", "Фёдорович", 23);
        Student s4 = new Student(005, "Попов", "Евгений", "Дмитриевич", 22);

        Group group1 = new Group(1, 2022);
        group1.addStudent(s);
        group1.addStudent(s3);
        group1.addStudent(s2);
        group1.addStudent(s1);
        group1.addStudent(s4);

        // Экземпляр для контроллера.
        Controller con = new Controller();

        System.out.println("----Изначальный список----");
        group1.printStudents();
        System.out.println("\n----Отсортировано по id----");
        printList(con.sortById(group1));
        System.out.println("\n----Отсортировано по имени----");
        printList(con.sortByName(group1));
        System.out.println("\n----Удалено по имени----");
        con.removeStudent("Фёдоров", "Александр", "Фёдорович", group1);
        group1.printStudents();


        // Создание потоков через экземпляр контроллёра.
        GroupStream gs1 = con.initStream(1);
        GroupStream gs2 = con.initStream(2);
        GroupStream gs3 = con.initStream(3);

        // Заполнение потоков.
        gs1.addGroup(new Group(2, 2022));
        gs1.addGroup(new Group(3, 2022));
        gs1.addGroup(new Group(4, 2023));
        gs1.addGroup(new Group(5, 2023));

        gs2.addGroup(new Group(6, 2023));
        gs2.addGroup(new Group(7, 2023));
        gs2.addGroup(new Group(8, 2023));

        gs3.addGroup(new Group(9, 2024));

        // Добавление потоков в список.
        con.addStream(gs1);
        con.addStream(gs2);
        con.addStream(gs3);

        // Список потоков
        System.out.println("ДОМАШНЕЕ ЗАДАНИЕ\n----Список потоков----");
        printStreamList(con.getStreamList());

        // Сортировка списка потоков.
        System.out.println("----Список потоков после сортировки по количеству групп----");
        printStreamList(con.sortStreamList(con.getStreamList()));
    }

    // Печать списка потоков.
    public static void printStreamList(List<GroupStream> list) {
        for (GroupStream gs : list) {
            System.out.println(gs + "\n");
        }
    }

    public static void printList(List<Student> students) {
        for (Student student : students) {
            System.out.println(student + "\n");
        }
    }

}