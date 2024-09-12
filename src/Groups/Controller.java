package Groups;

import java.util.ArrayList;
import java.util.List;

public class Controller {

    private GroupService gs = new GroupService();

    private StreamService ss = new StreamService();

    // Список потоков.
    List<GroupStream> list = new ArrayList<>();

    // Инициализация потока.
    public GroupStream initStream(int i) {
        return ss.initStream(i);
    }

    // Добавление потока в список.
    public void addStream(GroupStream groupStream) {
        list.add(groupStream);
    }

    // Возвращает список потоков.
    public List<GroupStream> getStreamList() {
        return list;
    }

    // Сортировка списка потоков.
    public List<GroupStream> sortStreamList(List<GroupStream> list) {
        return ss.sortStreamList(list);
    }

    public void removeStudent(String surname, String name, String patronymic, Group group) {
        gs.removeStudent(surname, name, patronymic, group);
    }

    public List<Student> sortById(Group group) {
        return gs.sortById(group);
    }

    public List<Student> sortByName(Group group) {
        return gs.sortByName(group);
    }

}
