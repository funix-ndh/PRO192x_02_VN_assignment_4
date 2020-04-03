import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * HumanResources
 */
class HumanResources {
    public static void main(final String[] args) {
        // welcome message
        System.out.println("Welcome to the human resources software");

        // choice number
        Integer choice;

        // exit flag
        Boolean shouldExit = false;

        // scanner
        final Scanner scanner = new Scanner(System.in);

        do {
            System.out.println("------------------------------------------------------------");
            System.out.println("1. Display employees");
            System.out.println("2. Display departments");
            System.out.println("3. Display employees by departments");
            System.out.println("4. Enter a new employee");
            System.out.println("5. Search employees by name or id");
            System.out.println("6. Display salary");
            System.out.println("7. Display salary by order ascending");
            System.out.print("Your choice: ");
            choice = scanner.nextInt();
            scanner.nextLine();
            switch (choice) {
                case 1:
                    displayEmployees();
                    break;
                case 2:
                    displayDepartments();
                    break;
                case 3:
                    displayEmployeesByDepartment();
                    break;
                case 4:
                    addEmployee(scanner);
                    break;
                case 5:
                    searchByKeyword(scanner);
                    break;
                case 6:
                    displaySalary(false);
                    break;
                case 7:
                    displaySalary(true);
                    break;
                case 8:
                    shouldExit = true;
                    break;
                default:
                    System.out.println("Please choose number [1, 2, 3, 4, 5, 6, 7, 8].");
                    break;
            }
        } while (!shouldExit);
        System.out.println("Thank you!");
        System.out.println("Goodbye, see you again!");
    }

    // show all employees
    private static void displayEmployees() {
        System.out.println();
        EmployeeList.display();
        System.out.println();
        ManagerList.display();
    }

    // show all departments
    private static void displayDepartments() {
        System.out.println();
        DepartmentList.display();
    }

    // show all employees by department
    private static void displayEmployeesByDepartment() {
        for (final Department department : DepartmentList.getAll()) {
            System.out.println();
            EmployeeList.displayByDepartment(department.getName());
            System.out.println();
            ManagerList.displayByDepartment(department.getName());
        }
    }

    // add employee
    private static void addEmployee(final Scanner scanner) {
        System.out.print("Employee or Manager (1 = Employee, 2 = Manager): ");

        // get choice
        final Integer choice = scanner.nextInt();
        scanner.nextLine();

        // get id
        System.out.print("Enter ID: ");
        final String id = scanner.nextLine();

        // get name
        System.out.print("Enter Name: ");
        final String name = scanner.nextLine();

        // get age
        System.out.print("Enter Age: ");
        final Integer age = scanner.nextInt();
        scanner.nextLine();

        // get salary scale
        System.out.print("Enter Salary Scale: ");
        final Double salaryScale = scanner.nextDouble();
        scanner.nextLine();

        // get start date
        System.out.print("Enter StartDate: ");
        final String startDate = scanner.nextLine();

        // get department
        System.out.print("Enter Department: ");
        final String department = scanner.nextLine();

        // get annual leave
        System.out.print("Enter Annual Leave: ");
        final Integer annualLeave = scanner.nextInt();
        scanner.nextLine();

        if (choice == 1) {
            // get overtime
            System.out.print("Enter Overtime: ");
            final Integer overTime = scanner.nextInt();
            EmployeeList.add(
                    new Employee(id, name, age, salaryScale, startDate, department, annualLeave, overTime));
        } else {
            // get title
            System.out.print("Enter Title: ");
            final String title = scanner.nextLine();
            ManagerList.add(
                    new Manager(id, name, age, salaryScale, startDate, department, annualLeave, title));
        }

        System.out.println("Add employee successful");
    }

    private static void searchByKeyword(final Scanner scanner) {
        System.out.println();

        // get search keyword
        System.out.print("Enter keyword: ");
        final String keyword = scanner.nextLine();

        System.out.println();
        EmployeeList.search(keyword); // find employees

        System.out.println();
        ManagerList.search(keyword); // find managers
    }

    private static void displaySalary(final Boolean isShort) {
        System.out.println();

        // print header
        System.out.println(String.format("%-10s%-15s%-20s\n%s", "ID", "Name", "Salary",
                "------------------------------------------------------------"));

        // construct list calculator data
        final List<ICalculator> calculators = new ArrayList<>();
        calculators.addAll(EmployeeList.getAll());
        calculators.addAll(ManagerList.getAll());

        // short data
        if (isShort) {
            calculators.sort((c1, c2) -> (int) (c1.calculateSalary() - c2.calculateSalary()));
        }

        // print data
        for (final ICalculator c : calculators) {
            System.out.println(String.format("%-10s%-15s%-20.2f", c.getId(), c.getName(), c.calculateSalary()));
        }
    }
}
