import java.util.Scanner;

public class Temperature {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter temperature:");
        int t = sc.nextInt();
        if (t > 5) {
            System.out.println("Тепло");
        } else if (t <= 5 && t > -20) {
            System.out.println("Нормально");
        } else {
            System.out.println("Холодно");
        }
    }
}
