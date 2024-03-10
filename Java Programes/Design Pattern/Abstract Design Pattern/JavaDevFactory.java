public class JavaDevFactory extends EmployeeAbstractFactory{
    @Override
    public Roles createEmployee() {
        return new JavaDeveloper();
    }
}