import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    static int[][] arr;
    static boolean[][] isVisited;
    static int[][] location = {{-1, 0}, {0, 1}, {1, 0}, {0, -1}};
    static List<int[]> virusLocation = new ArrayList<>();
    static int max = Integer.MIN_VALUE;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        arr = new int[n][m];
        isVisited = new boolean[n][m];
        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < m; j++) {
                arr[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        DFS(0);
        System.out.println(max);
    }

    public static void DFS(int depth){
        if( depth == 3 ){
            max = Math.max(max, BFS());
            return;
        }

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if( arr[i][j] == 0 ){
                    arr[i][j] = 1;
                    DFS(depth+1);
                    arr[i][j] = 0;
                }
            }
        }
    }

    public static int BFS(){
        int[][] cArr = new int[arr.length][arr[0].length];
        for (int i = 0; i < arr.length; i++) {
            cArr[i] = arr[i].clone();
        }

        Queue<int[]> queue = new LinkedList<>();

        for (int i = 0; i < cArr.length; i++) {
            for (int j = 0; j < cArr[i].length; j++) {
                if( cArr[i][j] == 2 ){
                    queue.add(new int[]{i, j});
                }
            }
        }
        while (!queue.isEmpty()){
            int[] xy = queue.poll();

            for (int i = 0; i < location.length; i++) {
                int[] mXY = location[i];
                int mX = xy[0] + mXY[0];
                int mY = xy[1] + mXY[1];
                if( mX >= 0 && mX < arr.length && mY >= 0 && mY < arr[0].length ){
                    if( cArr[mX][mY] == 0 ){
                        queue.add(new int[]{mX, mY});
                        cArr[mX][mY] = 2;
                    }
                }
            }
        }

        int count = 0;
        for (int i = 0; i < cArr.length; i++) {
            for (int j = 0; j < cArr[i].length; j++) {
                if( cArr[i][j] == 0 ){
                    count++;
                }
            }
        }

        return count;
    }
}