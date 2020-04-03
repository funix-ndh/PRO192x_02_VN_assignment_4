import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * EmployeeList
 */
class EmployeeList {

    // initial data
    final private static List<Employee> employees = new ArrayList<>(Arrays.asList(
            new Employee("E1", "Scott", 29, 2.0, "28-10-2019", "Development", 10, 9),
            new Employee("E2", "John", 32, 1.5, "08-01-2018", "IT", 7, 0),
            new Employee("E3", "Lily", 28, 1.4, "12-08-2019", "Account", 5, 0),
            new Employee("E4", "Nicole", 27, 1.8, "03-02-2019", "Development", 12, 5),
            new Employee("E5", "Bob", 30, 1.9, "15-03-2020", "Account", 10, 0),
            new Employee("E6", "Nick", 26, 1.7, "13-12-2019", "Development", 10, 0),
            new Employee("E7", "Tom", 27, 1.6, "30-01-2019", "Development", 5, 5),
            new Employee("E8", "Marshall", 28, 1.3, "01-02-2020", "Development", 8, 0)));

    // display data
    static void display() {
        System.out.println("Employee list:");
        System.out.println(Employee.getHeader());
        for (final Employee e : employees) {
            System.out.println(e);
        }
    }

    // display by department
    static void displayByDepartment(final String department) {
        final List<Employee> foundEmployees = new ArrayList<>();

        // find department name
        for (final Employee e : employees) {
            if (e.getDepartment().equalsIgnoreCase(department)) {
                foundEmployees.add(e);
            }
        }

        // print data
        if (!foundEmployees.isEmpty()) {
            System.out.println(department + " Employee");
            System.out.println(Employee.getHeader());
            for (final Employee e : foundEmployees) {
                System.out.println(e);
            }
        }
    }

    static void search(final String keyword) {
        final List<Employee> foundEmployees = new ArrayList<>();

        // find by id and name
        for (final Employee e : employees) {
            if (e.getId().contains(keyword) || e.getName().contains(keyword)) {
                foundEmployees.add(e);
            }
        }

        // print data
        if (!foundEmployees.isEmpty()) {
            System.out.println("Employees:");
            System.out.println(Employee.getHeader());
            for (final Employee e : foundEmployees) {
                System.out.println(e);
            }
        } else {
            System.out.println("Employee not found.");
        }
    }

    // add data to list
    static void add(final Employee e) {
        employees.add(e);
    }

    // get all data
    static List<Employee> getAll() {
        return employees;
    }
}
