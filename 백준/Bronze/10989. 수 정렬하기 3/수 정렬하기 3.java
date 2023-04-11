import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[10001];
        for (int i = 0; i < n; i++) {
            arr[Integer.parseInt(br.readLine())]++;
        }

        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < arr.length; i++) {
            while ( arr[i]-- > 0 ){
                builder.append(i).append("\n");
            }
        }
        System.out.println(builder);
    }

}