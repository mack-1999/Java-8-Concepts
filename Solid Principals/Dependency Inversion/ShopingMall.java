public class ShopingMall {
    //private DebitCard debitCard;
    //private CreditCard creditCard;

    private CardManager cardManager;

    public ShopingMall(CardManager cardManager) {
        this.cardManager = cardManager;
    }

    public void doPurchase(long amount){
        cardManager.doTransaction(amount);
    }

    public static void main(String[] args) {
        CardManager cardManager = new DebitCard();
        ShopingMall buy = new ShopingMall(cardManager);
        buy.doPurchase(5000); 
    }
}