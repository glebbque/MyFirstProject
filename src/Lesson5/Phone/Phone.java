package Lesson5.Phone;


import java.util.Arrays;

public class Phone {
    private String number;
    private String model;
    private double weight;


    public Phone(String number, String model, double weight) {
        this.number = number;
        this.model = model;
        this.weight = weight;
    }

    public Phone(String number, String model) {
        this.number = number;
        this.model = model;
    }

    public Phone() {
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public void getInfo(String number, String model, double weight) {
        System.out.println("Account number: " + getNumber());
        System.out.println("Model phone: " + getModel());
        System.out.println("Weight phone: " + getWeight());
    }

    public void receiveCall(String name) {
        System.out.println("Calling " + name);
    }

    public void receiveCall(String name, String number) {
        System.out.println("Calling " + name + " with number " + number);
    }

    public void sendMessage(String... numbers) {
        System.out.println(Arrays.toString(numbers));
    }
}
