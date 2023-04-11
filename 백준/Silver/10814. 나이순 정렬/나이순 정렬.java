import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        String[] arr = new String[n];
        for (int i = 0; i < n; i++) {
            arr[i] = br.readLine();
        }

        Arrays.sort(arr, (a, b) -> {
            String[] a1 = a.split(" ");
            String[] b1 = b.split(" ");
            if( !a1[0].equals(b1[0]) ){
                return Integer.parseInt(a1[0]) - Integer.parseInt(b1[0]);
            }
            return 0;
        });

        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }

}