import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] input = br.readLine().split(" ");
        int n = Integer.parseInt(input[0]);
        int m = Integer.parseInt(input[1]);
        Map<String, Integer> map = new HashMap<>();
        String[] arr = new String[n];
        for (int i = 0; i < n; i++) {
            String name = br.readLine();
            map.put(name, i+1);
            arr[i] = name;
        }

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < m; i++) {
            String search = br.readLine();
            Integer rank = map.get(search);
            sb.append(rank == null ? arr[Integer.parseInt(search)-1] : rank).append("\n");
        }
        System.out.println(sb);
    }

}