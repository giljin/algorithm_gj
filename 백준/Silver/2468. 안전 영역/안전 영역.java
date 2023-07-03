import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {

    static int n;
    static int[][] arr;
    static boolean[][] visited;
    static int[] dx = {0, 1, 0, -1};
    static int[] dy = {-1, 0, 1, 0};
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(br.readLine());

        int max = 0;
        arr = new int[n][n];
        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            for (int j = 0; j < n; j++) {
                arr[i][j] = Integer.parseInt(st.nextToken());
                max = Math.max(max, arr[i][j]);
            }
        }

        int result = 0;
        for (int i = 0; i <= max; i++) {
            visited = new boolean[n][n];
            int count = 0;
            for (int j = 0; j < n; j++) {
                for (int k = 0; k < n; k++) {
                    if( arr[j][k] > i && !visited[j][k] ){
                        DFS(i, new int[]{j, k});
                        count++;
                    }
                }
            }
            result = Math.max(result, count);
        }
        System.out.println(result);
    }

    public static void DFS(int water, int[] location){

        visited[location[0]][location[1]] = true;

        for (int i = 0; i < 4; i++) {
            int mx = location[1] + dx[i];
            int my = location[0] + dy[i];
            if( mx >= 0 && mx < n && my >= 0 && my < n){
                if( arr[my][mx] > water && !visited[my][mx] ){
                    DFS(water, new int[]{my, mx});
                }
            }
        }
    }

}