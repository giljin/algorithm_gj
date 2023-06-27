import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < t; i++) {
            int n = Integer.parseInt(br.readLine());
            String[] prices = br.readLine().split(" ");

            long result = 0;
            long max = 0;
            for (int j = n-1; j >= 0; j--) {
                long currentPrice = Long.parseLong(prices[j]);
                if( currentPrice > max ){
                    max = currentPrice;
                }else{
                    result += max - currentPrice;
                }
            }
            sb.append(result).append("\n");
        }
        System.out.println(sb);
    }
}