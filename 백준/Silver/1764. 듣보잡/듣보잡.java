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

        TreeSet<String> set = new TreeSet<>();
        for (int i = 0; i < n; i++) {
            set.add(br.readLine());
        }

        TreeSet<String> result = new TreeSet<>(Comparator.naturalOrder());
        for (int i = 0; i < m; i++) {
            String value = br.readLine();
            if( set.contains(value) ){
                result.add(value);
            }
        }
        System.out.println(result.size());
        StringBuilder sb = new StringBuilder();
        for (String name : result){
            sb.append(name).append("\n");
        }
        System.out.println(sb);

    }

}