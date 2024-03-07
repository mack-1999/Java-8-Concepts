public class Manager implements JobRoles {
    @Override
    public int getSalary() {
        System.out.println("Getting Salary of Manager");
        return 100000;
    }
}
