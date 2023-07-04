import java.util.Scanner;

public class EvenOdd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number:");
        int num = sc.nextInt();
        if (num % 2 == 1) {
            System.out.println(num + " - Odd number");
        } else {
            System.out.println(num + " - Even number");
        }

    }
}
