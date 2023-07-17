import java.util.Scanner;

public class Massive {
    public static void main(String[] args) {
        int a[][][] = {{{2, 5, 4}, {12, 4, 9}, {3, 6, 1}}, {{22, 3, 4}, {1, 6, 23}, {7, 23, 26}}, {{23, 1, 17}, {91, 1, 3}, {2, 4, 3}}};
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number:");
        int n = sc.nextInt();
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                for (int k = 0; k < a[j].length; k++) {
                    System.out.println(a[i][j][k] + n);
                }
            }


        }


    }
}
