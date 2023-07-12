package Lesson3;

public class Diagonal {
    public static void main(String[] args) {
        int arr[][] = {{8, 2, 4}, {5, 1, 7,}, {9, 3, 6}};
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (i == j)
                    System.out.println(arr[i][j]);
            }
        }

    }
}
