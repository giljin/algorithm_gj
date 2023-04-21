import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Queue<Integer> q = new LinkedList<>();

        String[] nk = br.readLine().split(" ");
        int n = Integer.parseInt(nk[0]);
        int k = Integer.parseInt(nk[1]);

        for (int i = 1; i <= n; i++) {
            q.add(i);
        }

        StringBuilder sb = new StringBuilder();
        sb.append("<");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < k-1; j++) {
                q.add(q.poll());
            }
            sb.append(q.poll()).append(", ");
        }
        sb.delete(sb.length()-2, sb.length());
        sb.append(">");
        System.out.println(sb);
    }
}