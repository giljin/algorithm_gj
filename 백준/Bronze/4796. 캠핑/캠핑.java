import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int i = 1;

        while (true){
            StringTokenizer st = new StringTokenizer(br.readLine());
            int L = Integer.parseInt(st.nextToken());
            int P = Integer.parseInt(st.nextToken());
            int V = Integer.parseInt(st.nextToken());
            if(L+P+V == 0){
                break;
            }
            int days = Math.min(L,V % P) + (V / P * L);
            sb.append("Case ")
                    .append(i)
                    .append(": ")
                    .append(days)
                    .append("\n");
            i++;
        }
        System.out.println(sb);
    }
}