import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        int[][] times = new int[n][2];
        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int start = Integer.parseInt(st.nextToken());
            int end = Integer.parseInt(st.nextToken());
            times[i][0] = start;
            times[i][1] = end;
        }

        Arrays.sort(times, (a1, a2)-> a1[0] == a2[0] ? a1[1]-a2[1] : a1[0]-a2[0]);

        PriorityQueue<Integer> queue = new PriorityQueue<>();
        queue.add(times[0][1]);
        for (int i = 1; i < n; i++) {
            if( queue.peek() <= times[i][0] ){
                queue.poll();
            }
            queue.add(times[i][1]);
        }
        System.out.println(queue.size());

    }
}
