package Groups;

import java.util.Comparator;

public class StreamComparator implements Comparator<GroupStream> {


    @Override
    public int compare(GroupStream o1, GroupStream o2) {
        int a = o1.getCount();
        int b = o2.getCount();

        if (a > b) {
            return 1;
        } else if (a < b) {
            return -1;
        } else {
            return 0;
        }
    }
}
