import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    static int[] dx = {0,1,0,-1};
    static int[] dy = {1,0,-1,0};

    static boolean[][] visited;
    static int[][] map;
    static int n,m;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());

        for (int i = 0; i < t; i++) {
            String[] nmk = br.readLine().split(" ");
            m = Integer.parseInt(nmk[0]);
            n = Integer.parseInt(nmk[1]);
            int k = Integer.parseInt(nmk[2]);
            map = new int[n][m];
            visited = new boolean[n][m];

            List<int[]> locations = new ArrayList<>();
            for (int j = 0; j < k; j++) {
                // "x y"
                String[] xy = br.readLine().split(" ");
                int[] location = {Integer.parseInt(xy[0]), Integer.parseInt(xy[1])};
                locations.add(location);
                map[location[1]][location[0]] = 1;
            }

            int count = 0;
            for (int[] location : locations){
                int x = location[0];
                int y = location[1];
                if( !visited[y][x] ){
                    BFS(y, x);
                    count++;
                }
            }
            System.out.println(count);
        }

    }
    public static void BFS(int y, int x){
        Queue<int[]> queue = new LinkedList<>();
        queue.offer(new int[]{y,x});
        visited[y][x] = true;
        while (!queue.isEmpty()){
            int[] now = queue.poll();
            for (int k = 0; k < 4; k++) {
                int gx = now[1] + dx[k];
                int gy = now[0] + dy[k];
                if( gx >= 0 && gx < m && gy >= 0 && gy < n ){
                    if( !visited[gy][gx] && map[gy][gx] == 1 ){
                        visited[gy][gx] = true;
                        queue.add(new int[]{gy,gx});
                    }
                }
            }
        }
    }
}