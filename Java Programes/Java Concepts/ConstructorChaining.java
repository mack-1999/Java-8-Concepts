class Person {
    private String name;
    private int age;
  
    // Default constructor
    public Person() {
      this("John Doe", 28); //! Calling another constructor from the same class
    }
  
    // Parameterized constructor with name
    public Person(String name) {
      this(name, 25); //! Calling another constructor from the same class
    }
  
    // Parameterized constructor with name and age
    public Person(String name, int age) {
      this.name = name;
      this.age = age;
      System.out.println("Person created: " + name + ", " + age);
    }
  }
  
  public class ConstructorChaining extends Person {
    private String company;

    public ConstructorChaining() {
      super(); //! Calling parent class (Person) constructor
    }
  
    public ConstructorChaining(String name, String company) {
      super(name); //! Calling parent class (Person) constructor with name
      this.company = company;
      System.out.println("Employee created: " + name + ", " + company);
    }
  
    public static void main(String[] args) {
      Person person1 = new Person();
      Person person2 = new Person("Alice");
  
      System.out.println("Child Class Call's");
      ConstructorChaining employee1 = new ConstructorChaining();
      ConstructorChaining employee2 = new ConstructorChaining("Bob", "Tech");
    }
  }

/*
 Constructor Chaining: 
  In java is a technique where one constructor calls another constructor within the same class or the parent class.
*/