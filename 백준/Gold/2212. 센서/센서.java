import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int k = Integer.parseInt(br.readLine());

        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] sensors = new int[n];
        for (int i = 0; i < sensors.length; i++) {
            sensors[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(sensors);

        int[] diff = new int[n-1];
        for (int i = 0; i < n-1; i++) {
            diff[i] = sensors[i+1] - sensors[i];
        }

        Arrays.sort(diff);

        int sum = 0;
        for (int i = 0; i < n-k; i++) {
            sum += diff[i];
        }
        System.out.println(sum);

    }
}