import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
import java.util.stream.Collectors;

public class Main {

    static int[] dx = {0, 1, 0, -1};
    static int[] dy = {-1, 0, 1, 0};
    static int[][] map;
    static boolean[][] visited;
    static TreeMap<Integer, Integer> groups = new TreeMap<>();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        map = new int[n][n];
        visited = new boolean[n][n];

        for (int i = 0; i < n; i++) {
            String[] row = br.readLine().split("");
            for (int j = 0; j < row.length; j++) {
                map[i][j] = Integer.parseInt(row[j]);
            }
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if(!visited[i][j] && map[i][j] == 1){
                    DFS(i,j, 0);
                }
            }
        }
        System.out.println(groups.size());
        groups.values().stream().sorted().forEach(
                s -> System.out.println( s==0 ? 1 : s)
        );

    }
    public static void DFS(int y, int x, int depth){

        if( depth == 0 ){
            groups.put(groups.size()+1, 0);
        }

        for (int i = 0; i < 4; i++) {
            int gy = y + dy[i];
            int gx = x + dx[i];

            if(gx >= 0 && gx < map.length && gy >= 0 && gy < map.length){
                if( !visited[gy][gx] ){
                    visited[gy][gx] = true;
                    if( map[gy][gx] == 1 ){
                        groups.put(groups.size(), groups.get(groups.size())+1);
                        DFS(gy, gx, depth+1);
                    }
                }
            }
        }
    }

}
