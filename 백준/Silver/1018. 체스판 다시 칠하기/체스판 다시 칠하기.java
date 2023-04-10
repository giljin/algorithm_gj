import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] nm = sc.nextLine().split( " ");
        int n = Integer.parseInt(nm[0]);
        int m = Integer.parseInt(nm[1]);

        String[][] board = new String[n][m];
        for (int i = 0; i < n; i++) {
            String line = sc.nextLine();
            for (int j = 0; j < m; j++) {
                board[i][j] = line.charAt(j) + "";
            }
        }

        int min = Integer.MAX_VALUE;
        for (int i = 0; i <= n-8; i++) {
            for (int j = 0; j <= m-8; j++) {
                int count = 0;

                String startChar = board[i][j];
                for (int k = i; k < i+8; k++) {
                    for (int l = j; l < j+8; l++) {
                        if( l % 2 == j % 2 ){
                            if( !startChar.equals(board[k][l]) ){
                                count++;
                            }
                        }else{
                            if( startChar.equals(board[k][l]) ){
                                count++;
                            }
                        }
                    }
                    if( startChar.equals("W") ){
                        startChar = "B";
                    }else{
                        startChar = "W";
                    }
                }

                count = Math.min(count, 64-count);
                if( min > count ){
                    min = count;
                }
            }
        }

        System.out.println(min);
    }

}