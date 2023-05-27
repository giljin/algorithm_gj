import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[] distances = new int[N-1];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < distances.length; i++) {
            distances[i] = Integer.parseInt(st.nextToken());
        }

        int[] prices = new int[N];
        StringTokenizer priceTokens = new StringTokenizer(br.readLine());
        for (int i = 0; i < prices.length; i++) {
            prices[i] = Integer.parseInt(priceTokens.nextToken());
        }

        long result = distances[0] * prices[0];
        long minPrice = prices[0];
        for (int i = 1; i <prices.length-1; i++) {
            if (minPrice > prices[i]){
                minPrice = prices[i];
            }
            result += minPrice * distances[i];
        }

        System.out.println(result);
    }
}
