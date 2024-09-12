package Groups;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class GroupService {

    protected void removeStudent(String surname, String name, String patronymic, Group group) {
        Iterator<Student> iterator = group.iterator();
        while (iterator.hasNext()) {
            Student student = iterator.next();
            if (student.getSurname().equals(surname) && student.getName().equals(name) && student.getPatronymic().equals(patronymic)) {
                iterator.remove();
            }
        }
    }

    protected List<Student> sortById(Group group) {
        List<Student> res = new ArrayList<>(group.getStudents());
        res.sort(Student::compareTo);
        return res;
    }

    protected List<Student> sortByName(Group group) {
        List<Student> res = new ArrayList<>(group.getStudents());
        res.sort(new StudentComparator());
        return res;
    }
}
