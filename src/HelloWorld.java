import java.util.Scanner;

public class HelloWorld
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Name:");
        String name = sc.next();
        System.out.println("Hello " + name);
    }
}
