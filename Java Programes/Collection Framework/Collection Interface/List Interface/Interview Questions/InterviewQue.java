import java.util.ArrayList;
import java.util.List;

public class InterviewQue {
    public static void main(String[] args) {
        //!Question 1
        System.out.println("Question 1");
        List<Employee> employees = new ArrayList<>();

        Employee emp1 = new Employee(1, "Mack", 26);
        Employee emp2 = new Employee(2, "Rutu", 25);
        Employee emp3 = new Employee(3, "Sagar", 27);
        
        employees.add(emp1);
        employees.add(emp2);
        employees.add(emp3);

        emp2.setName("Shridhar"); // Modifying the name of emp2

        System.out.println("Employee name: "+employees.get(1).getName());

        /* 
        Output is Employee name: Shridhar why?
            Because emp2 reference is stored in the list, so any changes made to emp2 will be reflected in the list. 
        */

        //!Question 2
        System.out.println("Question 2");
        List<String> names = new ArrayList<>();

        String name = "Jack";
        names.add(name);
        name = "Rutu"; // Reassigning name to a new String object

        System.out.println("Name: "+names.get(0));
        
        System.out.println("Reassigned Name: "+name);

        /*
        Output is Name: Jack why?
            Because String is immutable in Java, when we reassign name to "Rutu",
            it creates a new String object and does not affect the original String "Jack" stored in the list.
        */

    }
}
