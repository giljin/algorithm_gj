import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] peaks = new int[n+1];
        for (int i = 0; i < n; i++){
            peaks[i] = Integer.parseInt(st.nextToken());
        }
        peaks[n] = 100001;
        int start = 0;
        int max = 0;
        for (int i = 1; i < n+1; i++) {
            if( peaks[start] < peaks[i] ){
                max = Math.max(max, i-1-start);
                start = i;
            }
        }
        System.out.println(max);
    }
}
