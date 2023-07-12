package Lesson3;

import java.util.Arrays;

public class Sum2arrays {
    public static void main(String[] args) {
        int a[] = {1, 3, 5, 7, 9};
        int b[] = {2, 4, 6, 8, 10};
        int sum = 0;
        int sum1 = 0;
        for (int a1 : a) {
            System.out.print(a1 + " ");
            sum += a1;
        }
        System.out.println();
        for (int b1 : b) {
            System.out.print(b1 + " ");
            sum1 += b1;
        }
        int a2 = sum / a.length;
        int b2 = sum1 / b.length;
        if (a2 > b2)
            System.out.println("\nArrays arithmetic value " + Arrays.toString(a) + " > " + Arrays.toString(b));
        else if (a2 < b2)
            System.out.println("\nArrays arithmetic value " + Arrays.toString(a) + " < " + Arrays.toString(b));
        else
            System.out.println("\nArrays arithmetic value equal");

        System.out.println("\nArithmetic value:\n1 array - " + sum / a.length + "\n2 array - " + sum1 / b.length);


    }
}
