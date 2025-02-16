class Account {
    private double balance; // Encapsulated data

    public void deposit(double amount) {
        balance += amount; // Method accessing data
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

}

public class EncapsulationExample{
    public static void main(String[] args){
        Account account = new Account();
        account.setBalance(1000);

        System.out.println("original Balance: " + account.getBalance());

        account.deposit(200); // Desposited 200

        System.out.println("Updated balance:" + account.getBalance());
    }
}

//? Encapsulation is the process of wrapping data (variables) and methods (functions) into a single unit (class) and restricting direct access to some components using access modifiers (private, protected, public).