public class User {
    public static void main(String[] args) {
        Roles emp = EmployeeFactory.getEmployee(new WebdevFactory());
        System.out.println("Salary for Web Developer: "+emp.getSalary());

        Roles emp2 = EmployeeFactory.getEmployee(new JavaDevFactory());
        System.out.println("Salary for Java Developer: "+emp2.getSalary());
    }
}
