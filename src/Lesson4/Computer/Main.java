package Lesson4.Computer;

public class Main {
    public static void main(String[] args) {
        Computer comp1 = new Computer(123f,"HP");
        System.out.println(comp1);
        RAM ram = new RAM("qwerty", 32f);
        HDD hdd = new HDD("asdfg", 1000f,"external");
        Computer comp2 = new Computer(1234f,"HP", ram, hdd);
        System.out.println(comp2);
    }
}
