import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());


        while (t-- > 0){
            String[] nm = br.readLine().split(" ");
            int n = Integer.parseInt(nm[0]);
            int m = Integer.parseInt(nm[1]);

            int[] queue = new int[n];
            StringTokenizer st = new StringTokenizer(br.readLine());
            for (int i = 0; i < n; i++) {
                queue[i] = Integer.parseInt(st.nextToken());
            }

            int index = 0;
            int rank = 1;
            while (true){
                boolean isPrint = true;
                for (int i = 0; i < n; i++) {
                    if( queue[index] < queue[i] ){
                        isPrint = false;
                        break;
                    }
                }

                if( isPrint ){
                    queue[index] = 0;
                    if( index == m ){
                        System.out.println(rank);
                        break;
                    }
                    rank++;
                }

                index++;
                if( index > n-1 ){
                    index = 0;
                }
            }
        }
    }
}