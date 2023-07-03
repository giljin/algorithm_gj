import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {

    static int x, y;
    static int[][] arr;
    static boolean[][] visited;
    static int[] dx = {0, 1, 1, 1, 0, -1, -1, -1};
    static int[] dy = {-1, -1, 0, 1, 1, 1, 0, -1};
    static int count = 0;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        while (true){
            StringTokenizer st = new StringTokenizer(br.readLine());

            x = Integer.parseInt(st.nextToken());
            y = Integer.parseInt(st.nextToken());
            if( x == 0 && y == 0 ){
                break;
            }

            arr = new int[y][x];
            visited = new boolean[y][x];

            for (int i = 0; i < y; i++) {
                st = new StringTokenizer(br.readLine());
                for (int j = 0; j < x; j++) {
                    arr[i][j] = Integer.parseInt(st.nextToken());
                }
            }

            for (int i = 0; i < y; i++) {
                for (int j = 0; j < x; j++) {
                    if( arr[i][j] == 1 ){
                        DFS(1, new int[]{i, j});
                    }
                }
            }
            System.out.println(count);
            count = 0;
        }

    }

    public static void DFS(int depth, int[] location){

        if( visited[location[0]][location[1]] ){
            return;
        }

        visited[location[0]][location[1]] = true;
        if( depth == 1 ){
            count++;
        }

        for (int i = 0; i < 8; i++) {
            int mx = location[1] + dx[i];
            int my = location[0] + dy[i];
            if( mx >= 0 && mx < x && my >= 0 && my < y){
                if( arr[my][mx] == 1 ){
                    DFS(depth+1, new int[]{my, mx});
                }
            }
        }
    }

}