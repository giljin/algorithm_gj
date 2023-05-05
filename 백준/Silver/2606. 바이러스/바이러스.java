import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {


    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int count = 0;
        int[][] nums = new int[n+1][n+1];
        boolean[] visit = new boolean[n+1];
        visit[1] = true;
        int m = Integer.parseInt(br.readLine());
        for (int i = 0; i < m; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            nums[a][b] = nums[b][a] = 1;
        }

        Queue<Integer> queue = new LinkedList<>();
        for (int i = 1; i <= n; i++) {
            if( nums[1][i] == 1 || nums[i][1] == 1 ){
                queue.add(i);
                visit[i] = true;
            }
        }

        while (!queue.isEmpty()){
            int num = queue.poll();
            count++;
            for (int i = 1; i <= n; i++) {
                if( (nums[num][i] == 1 || nums[i][num] == 1) && !visit[i] ){
                    queue.add(i);
                    visit[i] = true;
                }
            }
        }
        System.out.println(count);
    }
}
