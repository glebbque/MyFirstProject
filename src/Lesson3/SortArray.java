package Lesson3;

import java.util.Arrays;

public class SortArray {
    public static void main(String[] args) {
        int arr[][] = {{8, 2, 4}, {5, 1, 7,}, {9, 3, 6}};
        for (int i = 0; i < arr.length; i++) {
            Arrays.sort(arr[i]);
            System.out.println(Arrays.toString(arr[i]));
        }
    }
}
