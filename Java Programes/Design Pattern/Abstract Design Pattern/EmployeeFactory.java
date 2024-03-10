public class EmployeeFactory {
    public static Roles getEmployee(EmployeeAbstractFactory factory){
        return factory.createEmployee();
    }
}
