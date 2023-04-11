import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        HashSet<String> set = new HashSet<>();
        for (int i = 0; i < n; i++) {
            set.add(br.readLine());
        }

        String[] arr = set.toArray(new String[0]);
        Arrays.sort(arr, (a, b) -> {
            if( a.length() != b.length() ){
                return a.length() - b.length();
            }
            return a.compareTo(b);
        });

        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }

}