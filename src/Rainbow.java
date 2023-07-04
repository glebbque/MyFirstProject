import java.util.Scanner;

public class Rainbow {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number 1 to 7:");
        String num = sc.next();
        switch (num) {
            case "1":
                System.out.println("Red");
                break;
            case "2":
                System.out.println("Orange");
                break;
            case "3":
                System.out.println("Yellow");
                break;
            case "4":
                System.out.println("Green");
                break;
            case "5":
                System.out.println("Blue");
                break;
            case "6":
                System.out.println("Indigo");
                break;
            case "7":
                System.out.println("Violet");
                break;
            default:
                System.out.println("Wrong data");
        }

    }
}
