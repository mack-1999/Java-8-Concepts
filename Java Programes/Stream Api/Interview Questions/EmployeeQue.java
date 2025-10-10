import java.util.*;
import java.util.stream.Collectors;

public class EmployeeQue {
    public static void main(String[] args) {
        List<Employee> emp = new ArrayList<>();
        emp.add(new Employee("Mack",25,"M",30000));
        emp.add(new Employee("Giny",45,"F",90000));
        emp.add(new Employee("Jack",35,"M",55000));
        emp.add(new Employee("Lilly",30,"F",90000));
        emp.add(new Employee("Stan",45,"M",90000));
        emp.add(new Employee("Rutu",23,"F",25000));
        emp.add(new Employee("Jack",23,"M",25000));

        //! Print employees with same Salary/Name etc.
        Map<Integer, List<Employee>> groupBySalary = emp.stream().collect(Collectors.groupingBy(Employee::getSalary));

        //System.out.println(groupBySalary);

        groupBySalary.entrySet().stream().filter(e -> e.getValue().size() > 1).forEach(
            e -> {
                System.out.println("Employees with same Salary "+ e.getKey() + ":");
                e.getValue().forEach(System.out::println);
                System.out.println(); // For New line
            }
        );

        //!  Print highest paid employee based on gender
        //List<Employee> highPaid = emp.stream().collect(Collectors.groupingBy(Employee::getGender)).values().stream().map(e -> e.stream().max(Comparator.comparing(Employee::getSalary)).orElse(null)).collect(Collectors.toList());
        
        //! Print only distinct Gender
        //emp.stream().map(Employee::getGender).distinct().forEach(System.out::println);

        //! Print avg employee salary based on gender
        // Map<String, Double> avgSal = emp.stream().collect(Collectors.groupingBy(Employee::getGender, Collectors.averagingDouble(Employee::getSalary)));
        // System.out.println(avgSal);

        //! Print total count of F & M employees
        // Map<String, Long> count = emp.stream().collect(Collectors.groupingBy(Employee::getGender, Collectors.counting()));
        // System.out.println(count);

    }
}