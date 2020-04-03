import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * DepartmentList
 */
class DepartmentList {

    // initial data
    final private static List<Department> departments = new ArrayList<>(Arrays.asList(
            new Department("D1", "Development", 8),
            new Department("D2", "IT", 1),
            new Department("D3", "Account", 2)));

    // get all data
    static List<Department> getAll() {
        return departments;
    }

    // display data
    static void display() {
        System.out.println(Department.getHeader());
        for (final Department e : departments) {
            System.out.println(e);
        }
    }
}
