import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {

    static int[][] arr;
    static boolean[] visited;
    static int N;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        arr = new int[N+1][N+1];
        visited = new boolean[N+1];
        int M = Integer.parseInt(st.nextToken());
        for (int i = 0; i < M; i++) {
            StringTokenizer nodeString = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(nodeString.nextToken());
            int b = Integer.parseInt(nodeString.nextToken());
            arr[a][b] = arr[b][a] = 1;
        }

        int count = 0;
        for (int i = 1; i < N+1; i++) {
            if( !visited[i] ){
                DFS(i);
                count++;
            }
        }
        System.out.println(count);
    }

    public static void DFS(int i){
        if( visited[i] ){
            return;
        }
        visited[i] = true;
        for (int j = 1; j < N+1; j++) {
            if( arr[i][j] == 1 ){
                DFS(j);
            }
        }
    }
}