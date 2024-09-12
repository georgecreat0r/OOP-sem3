package Groups;

import java.util.Iterator;
import java.util.List;

public class GroupStreamIterator implements Iterator<Group> {

    List<Group> groups;
    private int index;
    private int lastRet;

    public GroupStreamIterator(GroupStream groupStream) {
        this.index = 0;
        this.lastRet = -1;
        this.groups = groupStream.getGroups();
    }

    @Override
    public boolean hasNext() {
        lastRet = -1;
        return index < groups.size();
    }

    @Override
    public Group next() {
        if (!hasNext()) {
            return null;
        }
        lastRet = index;
        return groups.get(index++);
    }

    @Override
    public void remove() {
        if (lastRet < 0) {
            groups.remove(index);
        } else {
            groups.remove(lastRet);
            lastRet = -1;
            index--;
        }
    }
}
