import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    static int[][] chess;
    static int[] visit;
    static int n;
    static int count = 0;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(br.readLine());
        chess = new int[n][n];
        visit = new int[n];
        nQueen(0);
        System.out.println(count);
    }

    public static void nQueen(int depth) {

        if( depth == n ){
            count++;
            return;
        }

        for (int i = 0; i < n; i++) {
            chess[depth][i] = 1;
            if( depth < 1 || ( visit[i] == 0 && diagonal(depth,i) )){
                visit[i] = 1;
                nQueen(depth+1);
                visit[i] = 0;
            }
            chess[depth][i] = 0;
        }
    }

    public static boolean diagonal(int depth, int i){
        for (int j = 1; j <= i && depth-j >= 0; j++) {
            if( chess[depth-j][i-j] == 1 ){
                return false;
            }
        }

        for (int j = 1; j < n-i && depth-j >= 0; j++) {
            if( chess[depth-j][i+j] == 1 ){
                return false;
            }
        }
        return true;
    }
}