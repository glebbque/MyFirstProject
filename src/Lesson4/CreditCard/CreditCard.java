package Lesson4.CreditCard;

public class CreditCard {
    private String id;
    private float balance;

    public CreditCard(String id, float balance) {
        this.id = id;
        this.balance = balance;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public float getBalance() {
        return balance;
    }

    public void setBalance(float balance) {
        this.balance = balance;
    }

}
