import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] nm = br.readLine().split(" ");
        int n = Integer.parseInt(nm[0]);
        int m = Integer.parseInt(nm[1]);

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        Set<String> set = new HashSet<>();
        for (int i = 0; i < n; i++) {
            set.add(st.nextToken());
        }

        st = new StringTokenizer(br.readLine(), " ");
        int count = 0;
        for (int i = 0; i < m; i++) {
            if( !set.add(st.nextToken()) ){
                count++;
            }
        }
        System.out.println(set.size() - count);

    }

}