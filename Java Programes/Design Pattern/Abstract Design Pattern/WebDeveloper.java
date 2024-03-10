public class WebDeveloper implements Roles {
    @Override
    public int getSalary() {
        System.out.println("Returning Web Developers Salary.");
        return 500000;
    }
}