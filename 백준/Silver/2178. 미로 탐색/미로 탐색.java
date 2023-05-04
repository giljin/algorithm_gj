import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    static int[] dx = {0,1,0,-1};
    static int[] dy = {1,0,-1,0};
    static boolean[][] visited;
    static int[][] miro;
    static int n,m;
    
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] nm = br.readLine().split(" ");
        n = Integer.parseInt(nm[0]);
        m = Integer.parseInt(nm[1]);
        miro = new int[n][m];
        visited = new boolean[n][m];

        for (int i = 0; i < n; i++) {
            String row = br.readLine();
            for (int j = 0; j < m; j++) {
                miro[i][j] = row.charAt(j)-48;
            }
        }
        BFS(0,0);
        System.out.println(miro[n-1][m-1]);
    }
    public static void BFS(int i, int j){
        Queue<int[]> queue = new LinkedList<>();
        queue.offer(new int[]{i,j});
        visited[i][j] = true;
        while (!queue.isEmpty()){
            int[] now = queue.poll();
            for (int k = 0; k < 4; k++) {
                int x = now[0] + dx[k];
                int y = now[1] + dy[k];
                if( x >= 0 && x < n && y >= 0 && y < m ){
                    if( miro[x][y] != 0 && !visited[x][y] ){
                        visited[x][y] = true;
                        miro[x][y] = miro[now[0]][now[1]] + 1;
                        queue.add(new int[]{x,y});
                    }
                }
            }
        }
    }
}