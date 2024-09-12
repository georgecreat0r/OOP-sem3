package Groups;

import java.util.Comparator;

public class StudentComparator implements Comparator<Student> {

    @Override
    public int compare(Student o1, Student o2) {
        int res = o1.getSurname().compareTo(o2.getSurname());
        if (res == 0) {
            res = o1.getName().compareTo(o2.getName());
            if (res == 0) {
                return o1.getPatronymic().compareTo(o2.getPatronymic());
            } else {
                return res;
            }
        } else {
            return res;
        }
    }
}
