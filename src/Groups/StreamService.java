package Groups;

import java.util.ArrayList;
import java.util.List;

public class StreamService {

    // Создание потока
    protected GroupStream initStream(int i) {
        return new GroupStream(i);
    }

    // Сортировка по количеству групп в потоке.
    protected List<GroupStream> sortStreamList(List<GroupStream> list) {
        List<GroupStream> copy = new ArrayList<>(list);
        copy.sort(new StreamComparator()); // Используется компаратор.
        return copy;
    }
}
