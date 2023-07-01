import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    static int[] dx = {0, 1, 0, -1};
    static int[] dy = {-1, 0, 1, 0};
    static boolean[][] visited;
    static int n;
    static char[][] RGB;
    static char[][] cRGB;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(br.readLine());

        visited = new boolean[n][n];

        RGB = new char[n][n];
        cRGB = new char[n][n];
        for (int i = 0; i < n; i++) {
            String line = br.readLine();
            RGB[i] = line.toCharArray();
            cRGB[i] = line.replaceAll("R", "G").toCharArray();
        }

        int result = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                result += BFS(i, j, RGB[i][j]);
            }
        }
        System.out.println(result);

        visited = new boolean[n][n];
        result = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                result += cBFS(i, j, cRGB[i][j]);
            }
        }
        System.out.println(result);
    }

    public static int BFS(int i, int j, char color){
        if( visited[i][j] ){
            return 0;
        }

        Queue<int[]> queue = new LinkedList<>();
        queue.add(new int[]{i, j});

        while (!queue.isEmpty()){
            int[] location = queue.poll();

            for (int k = 0; k < 4; k++) {
                int mX = location[0] + dx[k];
                int mY = location[1] + dy[k];
                if( mX >= 0 && mY >= 0 && mX < n && mY < n ){
                    if( !visited[mX][mY] && RGB[mX][mY] == color ){
                        visited[mX][mY] = true;
                        queue.add(new int[]{mX, mY});
                    }
                }
            }
        }

        return 1;
    }

    public static int cBFS(int i, int j, char color){
        if( visited[i][j] ){
            return 0;
        }

        Queue<int[]> queue = new LinkedList<>();
        queue.add(new int[]{i, j});

        while (!queue.isEmpty()){
            int[] location = queue.poll();

            for (int k = 0; k < 4; k++) {
                int mX = location[0] + dx[k];
                int mY = location[1] + dy[k];
                if( mX >= 0 && mY >= 0 && mX < n && mY < n ){
                    if( !visited[mX][mY] && cRGB[mX][mY] == color ){
                        visited[mX][mY] = true;
                        queue.add(new int[]{mX, mY});
                    }
                }
            }
        }

        return 1;
    }

}
