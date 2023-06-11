import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        int[] scores = new int[n];
        for (int i = 0; i < n; i++) {
            scores[i] = Integer.parseInt(br.readLine());
        }

        int count = 0;
        for (int i = n-1; i > 0; i--) {
            if( scores[i] <= scores[i-1] ){
                int diffScore = (scores[i - 1]) - (scores[i] - 1);
                count += diffScore;
                scores[i-1] -= diffScore;
            }
        }
        System.out.println(count);
    }
}
