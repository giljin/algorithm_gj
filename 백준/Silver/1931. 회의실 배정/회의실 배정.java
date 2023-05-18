import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[][] times = new int[N][2];
        TreeMap<Integer, List<Integer>> room = new TreeMap<>(Comparator.naturalOrder());
        for (int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            times[i][0] = Integer.parseInt(st.nextToken());
            times[i][1] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(times, (o1, o2) -> o1[1] == o2[1] ? o1[0] - o2[0] : o1[1] - o2[1]);

        int count = 0;
        int prev_end_time = 0;
        for (int i = 0; i < N; i++) {

            if( prev_end_time <= times[i][0] ){
                prev_end_time = times[i][1];
                count++;
            }
        }
        System.out.println(count);
    }
}