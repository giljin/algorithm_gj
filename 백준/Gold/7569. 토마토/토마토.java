import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    static int[] dx = {0, 1, 0, -1, 0, 0};
    static int[] dy = {-1, 0, 1, 0, 0, 0};
    static int[] dz = {0, 0, 0, 0, 1, -1};

    static int x, y, z;
    static boolean[][][] visited;
    static int[][][] box;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        x = Integer.parseInt(st.nextToken());
        y = Integer.parseInt(st.nextToken());
        z = Integer.parseInt(st.nextToken());

        visited = new boolean[z][y][z];
        box = new int[z][y][x];

        for (int i = 0; i < z; i++) {
            for (int j = 0; j < y; j++) {
                st = new StringTokenizer(br.readLine());
                for (int k = 0; k < x; k++) {
                    box[i][j][k] = Integer.parseInt(st.nextToken());
                }
            }
        }

        BFS();


        System.out.println(getDays());

    }
    static int getDays(){
        int max = 1;
        for (int i = 0; i < z; i++) {
            for (int j = 0; j < y; j++) {
                for (int k = 0; k < x; k++) {
                    if( box[i][j][k] == 0 ){
                        return -1;
                    }

                    max = Math.max(max, box[i][j][k]);
                }
            }
        }
        return max-1;
    }

    static void BFS(){

        Queue<int[]> queue = new LinkedList<>();
        for (int i = 0; i < z; i++) {
            for (int j = 0; j < y; j++) {
                for (int k = 0; k < x; k++) {
                    if( box[i][j][k] == 1 ){
                        queue.add(new int[]{i,j,k});
                    }
                }
            }
        }

        while (!queue.isEmpty()){
            int[] location = queue.poll();

            for (int i = 0; i < 6; i++) {
                int mZ = location[0] + dz[i];
                int mY = location[1] + dy[i];
                int mX = location[2] + dx[i];
                if( mZ >= 0 && mZ < z && mY >= 0 && mY < y && mX >= 0 && mX < x){
                    if( box[mZ][mY][mX] == 0 ){
                        box[mZ][mY][mX] = box[location[0]][location[1]][location[2]] + 1;
                        queue.add(new int[]{mZ, mY, mX});
                    }
                }
            }
        }
    }

}
