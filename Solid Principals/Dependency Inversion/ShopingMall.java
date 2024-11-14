public class ShopingMall {
    //private DebitCard debitCard;
    //private CreditCard creditCard;

    //Not tightly coupled with debit or credit card
    private CardManager cardManager;

    public ShopingMall(CardManager cardManager) {
        this.cardManager = cardManager;
    }

    public void doPurchase(long amount){
        cardManager.doTransaction(amount);
    }
    public static void main(String[] args) {
        CardManager cardManager = new CreditCard();
        ShopingMall buy = new ShopingMall(cardManager);
        buy.doPurchase(5000); 
    }
}

//! Definition: High-level modules should not depend on low-level modules. Both should depend on abstractions.