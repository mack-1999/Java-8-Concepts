public class VarArgs {
  public static void printNames(String name, String... otherNames) {
    System.out.println("Main name: " + name);
    for (String otherName : otherNames) {
      System.out.println("Other name: " + otherName);
    }
  }

  public static void main(String[] args) {
    printNames("Mack");
    printNames("Rutu", "Jack", "Joy");
  }
}