import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    static int[] dx = {0,1,0,-1};
    static int[] dy = {1,0,-1,0};
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int M = Integer.parseInt(st.nextToken());
        int N = Integer.parseInt(st.nextToken());

        Queue<int[]> queue = new LinkedList<>();
        int[][] map  = new int[N][M];
        boolean[][] visited = new boolean[N][M];
        for (int i = 0; i < N; i++) {
            StringTokenizer row = new StringTokenizer(br.readLine());
            for (int j = 0; j < M; j++){
                int tomato = Integer.parseInt(row.nextToken());
                map[i][j] = tomato;
                if( tomato == 1 ){
                    queue.add(new int[]{i,j});
                }
            }
        }

        while (!queue.isEmpty()){
            int[] location = queue.poll();
            for (int i = 0; i < 4; i++) {
                int x = location[1] + dx[i];
                int y = location[0] + dy[i];
                if( x >= 0 && x < M && y >= 0 && y < N ){
                    if( map[y][x] == 0 && !visited[y][x] ){
                        visited[y][x] = true;
                        map[y][x] = map[location[0]][location[1]] + 1;
                        queue.add(new int[]{y, x});
                    }
                }
            }
        }

        int max = Integer.MIN_VALUE;
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                if( map[i][j] == 0 ){
                    System.out.println(-1);
                    return;
                }
                max = Math.max(max, map[i][j]);
            }
        }
        System.out.println(max-1);
    }
}