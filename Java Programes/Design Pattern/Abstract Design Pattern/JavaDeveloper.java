//! Subclass
public class JavaDeveloper implements Roles {
    @Override
    public int getSalary() {
        System.out.println("Returning Java Developers Salary.");
        return 800000;
    }
}