public class Client {
    public static void main(String[] args) {
        //! Advantage of Factory Design Pattern: loose Coupling & Robust code
        JobRoles obj1 = JobRolesFactory.getRole("Software Engineer");
        System.out.println("Salary for Software Engineer: "+ obj1.getSalary());

        JobRoles obj2 = JobRolesFactory.getRole("Manager");
        System.out.println("Salary for Manager: "+ obj2.getSalary());
    }
}
