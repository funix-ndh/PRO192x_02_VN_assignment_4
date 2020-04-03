import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * ManagerList
 */
class ManagerList {

    // initial data
    final private static List<Manager> managers = new ArrayList<>(Arrays.asList(
            new Manager("M1", "Ryan", 40, 2.0, "15-11-2017", "Development", 5, "Technical Leader"),
            new Manager("M2", "Walter", 42, 1.8, "04-12-2018", "Development", 0, "Business Leader"),
            new Manager("M3", "Jessie", 38, 2.2, "22-07-2017", "Development", 10, "Project Leader")));

    // display data
    static void display() {
        System.out.println("Manager list:");
        System.out.println(Manager.getHeader());
        for (final Manager m : managers) {
            System.out.println(m);
        }
    }

    // display by department
    static void displayByDepartment(final String department) {
        final List<Manager> foundManagers = new ArrayList<>();

        // find department name
        for (final Manager m : managers) {
            if (m.getDepartment().equalsIgnoreCase(department)) {
                foundManagers.add(m);
            }
        }

        // print data
        if (!foundManagers.isEmpty()) {
            System.out.println(department + " Manager");
            System.out.println(Manager.getHeader());
            for (final Manager m : foundManagers) {
                System.out.println(m);
            }
        }
    }

    static void search(final String keyword) {
        final List<Manager> foundManagers = new ArrayList<>();

        // find by id and name
        for (final Manager m : managers) {
            if (m.getId().contains(keyword) || m.getName().contains(keyword)) {
                foundManagers.add(m);
            }
        }

        // print data
        if (!foundManagers.isEmpty()) {
            System.out.println("Managers:");
            System.out.println(Manager.getHeader());
            for (final Manager m : foundManagers) {
                System.out.println(m);
            }
        } else {
            System.out.println("Manager not found.");
        }
    }

    // add data to list
    static void add(final Manager m) {
        managers.add(m);
    }

    // get all data
    static List<Manager> getAll() {
        return managers;
    }
}
