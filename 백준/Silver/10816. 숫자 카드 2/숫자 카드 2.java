import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        TreeMap<String, Integer> map = new TreeMap<>();
        for (int i = 0; i < n; i++) {
            String card = st.nextToken();
            Integer count = map.get(card);
            if( count == null ){
                map.put(card, 1);
            }else{
                map.put(card, count+1);
            }
        }

        int m = Integer.parseInt(br.readLine());
        StringTokenizer st2 = new StringTokenizer(br.readLine(), " ");
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < m; i++) {
            Integer count = map.get(st2.nextToken());
            sb.append(count== null ? 0 : count).append(" ");
        }
        System.out.println(sb);

    }

}