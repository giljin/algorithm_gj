import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    static int[] output;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] nm = br.readLine().split(" ");
        int n = Integer.parseInt(nm[0]);
        int m = Integer.parseInt(nm[1]);

        output = new int[m];
        bt(1, 0, n, m);
    }

    public static void bt(int num, int depth, int n, int m) {

        if( depth >= m ){
            for (int i = 0; i < m; i++) {
                System.out.print(output[i] + " ");
            }
            System.out.println();
            return;
        }

        for (int i = num; i <= n; i++) {
            output[depth] = i;
            bt(i, depth+1, n, m);
        }
    }
}