import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int M = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());
        boolean[] visited = new boolean[100001];
        Queue<int[]> queue = new LinkedList<>();
        queue.add(new int[]{M,0});
        while (!queue.isEmpty()){
            int[] num = queue.poll();
            if( num[0] == K ){
                System.out.println(num[1]);
                break;
            }
            visited[num[0]] = true;
            int mx = num[0] * 2;
            if( mx <= 100000 && !visited[mx] ){
                queue.add(new int[]{mx,num[1]+1});
            }
            mx = num[0] + 1;
            if( mx <= 100000 && !visited[mx] ){
                queue.add(new int[]{mx,num[1]+1});
            }
            mx = num[0] - 1;
            if( mx >= 0 && !visited[mx] ){
                queue.add(new int[]{mx,num[1]+1});
            }
        }
    }
}