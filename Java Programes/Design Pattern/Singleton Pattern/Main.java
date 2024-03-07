public class Main {
    public static void main(String[] args) {
        Employee emp1 = Employee.getEmployee();
        System.out.println(emp1.hashCode());

        Employee emp2 = Employee.getEmployee();
        System.out.println(emp2.hashCode());
    }
}