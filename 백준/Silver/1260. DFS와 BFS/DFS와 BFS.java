import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    static int[][] arr;
    static boolean[] isVisited;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int v = Integer.parseInt(st.nextToken());

        arr = new int[n+1][n+1];
        isVisited = new boolean[n+1];
        for (int i = 0; i < m; i++) {
            StringTokenizer points = new StringTokenizer(br.readLine());
            int x = Integer.parseInt(points.nextToken());
            int y = Integer.parseInt(points.nextToken());
            arr[x][y] = arr[y][x] = 1;
        }

        DFS(v);
        isVisited = new boolean[n+1];
        System.out.println();
        BFS(v);
    }

    public static void DFS(int number){

        if( isVisited[number] ){
            return;
        }

        isVisited[number] = true;
        System.out.print(number + " ");
        for (int i = 1; i < arr.length; i++) {
            if( i != number && arr[number][i] == 1 ){
                DFS(i);
            }
        }
    }

    public static void BFS(int number){
        Queue<Integer> queue = new LinkedList<>();
        queue.add(number);

        while (!queue.isEmpty()){
            int no = queue.poll();
            if( isVisited[no] ){
                continue;
            }

            isVisited[no] = true;
            System.out.print(no + " ");
            for (int i = 1; i < arr.length; i++) {
                if( i != no && arr[no][i] == 1 ){
                    queue.add(i);
                }
            }
        }
    }
}