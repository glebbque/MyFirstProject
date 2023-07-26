package Lesson5.Phone;

import static Lesson5.Phone.Phone.*;

public class Main {
    public static void main(String[] args) {

        Phone ph1 = new Phone("3211299", "Mi", 72f);
        Phone ph2 = new Phone("9871234", "Samsung", 70f);
        Phone ph3 = new Phone("4532378", "iPhone", 88f);

        System.out.println(ph1.getNumber());
        System.out.println(ph1.getModel());
        System.out.println(ph1.getWeight());
        System.out.println();

        System.out.println(ph2.getNumber());
        System.out.println(ph2.getModel());
        System.out.println(ph2.getWeight());
        System.out.println();

        System.out.println(ph3.getNumber());
        System.out.println(ph3.getModel());
        System.out.println(ph3.getWeight());
        System.out.println();

        ph1.receiveCall("Slava");
        ph2.receiveCall("Katya");
        ph3.receiveCall("Roman");
        ph3.receiveCall("Petya", "3226441");

        ph1.sendMessage("324324234", "234234234", "342342356");
        ph2.sendMessage("234543654");
    }
}
