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