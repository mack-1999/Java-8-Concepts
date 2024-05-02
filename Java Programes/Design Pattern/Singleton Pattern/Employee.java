public class Employee {
    //! 1. Private variable of class type
    private static Employee employee;

    //! 2. Private Constructor
    private Employee() {}

    //! 3. Static Method which helps to create Single Object
    // Lazy way of creating Single Object
    public static Employee getEmployee(){
        if(employee == null){
            // Synchronized block for thread safety
            synchronized(Employee.class){
                if(employee == null){
                    employee = new Employee();
                }
            }
        }
        return employee;
    }
}