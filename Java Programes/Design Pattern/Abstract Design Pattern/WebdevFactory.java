public class WebdevFactory extends EmployeeAbstractFactory {
    @Override
    public Roles createEmployee() {
        return new WebDeveloper();
    }
}