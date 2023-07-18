package Lesson4.CreditCard;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        CreditCardService service = new CreditCardService();

        CreditCard cc1 = new CreditCard("1234 4321 5678 8765", 0f);
        CreditCard cc2 = new CreditCard("4321 5678 8765 1234", 450f);
        CreditCard cc3 = new CreditCard("4321 1234 5678 8765", 1500f);

        service.addMoney(cc1, 234f);
        service.addMoney(cc2, 359f);
        service.withDrawMoney(cc3, 1200f);

        service.getInfo(cc1);
        service.getInfo(cc2);
        service.getInfo(cc3);
    }
}
