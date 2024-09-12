package Groups;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class GroupStream implements Iterable<Group> {

    int i; // Номер потока.
    int count; // Количество групп.

    private List<Group> groups = new ArrayList<>();

    public GroupStream(int i) {
        this.i = i;
    }

    public void addGroup(Group group) {
        groups.add(group);
        count++;
    }

    public List<Group> getGroups() {
        return groups;
    }

    public int getCount() {
        return count;
    }

    @Override
    public Iterator<Group> iterator() {
        return new GroupStreamIterator(this);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();

        Iterator<Group> iterator = this.iterator();
        while (iterator.hasNext()) {
            sb.append(iterator.next()).append('\n');
        }

        return "В потоке № " + i +
                "\nКоличество групп: " + count + "\n\n" +
                sb;

    }
}
