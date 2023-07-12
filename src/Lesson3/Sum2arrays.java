package Lesson3;

import java.util.Arrays;

public class Sum2arrays {
    public static void main(String[] args) {
        int arr1[] = {1, 3, 5, 7, 9};
        int arr2[] = {2, 4, 6, 8, 10};
        int sum = 0;
        int sum1 = 0;
        for (int a1 : arr1) {
            System.out.print(a1 + " ");
            sum += a1;
        }
        System.out.println();
        for (int b1 : arr2) {
            System.out.print(b1 + " ");
            sum1 += b1;
        }
        int a2 = sum / arr1.length;
        int b2 = sum1 / arr2.length;
        if (a2 > b2)
            System.out.println("\nArrays arithmetic value " + Arrays.toString(arr1) + " > " + Arrays.toString(arr2));
        else if (a2 < b2)
            System.out.println("\nArrays arithmetic value " + Arrays.toString(arr1) + " < " + Arrays.toString(arr2));
        else
            System.out.println("\nArrays arithmetic value equal");

        System.out.println("\nArithmetic value:\n1 array - " + sum / arr1.length + "\n2 array - " + sum1 / arr2.length);


    }
}
