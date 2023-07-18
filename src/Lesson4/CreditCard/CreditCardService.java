package Lesson4.CreditCard;

public class CreditCardService {
    public void addMoney(CreditCard card, float money) {
        card.setBalance(card.getBalance() + money);
    }

    public void withDrawMoney(CreditCard card, float money) {
        card.setBalance(card.getBalance() - money);
    }

    public void getInfo(CreditCard card) {
        System.out.println("Account number: " + card.getId());
        System.out.println("Account balance: " + card.getBalance());

    }


}
