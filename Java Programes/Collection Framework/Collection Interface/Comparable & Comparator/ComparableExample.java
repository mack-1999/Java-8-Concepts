
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ComparableExample {
    public static void main(String[] args) {
        List<Employee> employeeList = new ArrayList<>();
        employeeList.add(new Employee(3, "Alice"));
        employeeList.add(new Employee(1, "Bob"));
        employeeList.add(new Employee(2, "Charlie"));

        Collections.sort(employeeList); //! Sorts based on the compareTo (Employee Names) method in Employee class

        for (Employee e : employeeList) {
            System.out.println(e.id + " - " + e.name);
        }
    }
}

/*
1. Comparable is used for the natural/default sorting of objects and defines sorting logic inside the class using compareTo().
2. Comparator defines external sorting logic using compare() and allows multiple sorting strategies for the same class.
*/
