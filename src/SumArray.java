public class SumArray {
    public static void main(String[] args) {
        int a[][] = {{6, 7, 2}, {3, 4, 5}};
        int sum = 0;
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) sum += a[i][j];
        }
        System.out.println(sum);
    }
}
