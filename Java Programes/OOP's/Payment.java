interface Payment {
    void pay();  // Abstract method
}

class CreditCardPayment implements Payment {
    public void pay() {
        System.out.println("Payment done via Credit Card");
    }
}