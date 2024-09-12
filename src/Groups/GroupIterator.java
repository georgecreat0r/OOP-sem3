package Groups;

import java.util.Iterator;
import java.util.List;

public class GroupIterator implements Iterator<Student> {

    List<Student> students;
    private int index;
    private int lastRet;

    public GroupIterator(Group group) {
        this.index = 0;
        this.lastRet = -1;
        this.students = group.getStudents();
    }

    @Override
    public boolean hasNext() {
        lastRet = -1;
        return index < students.size();
    }

    @Override
    public Student next() {
        if (!hasNext()) {
            return null;
        }
        lastRet = index;
        return students.get(index++);
    }

    @Override
    public void remove() {
        if (lastRet < 0) {
            students.remove(index);
        } else {
            students.remove(lastRet);
            lastRet = -1;
            index--;
        }
    }
}
