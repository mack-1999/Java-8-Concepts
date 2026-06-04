class Employee implements Comparable<Employee> {

    int id;
    String name;

    Employee(int i, String n) {
        this.id = i;
        this.name = n;
    }

    @Override
    public int compareTo(Employee e) {
        return this.name.compareTo(e.name);
    }

}