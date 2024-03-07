import java.util.*;
import java.util.stream.Collectors;

public class StreamsQue {
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

        Patient p1 = new Patient("P1",25,"Corona",20000);
        Patient p2 = new Patient("P2",35,"Fever",2000);
        Patient p3 = new Patient("P3",43,"Corona",60000);
        Patient p4 = new Patient("P4",58,"Corona",90000);

        List<Patient> patientList = Arrays.asList(p1, p2, p3, p4);

        //! Print all the patient suffering from corona
        //patientList.stream().filter(p -> p.getDisease().equals("Corona")).forEach(System.out::println);

        //! Print all patient age < 40
        //patientList.stream().filter(p -> p.getAge() < 40 ).forEach(System.out::println);

        //! Print avg bill paid by corona patients
        // Double avgbill = patientList.stream().filter(p -> p.getDisease().equals("Corona")).collect(Collectors.averagingDouble(Patient::getAmount));
        // System.out.println("Avg bill paid by corona patients: "+avgbill);

    }
}
