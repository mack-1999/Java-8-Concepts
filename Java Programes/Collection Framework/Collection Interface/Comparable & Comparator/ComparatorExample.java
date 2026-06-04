
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ComparatorExample {
    public static void main(String[] args) {
        List<Employee> employeeList = new ArrayList<>();
        employeeList.add(new Employee(3, "Alice"));
        employeeList.add(new Employee(1, "Bob"));
        employeeList.add(new Employee(2, "Charlie"));

        // Sort using Comparator (by ID)
        Collections.sort(employeeList, (e1, e2) -> Integer.compare(e1.id, e2.id));

        System.out.println("Sorted by ID:");
        for (Employee e : employeeList) {
            System.out.println(e.id + " - " + e.name);
        }

        // Sort using Comparator (by Name)
        Collections.sort(employeeList, (e1, e2) -> e1.name.compareTo(e2.name));

        System.out.println("\nSorted by Name:");
        for (Employee e : employeeList) {
            System.out.println(e.id + " - " + e.name);
        }
    }
    
}
