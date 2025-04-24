class Student {
    String name;
    int age;

    // Regular constructor
    Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Copy constructor
    Student(Student s) {
        this.name = s.name;
        this.age = s.age;
    }
}

public class CopyConstructor {
    public static void main(String[] args) {
        Student s1 = new Student("John", 25);
        Student s2 = new Student(s1);  // Using copy constructor

        //s2.name = "Jack"; // Change in s2 won't affect s1
        System.out.println(s2.name + " " + s2.age); // John 25
    }
}
