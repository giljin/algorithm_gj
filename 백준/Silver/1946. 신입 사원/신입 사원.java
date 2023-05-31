import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        for (int i = 0; i < T; i++) {
            int N = Integer.parseInt(br.readLine());
            int[] ranks = new int[N+1];
            for (int j = 0; j < N; j++) {
                StringTokenizer st = new StringTokenizer(br.readLine());
                int documentRank = Integer.parseInt(st.nextToken());
                int interviewRank = Integer.parseInt(st.nextToken());
                ranks[documentRank] = interviewRank;
            }

            int result = 0;
            int minRank = N+1;
            for (int j = 1; j <= N; j++) {
                if( minRank > ranks[j] ){
                    minRank = ranks[j];
                    result++;
                }
            }
            System.out.println(result);
        }
    }
}