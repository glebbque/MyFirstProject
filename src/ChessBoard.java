public class ChessBoard {
    public static void main(String[] args) {
        String cb[][] = new String[8][8];
        for (int i = 0; i < cb.length; i++) {
            for (int j = 0; j < cb[i].length; j++) {
                if ((i + j) % 2 == 0) cb[i][j] = "W";
                else cb[i][j] = "B";
                System.out.println(cb[i][j]);

            }
        }
    }
}
