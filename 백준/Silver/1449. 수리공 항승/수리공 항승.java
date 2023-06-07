import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int l = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine());
        int[] holes = new int[n];
        for (int i = 0; i < n; i++) {
            holes[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(holes);

        int count = 1;
        int line = l - 1;
        int startHole = holes[0];
        for (int i = 1; i < n; i++) {
            int distance = holes[i] - startHole;
            if( distance <= line ){
                line -= distance;
            }else{
                count++;
                line = l - 1;
            }
            startHole = holes[i];
        }
        System.out.println(count);
    }

}